package com.example.springBootTuto.services;


import com.example.springBootTuto.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
