package jceatwell.com.msscbrewery.services;

import jceatwell.com.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerBuId(UUID customerId) {
        return CustomerDto.builder()
                .id(customerId)
                .name("John")
                .build();

    }
}
