package com.shop.fashion.Repository;

import com.shop.fashion.Model.Category;
import com.shop.fashion.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
