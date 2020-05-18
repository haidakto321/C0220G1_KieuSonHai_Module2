package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone X", "mobilephone", "Apple"));
        products.put(2, new Product(2, "Macbook pro 2019", "laptop", "Apple"));
        products.put(3, new Product(3, "Samsung galaxy S10", "mobilephone", "Samsung"));
        products.put(4, new Product(4, "Dell Latitude E6540", "Laptop", "Dell"));
        products.put(5, new Product(5, "Tivi Samsung 32 inch UA32N4000", "TV", "Samsung"));
        products.put(6, new Product(6, "Xiaomi Redmi Note 10", "mobilephone", "Xiaomi"));
        products.put(7, new Product(7, "Iphone 6", "mobilephone", "Apple"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
