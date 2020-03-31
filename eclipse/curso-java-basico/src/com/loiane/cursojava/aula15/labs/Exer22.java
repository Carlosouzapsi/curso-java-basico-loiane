package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade (Kg) de morango: ");
		double qtdMorango = scan.nextDouble();
		
		System.out.println("Entre com a quantidade (Kg) de maçã:");
		double qtdMaca = scan.nextDouble();
		
		double precoKgMorango = 0;
		double precoKgMaca = 0;
		
		if(qtdMorango <= 5) {
			
			precoKgMorango = 2.5;
			
		}else {
			
			precoKgMorango = 2.2;
			
		}
		
		double precoMaca = 0;
		if(qtdMaca <= 5) {
			
			precoKgMaca = 2.5;
			
			
		} else {
			
			precoKgMaca = 2.2;
			
		}
		
		if(qtdMaca <= 5) {
			
			precoKgMaca = 1.8;
			
		}else {
			
			precoKgMaca = 1.5;
		}
		
		double precoTotalMorango = qtdMorango * precoKgMorango;
		double precoTotalMaca = qtdMaca * precoKgMaca;
		
		double precoParcial = precoTotalMorango + precoTotalMaca;
		double precoTotal = precoParcial;
		
		if(qtdMorango + qtdMaca > 8 || precoParcial > 25) {
			
			precoTotal = precoParcial - ((precoParcial / 100) * 10);
			
		}
		
		System.out.println("Preco total = " + precoTotal);
		

	}

}
