package com.shop.fashion.Service;

import com.shop.fashion.Model.Category;
import com.shop.fashion.Model.Product;
import com.shop.fashion.Repository.CategoryRepository;
import com.shop.fashion.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;

    public List<Product> listProduct() {
        List<Product> listProduct = new ArrayList<>();
        if (repo.findAll() != null && repo.findAll().size() != 0) {
            listProduct.addAll(repo.findAll());
        } else {
            listProduct = getDataProduct();
            createAll(listProduct);
        }
        return listProduct;
    }

    public void create(Product product) {
        repo.save(product);
    }

    public void createAll(List<Product> product) {
        repo.saveAll(product);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public List<Product> getDataProduct() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Esprit Ruffle Shirt", 16.64, "S", "White", 3, "Esprit Ruffle Shirt", "Esprit Ruffle Shirt ...more", "images/product-01.jpg", "", "", ""));
        productList.add(new Product(2, "Herschel supply", 35.31, "S", "White", 3, "Herschel supply", "Herschel supply ...more", "images/product-02.jpg", "", "", ""));
        productList.add(new Product(3, "Only Check Trouser", 25.50, "S", "White", 2, "Only Check Trouser", "Only Check Trouser ...more", "images/product-03.jpg", "", "", ""));
        productList.add(new Product(4, "Classic Trench Coat", 75.00, "S", "White", 3, "Classic Trench Coat", "Classic Trench Coat ...more", "images/product-04.jpg", "", "", ""));
        productList.add(new Product(5, "Front Pocket Jumper", 34.75, "S", "White", 3, "Front Pocket Jumper", "Front Pocket Jumper ...more", "images/product-05.jpg", "", "", ""));
        productList.add(new Product(6, "Vintage Inspired Classic", 93.20, "S", "White", 6, "Vintage Inspired Classic", "Vintage Inspired Classic...more", "images/product-06.jpg", "", "", ""));
        productList.add(new Product(7, "Shirt in Stretch Cotton", 52.66, "S", "White", 3, "Shirt in Stretch Cotton", "Shirt in Stretch Cotton...more", "images/product-07.jpg", "", "", ""));
        productList.add(new Product(8, "Pieces Metallic Printed", 18.96, "S", "White", 3, " Pieces Metallic Printed", " Pieces Metallic Printed ...more", "images/product-08.jpg", "", "", ""));
        productList.add(new Product(9, "Converse All Star Hi Plimsolls", 75.00, "S", "White", 5, "Converse All Star Hi Plimsolls", "Esprit Ruffle Shirt ...more", "images/product-09.jpg", "", "", ""));
        productList.add(new Product(10, "Femme T-Shirt In Stripe", 25.85, "S", "White", 3, "Femme T-Shirt In Stripe", "Femme T-Shirt In Stripe ...more", "images/product-10.jpg", "", "", ""));
        productList.add(new Product(11, "Herschel supply", 63.16, "S", "White", 2, "Herschel supply", "Herschel supply ...more", "images/product-11.jpg", "", "", ""));
        productList.add(new Product(12, "Herschel supply", 16.64, "S", "White", 2, "Herschel supply", "Herschel supply ...more", "images/product-12.jpg", "", "", ""));
        productList.add(new Product(13, "T-Shirt with Sleeve", 36.14, "S", "White", 3, "T-Shirt with Sleeve", "T-Shirt with Sleeve ...more", "images/product-13.jpg", "", "", ""));
        productList.add(new Product(14, "Pretty Little Thing", 54.79, "S", "White", 3, "Pretty Little Thing", "Pretty Little Thing ...more", "images/product-14.jpg", "", "", ""));
        productList.add(new Product(15, "Mini Silver Mesh Watch", 16.64, "S", "White", 6, "Mini Silver Mesh Watch", "Mini Silver Mesh Watch ...more", "images/product-15.jpg", "", "", ""));
        productList.add(new Product(16, "Square Neck Back", 29.64, "S", "White", 3, "Square Neck Back", "Square Neck Back ...more", "images/product-16.jpg", "", "", ""));
        return productList;
    }

}
