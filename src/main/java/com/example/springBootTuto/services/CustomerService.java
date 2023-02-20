package com.example.springBootTuto.services;


import com.example.springBootTuto.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID id);
}
