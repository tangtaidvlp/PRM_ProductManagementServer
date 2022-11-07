package com.prm.productmanagement.prm.repository;


import com.prm.productmanagement.prm.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "_products", path = "products")
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
