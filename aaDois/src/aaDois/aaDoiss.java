package aaDois;

import java.util.Scanner;

public class aaDoiss {

	public static void main(String[] args) {
		
		int nume;
		int cont = 1;
		char op = 'S';
		
		Scanner ler = new Scanner(System.in);
		
		while (op == 'S' || op == 's') {
			
			System.out.println("Informe um numero inteiro:");
			nume = ler.nextInt();
			
			while (cont <= 10) {
				
				System.out.println(nume + " x "+ cont + " = "+ (nume*cont));
				cont ++;
			}
			cont = 1;
			System.out.println("Deseja fazer a tabuada com outro numero ? S ou N ");
			op = ler.next().charAt(0);
		}
		System.out.println("Cabo");

	}

}
