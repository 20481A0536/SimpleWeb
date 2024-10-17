package com.example.SimpleWeb.service;
import java.util.List;

import com.example.SimpleWeb.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.SimpleWeb.model.Product;


@Service
public class ProductService {

    @Autowired
    ProductRepository repo;
    
    public List<Product> getProducts(){
        return repo.findAll();
    }
    public Product getProductbyId(int prodId){
        return repo.findById(prodId).orElseThrow(()-> new RuntimeException("Product not found"));
    }

    public void addProduct(Product prod){
        repo.save(prod);
    }

    public void updateProduct(Product prod){
        repo.save(prod);
    }

    public void deleteProduct(int prodId){
        repo.deleteById(prodId);
    }
    
}
