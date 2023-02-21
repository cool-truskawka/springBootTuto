package com.example.springBootTuto.web.controller;


import com.example.springBootTuto.services.BeerService;
import com.example.springBootTuto.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController // extends controller annotation
@RequestMapping ("/api/v1/beer") // base url for the entire CLASS
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity handlePost(@RequestBody BeerDto beerDto) {
        BeerDto savedDto = beerService.saveNewBeer(beerDto);

        HttpHeaders headers = new HttpHeaders(); // to return response with location header
        headers.add("Location", "/api/v1/beer/" + savedDto.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity hadleUpdate(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto) {

        beerService.updateBeer(beerId, beerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT); //204
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // instead of returning a responseEntity :o
    public void hadleDelete(@PathVariable("beerId") UUID beerId){
        beerService.deleteById(beerId);
    }

}
