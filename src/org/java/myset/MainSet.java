package org.java.myset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainSet {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		
		Set<Integer> numeriRandom = new HashSet<>();
		
		
		while(numeriRandom.size() != 5) {
			
			numeriRandom.add(rnd.nextInt(2,13));
			
		}
		
		System.out.println(numeriRandom);
		
	}
}
