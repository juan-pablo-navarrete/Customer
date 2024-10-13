package org.example.dao;

import org.example.commons.CsvReader;
import org.example.entity.CustomerEntity;
import java.util.ArrayList;
import java.util.List;


public class CustomerDAOImpl implements  CustomerDAO{

private final String FILE ="/database/customers.csv";
private static final char SEPARATOR = ',';
    @Override
    public List<CustomerEntity> finAll() {
        List<CustomerEntity> customers = new ArrayList<>();
        try {
            CsvReader.getRecords(FILE, SEPARATOR)
                    .forEach(csvRecord -> {
                        String dni = csvRecord.get("DNI");
                        String name = csvRecord.get("NAME");
                        String phone = csvRecord.get("PHONE");
                        String email = csvRecord.get("EMAIL");
                        int age = Integer.parseInt(csvRecord.get("AGE"));



                        CustomerEntity customer = new CustomerEntity();
                        customer.setDni(dni);
                        customer.setName(name);
                        customer.setPhone(phone);
                        customer.setEmail(email);
                        customer.setAge(age);

                        customers.add(customer);
                    });
        } catch (Exception exception) {
            throw new IllegalArgumentException("ErrorReadingCSV", exception);
        }
        return customers;
    }

    @Override
    public CustomerEntity finByDni(String dni) {
        List<CustomerEntity> allCustomers = this.finAll();
        for (CustomerEntity customer: allCustomers) {
            if (customer.getDni().equals(dni)) {
                return customer;
            }
        }
        return null;
    }
}
