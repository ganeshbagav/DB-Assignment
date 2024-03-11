package com.example.DBAssignment.entity;

import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String desc;
    private Float discountPercent;
    private Boolean active;
    private LocalTime createdAt;
    private LocalTime modifiedAt;
    private LocalTime deletedAt;
    @OneToMany(mappedBy = "discount")
    private List<Product> products;
}
