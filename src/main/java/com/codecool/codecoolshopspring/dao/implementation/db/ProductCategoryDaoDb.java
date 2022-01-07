package com.codecool.codecoolshopspring.dao.implementation.db;


import com.codecool.codecoolshopspring.dao.ProductCategoryDao;
import com.codecool.codecoolshopspring.model.ProductCategory;
import com.codecool.codecoolshopspring.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Primary
@Component
public class ProductCategoryDaoDb implements ProductCategoryDao {

    private final ProductCategoryRepository repository;

    @Autowired
    public ProductCategoryDaoDb(ProductCategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProductCategory add(ProductCategory category) {
        return repository.save(category);
    }

    @Override
    public ProductCategory find(int id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void remove(int id) {
        repository.deleteById(id);
    }

    @Override
    public List<ProductCategory> getAll() {
        return repository.findAll();
    }
}
