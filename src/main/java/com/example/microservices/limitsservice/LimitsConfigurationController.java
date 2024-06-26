package com.example.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;
    @GetMapping("/limits")
    public LimitConfiguraton retrieveLimitFromConfiguration(){
        return new LimitConfiguraton(configuration.getMaximum(),configuration.getMinimum());
    }
}
