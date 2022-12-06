package com.example.productapp_backend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue
    private int id;
    private String productCode;
    private String productName;
    private String manufDate;
    private String expDate;
    private String brand;
    private int price;
    private String sellerName;
    private String distribName;

    public Products() {
    }

    public Products(int id, String productCode, String productName, String manufDate, String expDate, String brand, int price, String sellerName, String distribName) {
        this.id = id;
        this.productCode = productCode;
        this.productName = productName;
        this.manufDate = manufDate;
        this.expDate = expDate;
        this.brand = brand;
        this.price = price;
        this.sellerName = sellerName;
        this.distribName = distribName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufDate() {
        return manufDate;
    }

    public void setManufDate(String manufDate) {
        this.manufDate = manufDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getDistribName() {
        return distribName;
    }

    public void setDistribName(String distribName) {
        this.distribName = distribName;
    }
}
