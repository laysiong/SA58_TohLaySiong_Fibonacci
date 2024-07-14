package com.example.demo.dropwizard_coin;

import com.example.demo.dropwizard_coin.resources.dropwziard_Resource;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import com.example.demo.dropwizard_coin.service.CoinService;
import com.example.demo.dropwizard_coin.service.CoinServiceImpl;

public class dropwizard_laysApplication extends Application<dropwizard_laysConfiguration> {

    public static void main(final String[] args) throws Exception {
        new dropwizard_laysApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<dropwizard_laysConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(dropwizard_laysConfiguration configuration,
                    Environment environment) {
        // TODO: implement application
    	System.out.println("running");
        final CoinService coinService = new CoinServiceImpl();
        final dropwziard_Resource resource = new dropwziard_Resource(coinService);
        
        environment.jersey().register(resource);
        environment.jersey().register(CORSFilter.class);

    }

}
