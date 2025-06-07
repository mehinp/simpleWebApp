package org.example.simplewebapp.service;
import lombok.Getter;
import org.example.simplewebapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 50000),
            new Product(102, "Canon Camera", 70 ),
            new Product(103, "Shore Mic", 100000)));


    public Product getProductById(int prodID) {
        for (Product product: products) {
            if (product.getProdId() == prodID){
                return product;
            }
        }
        return null;
    }

    public void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prod.getProdId()) {
                products.set(i, prod);
            }
        }
    }

    public void deleteProduct(int prodID){
        for (int i = 0; i < products.size(); i++){
            if (products.get(i).getProdId() == prodID){
                products.remove(products.get(i));
            }
        }
    }
}

