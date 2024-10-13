package org.example.service;

import org.example.dto.CustomerDTO;
import org.example.entity.CustomerEntity;

import java.util.List;

public interface CustomerService {

    List<CustomerDTO> findAll();

    CustomerDTO findByDni(String dni);
}
