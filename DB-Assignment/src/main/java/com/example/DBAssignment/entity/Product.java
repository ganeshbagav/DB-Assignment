package com.example.DBAssignment.entity;

import java.time.LocalTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String desc;
    @Column(name = "SKU")
    private String sku;


    @ManyToOne
    @JoinColumn(name = "category_id")
    private ProductCategory category;

    

    @OneToOne
    @JoinColumn(name = "inventory_id")
    private ProductInventory inventory;

    private Float price;

    @ManyToOne
    @JoinColumn(name = "discount_id")
    private Discount discount;

    private LocalTime createdAt;
    private LocalTime modifiedAt;
    private LocalTime deletedAt;

}
