package org.example.dao;

import org.example.entity.CustomerEntity;

import java.util.List;

public interface CustomerDAO {

    List<CustomerEntity> finAll();

    CustomerEntity finByDni(String dni);
}
