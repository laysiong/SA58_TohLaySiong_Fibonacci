package com.example.demo.dropwizard_coin.resources;


import java.util.ArrayList;

import com.example.demo.dropwizard_coin.CountCoinBody;
import com.example.demo.dropwizard_coin.service.CoinService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class dropwziard_Resource {
	
	private CoinService coinService;
	
	 public dropwziard_Resource(CoinService coinService) {
	        this.coinService = coinService;
	    }
	 
	@POST
    @Path("/count")
    public Response CountMin(CountCoinBody countRequest) {
    	System.out.println("reach");
    	double[] coinstype = countRequest.getCoinstype();
		double targetamt = countRequest.getTargetAmt();		
		
		

		ArrayList<Number> results = coinService.findMinCoin(coinstype,targetamt);
        System.out.println("Returning result: " + results);

		return Response.ok(results).build();
	}
	
}
