package aatTres;

import java.util.Scanner;

public class aatTress {

	public static void main(String[] args) {
		
		int nume, c = 10;
		char op = 'S';
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero: ");
			nume = ler.nextInt();
			
			do {
				System.out.println(nume + " x "+ c + " = "+ (nume*c));
				c--;
			}while (c >= 0);
			
			c = 10;
			System.out.println("Deseja escolher outro numero ? (S ou N) ");
			op = ler.next().charAt(0);
		}while ( op == 's' || op == 'S');
		
		System.out.println("Cabo");

	}

}
