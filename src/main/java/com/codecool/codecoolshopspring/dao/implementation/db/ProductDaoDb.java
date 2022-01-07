package com.codecool.codecoolshopspring.dao.implementation.db;


import com.codecool.codecoolshopspring.dao.ProductDao;
import com.codecool.codecoolshopspring.model.Product;
import com.codecool.codecoolshopspring.model.ProductCategory;
import com.codecool.codecoolshopspring.model.Supplier;
import com.codecool.codecoolshopspring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Primary
@Component
public class ProductDaoDb implements ProductDao {

    private final ProductRepository repository;

    @Autowired
    public ProductDaoDb(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void add(Product product) {
        repository.save(product);
    }

    @Override
    public Product find(int id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void remove(int id) {
        repository.deleteById(id);
    }

    @Override
    public List<Product> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Product> getBy(Supplier supplier) {
        return Collections.emptyList();
    }

    @Override
    public List<Product> getBy(ProductCategory productCategory) {
        return Collections.emptyList();
    }
}
