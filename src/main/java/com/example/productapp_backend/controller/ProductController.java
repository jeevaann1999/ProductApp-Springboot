package com.example.productapp_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController
{
 @PostMapping("/")
 public  String HomePage(){
  return "Wlcome to Product App Homepage";
 }
 @PostMapping("/productadd")
 public String ProductAdd(){
  return "Welcome to my Product Add page";
 }
 @PostMapping("/productsearch")
 public String ProductSearch(){
  return "Welcome to my Product Search page";
 }
 }


