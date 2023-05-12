package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		List<String> listaDesideri = new ArrayList<>();		
		
		Scanner sc = new Scanner(System.in);
		
		String userDesiderio = "";
		
		while(!userDesiderio.equals("no")) {
			
		
			System.out.println("inserire un desiderio");
			userDesiderio = sc.nextLine();
			
			listaDesideri.add(userDesiderio);
			
			System.out.println(listaDesideri.size());
			
			System.out.println("vuoi continuare?");
			userDesiderio = sc.nextLine();
		
		}
		
		System.out.println(listaDesideri);
		
		sc.close();
		
		
	}
}
