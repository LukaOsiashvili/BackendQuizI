package com.example.demo.repositories;

import com.example.demo.dto.CustomerDTO;
import com.example.demo.entities.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT new com.example.demo.dto.CustomerDTO(c.firstName, c.lastName, " +
            "new com.example.demo.dto.AddressDTO(c.address.addressName, " +
            "new com.example.demo.dto.CityDTO(c.address.city.city, " +
            "new com.example.demo.dto.CountryDTO(c.address.city.country.country)))) " +
            "FROM Customer c")

    Page<CustomerDTO> searchCustomers(Pageable pageable);

}
