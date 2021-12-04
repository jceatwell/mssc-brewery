package jceatwell.com.msscbrewery.services;

import jceatwell.com.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
