package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero do dia da semana: ");
		int diaSemana = scan.nextInt();
		
		switch(diaSemana) {
			
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-feira");
				break;
			case 3:
				System.out.println("Ter�a-feira");
				break;
			case 4:
				System.out.println("Quarta-feira");
				break;
			case 5:
				System.out.println("Quinta-feira");
				break;
			case 6:
				System.out.println("Sexta-feira");
				break;
			case  7:
				System.out.println("S�bado");
				break;
			default:
				System.out.println("Dia inv�lido!");
		}

	}

}
