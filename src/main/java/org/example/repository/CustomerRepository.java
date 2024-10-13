package org.example.repository;

import org.example.entity.CustomerEntity;
import java.util.List;

public interface CustomerRepository {

    List<CustomerEntity> finAll();

    CustomerEntity finByDni(String dni);
}
