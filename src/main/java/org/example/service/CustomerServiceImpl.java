package org.example.service;


import org.example.dto.CustomerDTO;
import org.example.entity.CustomerEntity;
import org.example.mapper.CustomerMapper;
import org.example.repository.CustomerRepository;
import org.example.repository.CustomerRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private final CustomerMapper mapper;
    private final CustomerRepository repository;
    public CustomerServiceImpl(){
        mapper = new CustomerMapper();
        repository = new CustomerRepositoryImpl();
    }
    @Override
    public List<CustomerDTO> findAll() {
        List<CustomerEntity> customerEntities = repository.finAll();
        List<CustomerDTO> customerDTOS = new ArrayList<>();

        for (CustomerEntity customerEntity: customerEntities){
            CustomerDTO customerDTO = mapper.toDTO(customerEntity);
            customerDTOS.add(customerDTO);
        }

        return customerDTOS;
    }

    @Override
    public CustomerDTO findByDni(String dni) {
        CustomerEntity entity = repository.finByDni(dni);
        return mapper.toDTO(entity);
    }
}
