package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValidas = false;
		String nomeUser;
		String senha;
		
		do {
			
			System.out.println("Entre com o nome do usu�rio: ");
			nomeUser = scan.next();
				
			System.out.println("Entre com a senha: ");
			senha = scan.next();
			
			if(nomeUser.equalsIgnoreCase(senha)) {
				
				//infoValidas = false; OPCIONAL!
				System.out.println("Senha igual � usu�rio, digite novamente.");
				
			} else {
				
				infoValidas = true;
				System.out.println("Senha e usu�rios v�lidos.");
			}
			
			
		} while(!infoValidas);

	}

}
