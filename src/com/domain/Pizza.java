package com.domain;

import java.util.List;

public class Pizza {
    private String crust;
    private Sauce sauce;
    private List<String> toppings;
    
    
    public Pizza(String crust, Sauce sauce, List<String> toppings) {
		super();
		this.crust = crust;
		this.sauce = sauce;
		this.toppings = toppings;
	}

	public String getCrust() {
        return crust;
    }
    
    public Sauce getSauce() {
        return sauce;
    }
    
    public List<String> getToppings() {
        return toppings;
    }
}
