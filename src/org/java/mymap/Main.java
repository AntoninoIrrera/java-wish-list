package org.java.mymap;


import java.util.HashMap;

import java.util.Map;



public class Main {
	public static void main(String[] args) {
		
		
		String str = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam - repudiandae est, alias in ullam excepturi ipsam modi odio Lorem ipsum dolor asperiores voluptatum, # quam distinctio ! Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam repudiandae Totam repudiandae est ; accusantium voluptatum, quam distinctio aut magnam quod veniam esse nesciunt debitis.";

		{
			
        
		String[] arrayParole = str.split(" ");

        
        Map<String, Integer> frequenzaParola = new HashMap<>();

        
        for (String parola : arrayParole) {
            
            frequenzaParola.put(parola, frequenzaParola.getOrDefault(parola, 0) + 1);
           
        }

       
        System.out.println(frequenzaParola);

		}
        {
        	
        
        str = str.replaceAll("[^a-zA-Z ]", "");
        
		String[] arrayParole = str.split(" ");

        
        Map<String, Integer> frequenzaParola = new HashMap<>();

        
        for (String parola : arrayParole) {
            if (!parola.isEmpty()) { 
            	frequenzaParola.put(parola, frequenzaParola.getOrDefault(parola, 0) + 1);
            }
        }

       
        System.out.println(frequenzaParola);
        
        }
		
	}
}
