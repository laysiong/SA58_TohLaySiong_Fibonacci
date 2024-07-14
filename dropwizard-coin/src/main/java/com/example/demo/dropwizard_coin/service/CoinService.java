package com.example.demo.dropwizard_coin.service;

import java.util.ArrayList;

public interface CoinService {
	ArrayList<Number> findMinCoin(double[] coins, double amt);
}
