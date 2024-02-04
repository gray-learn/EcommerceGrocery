package com.gray.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;
// old javax

@Entity
@Table(name="grocery")
@Data
public class Grocery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false)
    private GroceryCategory category;

    @ManyToOne
    @JoinColumn(name = "supplier_id",nullable = false)
    private Supplies supplies;

    @Column(name="sku")
    private String sku;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="unitPrice")
    private BigDecimal unitPrice;
    @Column(name="active")
    private boolean active;
    @Column(name="unitsInStock")
    private int unitsInStock;

    @Column(name="shelfLife")
    private int shelfLife;

    @Column(name="dateCreated")
    @CreationTimestamp
    private Date dateCreated;
    @Column(name="lastUpdated")
    @UpdateTimestamp
    private Date lastUpdated;

}
