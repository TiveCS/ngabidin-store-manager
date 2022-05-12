package io.github.tivecs;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    private final HashMap<String, Product> products;

    public Warehouse(){
        this.products = new HashMap<>();
    }

    public void info(){
        if (products.isEmpty()){
            System.out.println("Empty");
        }
        for (Map.Entry<String, Product> entry : products.entrySet()) {
            entry.getValue().info();
        }
    }

    public void addProduct(Product product){
        products.put(product.getName(), product);
    }

    public void removeProduct(String name){
        products.remove(name);
    }

    public Product getProduct(String name){
        return products.get(name);
    }
}
