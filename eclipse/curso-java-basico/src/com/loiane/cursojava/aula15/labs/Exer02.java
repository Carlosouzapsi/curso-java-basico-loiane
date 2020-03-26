package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int num1 = scan.nextInt();
		
		if(num1 >= 0) {
			System.out.println("O número informado é positivo");
		}else {
			System.out.println("O número é negativo");
		}

	}

}
