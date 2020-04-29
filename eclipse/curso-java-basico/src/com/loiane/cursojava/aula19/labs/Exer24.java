package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.println("Entre com um numero para posição " + i);
			vetorA[i] = scan.nextInt();
				
		}
		
		boolean palindromo = true;
		
		for(int i = 0; i < vetorA.length; i++) {
			
			if(vetorA[i] != vetorA[vetorA.length - 1 - i]) {
				palindromo = false;
				break;
			}
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < (vetorA.length / 2); i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		if(palindromo) {
			
			System.out.print("Palindromo");
			
		}else {
			System.out.print("Não é palindromo");
		}
		
	}

}
