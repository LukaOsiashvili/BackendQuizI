package com.example.demo.controllers;

import com.example.demo.dto.CustomerDTO;
import com.example.demo.dto.Paging;
import com.example.demo.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(value = "/getCustomers", method = RequestMethod.POST, produces = {"application/json"})
    public Page<CustomerDTO> getCustomers(@RequestBody Paging paging){
        return customerService.getCustomers(paging);
    }
}
