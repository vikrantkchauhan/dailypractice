package com.vikrant.services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.vikrant.beans.Country;

public class CountryService {

	private static HashMap<Integer, Country> countryIdMap;
	

	public  CountryService() {
		
		countryIdMap = new HashMap<Integer, Country>();
		countryIdMap.put(1,new Country(101,"India","Delhi"));
		countryIdMap.put(2,new Country(201,"USA","Washington DC"));
		countryIdMap.put(3, new Country(301,"Russia","St. Petersberg"));	
		

	}
	
	//get countrylist
	public  List<Country> getAllCountries(){
		
		List<Country>  list = new ArrayList<>(countryIdMap.values());
		return list;
	}
	
	//get country by id
	public Country  getCountryById(int id){
		
		Country c = (Country) countryIdMap.get(id);
		return c;
		
	}
	
	//get country by name
	
	public Country getCountryName(String name) {
		
		List<Country>  list = new ArrayList<>(countryIdMap.values());
		
		Optional<Country> country=  list.stream().filter(e->e.getCountryName().equalsIgnoreCase(name)).findFirst();
				
		return country.get();
	}
	
	//add new country:post
	
	public Country addCountry(Country country) {
		
		int key = getMaxIdForSet();
		
		Country countryadded  = countryIdMap.put(key, country);
		return countryadded;
		
	}
	
	//gnerating id
	public static int getMaxIdForSet() {
		
		int maxid =0;
		Set<Integer> st = countryIdMap.keySet();
		for(int i:st) {
			if(i>maxid) {
				maxid = i;
			}
		}
		
		return maxid+1;
		
		
	}
}
