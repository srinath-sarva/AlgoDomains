package com.algodomain.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algodomain.entity.Product;



@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

}
