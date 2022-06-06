package aaUm;

import java.util.Scanner;

public class aaUmm {

	public static void main(String[] args) {
		
		int nume;
		char op = 'S';
		
		Scanner ler = new Scanner(System.in);
		
		while (op == 's' || op == 'S') {
			
			System.out.println("Informe um numero inteiro:");
			nume = ler.nextInt();
			
			if (nume % 2 == 0) {
				
				System.out.println(nume + " e par");
				System.out.println("Deseja analisar outro numero? S ou N");
				op = ler.next().charAt(0);
			}
			else {
				System.out.println( nume + " e impar");
				System.out.println("Deseja analisar outro numero? S ou N");
				op = ler.next().charAt(0);
			}
		}
		System.out.println("Cabo");

	}

}
