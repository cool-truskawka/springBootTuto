package com.example.springBootTuto.services;

import com.example.springBootTuto.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID()).beerName("Beer Name LOL").beerStyle("Pale Ale").build();
    }

}
