package com.codecool.codecoolshopspring.dao.implementation;

import com.codecool.codecoolshopspring.dao.SupplierDao;
import com.codecool.codecoolshopspring.model.Supplier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SupplierDaoMem implements SupplierDao {

    private List<Supplier> data = new ArrayList<>();

    @Override
    public void add(Supplier supplier) {
        supplier.setId(data.size() + 1);
        data.add(supplier);
    }

    @Override
    public Supplier find(int id) {
        return data.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void remove(int id) {
        data.remove(find(id));
    }

    @Override
    public List<Supplier> getAll() {
        return data;
    }
}
