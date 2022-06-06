package aaTres;

import java.util.Scanner;

public class aaTress {

	public static void main(String[] args) {
		
		int nume;
		double conta;
		char op = 'S';
		
		Scanner ler = new Scanner(System.in);
		
		while (op == 's' || op == 'S') {
			
			System.out.println("Informe um numero:");
			nume = ler.nextInt();
			
			if (nume % 2 == 0) {
				
				System.out.println("Numero par");
				conta = nume * 2;
				System.out.println("Dobro do numero: "+ conta);
				
			}
			else{
				System.out.println("Numero impar");
				conta = Math.pow(nume, 3);
				System.out.println("Cubo do numero "+ conta);
				
			}
			System.out.println("Deseja verificar outro numero ? S ou N");
			op = ler.next().charAt(0);
		}
		System.out.println("Cabo");

	}

}
