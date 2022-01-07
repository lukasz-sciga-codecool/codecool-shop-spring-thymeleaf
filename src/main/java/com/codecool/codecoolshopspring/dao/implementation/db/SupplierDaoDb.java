package com.codecool.codecoolshopspring.dao.implementation.db;

import com.codecool.codecoolshopspring.dao.SupplierDao;
import com.codecool.codecoolshopspring.model.Supplier;
import com.codecool.codecoolshopspring.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Primary
@Component
public class SupplierDaoDb implements SupplierDao {

    private final SupplierRepository repository;

    @Autowired
    public SupplierDaoDb(SupplierRepository repository) {
        this.repository = repository;
    }


    @Override
    public Supplier add(Supplier supplier) {
        return repository.save(supplier);
    }

    @Override
    public Supplier find(int id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void remove(int id) {
        repository.deleteById(id);
    }

    @Override
    public List<Supplier> getAll() {
        return repository.findAll();
    }
}
