package com.example.springBootTuto.services;

import com.example.springBootTuto.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("Jack Sparrow").build();
    }
    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        log.debug("Saving new customer...");
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }
    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.debug("Updating customer...");
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting customer... ");
    }
}
