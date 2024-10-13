package org.example.mapper;

import org.example.dto.CustomerDTO;
import org.example.entity.CustomerEntity;

public class CustomerMapper {

    public CustomerDTO toDTO(CustomerEntity entity) {
        CustomerDTO dto = new CustomerDTO();
        dto.setDni(entity.getDni());
        dto.setName(entity.getName());
        dto.setEmail(entity.getEmail());
        return dto;
    }

}
