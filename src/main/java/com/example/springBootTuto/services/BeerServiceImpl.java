package com.example.springBootTuto.services;

import com.example.springBootTuto.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j // inject a logger
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID()).beerName("Beer Name LOL").beerStyle("Pale Ale").build();
    }
    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder().
                id(UUID.randomUUID()).
                build();
    }
    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        // make implementation
        log.debug("Updating a beer...");
    }
    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer...");
    }

}
