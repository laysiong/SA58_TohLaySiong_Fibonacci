package com.example.demo.dropwizard_coin.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class CoinServiceImpl implements CoinService {
	
	ArrayList<Number> input_num = new ArrayList<Number>();
	
	@Override
	public ArrayList<Number> findMinCoin(double[] coins, double amt) {
		
		
		int targetAmount = (int) Math.round(amt * 100);
		ArrayList<Number> input_num = new ArrayList<Number>();
        int[] sortedCoins = Arrays.stream(coins)
                                     .boxed() 
                                     .sorted(Collections.reverseOrder())
                                     .mapToInt(d -> (int) (d * 100))  
                                     .toArray();
	
        findMinCoinHelper(targetAmount, sortedCoins, input_num);

        
        Collections.sort(input_num, new Comparator<Number>() {
            @Override
            public int compare(Number o1, Number o2) {
                return Double.compare(o1.doubleValue(), o2.doubleValue());
            }
        });
        
        return input_num;
    }
	
	
	private void findMinCoinHelper(int amt, int[] coins, ArrayList<Number> input_num) {
	
        if (amt <= 0) {
            return;
        }

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amt) {
                
            	double takencoin = coins[i] / 100.0; 
                if (takencoin % 1 == 0) {
                	input_num.add((int)takencoin); 
                } else {
                	input_num.add(takencoin); 
                }
                
                findMinCoinHelper((amt - coins[i]), coins, input_num);
                return; 
            }
        }
    }
	


}
