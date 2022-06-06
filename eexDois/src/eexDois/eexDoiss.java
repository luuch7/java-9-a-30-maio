package eexDois;

import java.util.Scanner;

public class eexDoiss {

	public static void main(String[] args) {
		
		int n, soma = 0;
		char op = 'S';
		
		Scanner ler = new Scanner(System.in);
		
		while (op == 'S' || op == 's') {
			
			System.out.println("-------------------------------");
			System.out.println("Programa soma");
			System.out.println("-------------------------------");
			System.out.println("Digite um numero para somar: ");
			n = ler.nextInt();
			
			soma = soma + n;
			
			System.out.println("Deseja inserir outro numero? (S ou N):");
			op = ler.next().charAt(0);
		}
		System.out.println("A soma é : "+ soma);
		System.out.println("Cabo");

	}

}
