package com.gray.ecommerce.dao;

import com.gray.ecommerce.entity.Grocery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin({"http://localhost:4200",""}) // Accept calls from web browser scriptes for origin
public interface GroceryRepository extends JpaRepository<Grocery, Long> {
}
