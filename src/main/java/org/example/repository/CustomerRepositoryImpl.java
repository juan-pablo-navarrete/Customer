package org.example.repository;

import org.example.dao.CustomerDAO;
import org.example.dao.CustomerDAOImpl;
import org.example.entity.CustomerEntity;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {

    private final CustomerDAO customerDAO;
    public CustomerRepositoryImpl(){
        this.customerDAO = new CustomerDAOImpl();
    }

    @Override
    public List<CustomerEntity> finAll() {
        return null;
    }

    @Override
    public CustomerEntity finByDni(String dni) {
        return null;
    }
}
