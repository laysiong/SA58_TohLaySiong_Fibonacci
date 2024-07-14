package com.example.demo.dropwizard_coin;

public class CountCoinBody {
    private double[] coinstype;
    private double targetAmt;
    
	public double getTargetAmt() {
		return targetAmt;
	}
	public void setTargetAmt(double targetAmt) {
		this.targetAmt = targetAmt;
	}
    

	public double[] getCoinstype() {
		return coinstype;
	}
	public void setCoinstype(double[] coinstype) {
		this.coinstype = coinstype;
	}
	
}
