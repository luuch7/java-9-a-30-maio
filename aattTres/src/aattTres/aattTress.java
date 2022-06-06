package aattTres;

import java.util.Scanner;

public class aattTress {

	public static void main(String[] args) {
		
		int nume;
		char op = 'S';
		
		Scanner ler = new Scanner(System.in);
		
		while (op == 'S' || op == 's') {
			
			System.out.println("Informe um numero: ");
			nume = ler.nextInt();
			
			for (int cont = 10; cont >= 0; cont --) {
				
				System.out.println(nume + " x "+ cont + " = "+ (nume*cont));
			}
			
			System.out.println("Deseja fazer a tabuada com outro numero? (S ou N): ");
			op = ler.next().charAt(0);
		}
		System.out.println("Cabo");

	}

}
