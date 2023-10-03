package com.example.livraria.repositories;

import com.example.livraria.domain.products.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}