package org.example.simplewebapp.service;
import lombok.Getter;
import org.example.simplewebapp.model.Product;
import org.example.simplewebapp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "Iphone", 50000),
//            new Product(102, "Canon Camera", 70 ),
//            new Product(103, "Shore Mic", 100000)));
//
//
    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodID) {
        return repo.findById(prodID).orElse(new Product());
    }

    public void addProduct(Product prod){
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodID) {
        repo.deleteById(prodID);
    }
}

