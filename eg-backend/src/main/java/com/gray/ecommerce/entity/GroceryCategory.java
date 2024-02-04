package com.gray.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Entity
@Table(name = "grocery_category")
//@Data // known bug for one to many or
@Getter
@Setter
public class GroceryCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="categoryName")
    private String categoryName;

    @OneToMany(cascade =  CascadeType.ALL, mappedBy = "category")
    private Set<Grocery> groceries;
}
