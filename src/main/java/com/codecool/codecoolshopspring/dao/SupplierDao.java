package com.codecool.codecoolshopspring.dao;

import com.codecool.codecoolshopspring.model.Supplier;

import java.util.List;

public interface SupplierDao {

    void add(Supplier supplier);
    Supplier find(int id);
    void remove(int id);

    List<Supplier> getAll();
}
