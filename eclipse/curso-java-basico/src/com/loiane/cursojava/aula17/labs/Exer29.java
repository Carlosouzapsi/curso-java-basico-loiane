package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int num = scan.nextInt();
		
		boolean primo;
		
		for (int i = 1; i <= num; i++) {
			
			primo = true;
			
			for(int j = 2; j < i; j++) {
				
				if(i % j == 0) {
					
					//System.out.println("N�o � primo - divis�el por " + i);
					primo = false;
					//break;
				}
				
			}
			
			if(primo) {
				
				System.out.println(i);
			}
		}
		
		
		
		
		

	}

}
