package com.kitchenstory.kitchenstorybackend.controller;

import com.kitchenstory.kitchenstorybackend.entity.Product;
import com.kitchenstory.kitchenstorybackend.service.AdminProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminProductController {

    @Autowired
    private AdminProductService adminProductService;

    @GetMapping("/getallproducts")
    List<Product> getAllProducts() {
       return adminProductService.getAllProducts();
    }

    @PostMapping("/addproduct")
    Product addProduct(@RequestBody Product product) {
        System.out.println(product);
        return adminProductService.addProduct(product);
    }

    @DeleteMapping("/deleteproduct")
    void deleteProduct(@RequestParam(name = "id") Long id) {
        adminProductService.deleteProduct(id);
    }
}
