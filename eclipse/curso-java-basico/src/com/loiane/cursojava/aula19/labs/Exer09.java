package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[2];
		int[] vetorB = new int[vetorA.length];
		double[] vetorC = new double[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.println("Entre com os valoes do vetorA na posi��o: " + i);
			vetorA[i] = scan.nextInt();
			
		}
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.println("Entre com os valores do vetorB na posi��o: " + i);
			vetorB[i] = scan.nextInt();
			
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			
			vetorC[i] = vetorA[i] / vetorB[i];
			
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.print(vetorA[i] + " ");
			
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.print(vetorB[i] + " ");
			
		}
		System.out.println();
		
		System.out.print("Vetor C = ");
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.print(vetorC[i] + " ");
		}
		
	}

}

