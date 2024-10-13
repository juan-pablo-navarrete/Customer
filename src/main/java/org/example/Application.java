package org.example;

import org.example.dao.CustomerDAO;
import org.example.dao.CustomerDAOImpl;

public class Application {
    public static void main(String[] args) {
        CustomerDAO customerDAO = new CustomerDAOImpl();
        System.out.println(customerDAO.finAll());
        System.out.println(customerDAO.finByDni("75868303"));

    }
}