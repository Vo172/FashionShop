package com.shop.fashion.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    private int productId;
    private String productName;
    private double price;
    private String size;
    private String color;
    private int categoryId;
    private String shortDescription;
    private String description;
    private int stock;
    private String image;
    private String image01;
    private String image02;
    private String image03;
    private String image04;
    private String image05;
    private String image06;

    public Product() {
    }

    public Product(int productId, String productName, double price, String size, String color, int categoryId, String shortDescription, String description, int stock, String image, String image01, String image02, String image03, String image04, String image05, String image06) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.size = size;
        this.color = color;
        this.categoryId = categoryId;
        this.shortDescription = shortDescription;
        this.description = description;
        this.stock = stock;
        this.image = image;
        this.image01 = image01;
        this.image02 = image02;
        this.image03 = image03;
        this.image04 = image04;
        this.image05 = image05;
        this.image06 = image06;
    }

    public Product(int productId, String productName, double price, String size, String color, int categoryId, String shortDescription, String description, String image, String image01, String image02, String image03) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.size = size;
        this.color = color;
        this.categoryId = categoryId;
        this.shortDescription = shortDescription;
        this.description = description;
        this.image = image;
        this.image01 = image01;
        this.image02 = image02;
        this.image03 = image03;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage01() {
        return image01;
    }

    public void setImage01(String image01) {
        this.image01 = image01;
    }

    public String getImage02() {
        return image02;
    }

    public void setImage02(String image02) {
        this.image02 = image02;
    }

    public String getImage03() {
        return image03;
    }

    public void setImage03(String image03) {
        this.image03 = image03;
    }

    public String getImage04() {
        return image04;
    }

    public void setImage04(String image04) {
        this.image04 = image04;
    }

    public String getImage05() {
        return image05;
    }

    public void setImage05(String image05) {
        this.image05 = image05;
    }

    public String getImage06() {
        return image06;
    }

    public void setImage06(String image06) {
        this.image06 = image06;
    }
}
