package jceatwell.com.msscbrewery.services;

import jceatwell.com.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    public CustomerDto getCustomerBuId(UUID customerId);
}
