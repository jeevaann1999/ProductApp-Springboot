package com.example.productapp_backend.controller;

import com.example.productapp_backend.dao.ProductDao;
import com.example.productapp_backend.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController
{
 @Autowired
 private ProductDao dao;
 @PostMapping("/")
 public  String HomePage(){
  return "Welcome to Product App Homepage";
 }
 @CrossOrigin(origins = "*")
 @PostMapping(path = "/productadd",consumes = "application/json",produces = "application/json")
 public String ProductAdd(@RequestBody Products p){
  System.out.println(p.getProductCode().toString());
  System.out.println(p.getProductName().toString());
  System.out.println(p.getManufDate().toString());
  System.out.println(p.getExpDate().toString());
  System.out.println(p.getBrand().toString());
  System.out.println(p.getPrice());
  System.out.println(p.getSellerName().toString());
  System.out.println(p.getDistribName().toString());
  dao.save(p);
  return "Product Added Successfully";
 }
 @PostMapping("/productsearch")
 public String ProductSearch(){
  return "Welcome to my Product Search page";
 }
 @PostMapping("/productedit")
 public  String ProductEdit(){
  return  "Welcome to my Product Edit page";
 }
 @CrossOrigin(origins = "*")
 @GetMapping("/product")
 public List<Products> ProductViewAll(){
  return (List<Products>) dao.findAll();
 }
 @PostMapping("/productdelete")
 public String ProductDelete(){
  return  "Welcome to my Product Delete page";
 }
 }


