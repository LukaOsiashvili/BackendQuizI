package com.example.demo.services;

import com.example.demo.dto.CustomerDTO;
import com.example.demo.dto.Paging;
import com.example.demo.entities.Customer;
import com.example.demo.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;



    @Autowired
    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public Page<CustomerDTO> getCustomers(Paging paging){

        Pageable pageable = PageRequest.of(paging.getPage() - 1, paging.getSize());

        return customerRepository.searchCustomers(pageable);

    }

}
