package com.gray.ecommerce.dao;

import com.gray.ecommerce.entity.GroceryCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "groceryCategory",path="grocery-category")
// collectionResourceRel: JSON entry
public interface GroceryCategoryRepository extends JpaRepository<GroceryCategory, Long> {
}
