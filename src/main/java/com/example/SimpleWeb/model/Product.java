package com.example.SimpleWeb.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Product {
    @Id
    private int prodId;
    private String prodName;
    private int price;
    // public Product(int prodId,String prodName,int price){
    //     this.prodId=prodId;
    //     this.prodName=prodName;
    //     this.price=price;
    // }
    public void setprodId(int prodId){
        this.prodId=prodId;
    }
    public int getprodId(){
        return prodId;
    }
    public void setprodName(String prodName){
        this.prodName=prodName;
    }
    public String getprodName(){
        return prodName;
    }
    public void setprice(int price){
        this.price=price;
    }
    public int getprice(){
        return price;
    }
    // @Override
    // public String toString(){
    //     return "Product{"+
    //             "prodId=" +prodId+
    //             ", prodName="+prodName+
    //             ", price="+price+
    //             "}";
    // }
}
