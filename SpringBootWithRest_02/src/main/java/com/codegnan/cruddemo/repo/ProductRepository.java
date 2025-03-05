package com.codegnan.cruddemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codegnan.cruddemo.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
