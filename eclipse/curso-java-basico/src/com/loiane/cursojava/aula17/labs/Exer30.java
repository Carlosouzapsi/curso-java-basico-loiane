package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número para gerar a tabuada:");
		int num = scan.nextInt();
		
		System.out.println("Entre com o inicio da tabuada: ");
		int numInicio = scan.nextInt();
		
		System.out.println("Entre com o final da tabuada: ");
		int numFinal = scan.nextInt();
		
		boolean invalido = true;
		
		do {
		
			if(numFinal > numInicio) {
				
				invalido = false;
			}
		
		} while(invalido);
		
		
		System.out.println("Tabuada de " + num + ":");
		System.out.println("Começar por: " + numInicio);
		System.out.println("Terminar em: " + numFinal);
		
		for(int i = numInicio; i <= numFinal; i++) {
			
			System.out.println(num + " x " + i + " = " + (num*i));
			
		}
		
	}

}
