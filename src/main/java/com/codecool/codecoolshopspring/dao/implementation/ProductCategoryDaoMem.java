package com.codecool.codecoolshopspring.dao.implementation;


import com.codecool.codecoolshopspring.dao.ProductCategoryDao;
import com.codecool.codecoolshopspring.model.ProductCategory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductCategoryDaoMem implements ProductCategoryDao {

    private List<ProductCategory> data = new ArrayList<>();

    @Override
    public void add(ProductCategory category) {
        category.setId(data.size() + 1);
        data.add(category);
    }

    @Override
    public ProductCategory find(int id) {
        return data.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void remove(int id) {
        data.remove(find(id));
    }

    @Override
    public List<ProductCategory> getAll() {
        return data;
    }
}
