package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de a");
		int a = scan.nextInt();
		
		if(a == 0) {
			System.out.println("N�o � equa��o de segundo grau");
			
		} else {
			
			System.out.println("Digite o valor de b");
			int b = scan.nextInt();
			
			System.out.println("Digite o valor de c");
			int c = scan.nextInt();
			
			double delta = (Math.pow(2, b)) - (4 * a * c);
			
			if(delta < 0) {
				System.out.println("delta negativo");
				
			} else {
				
				System.out.println("delta: " + delta);
				
				double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
				double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
				
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
				
			}
			
		}
		
		
		
		
		
		
		

	}

}
