package oExDois;

import java.util.Scanner;

public class oExDoiss {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite um numero inteiro positivo: ");
			numero = ler.nextInt();
			
		} while (numero <= 0);
		
		System.out.println("O quadrado do numero e: "+ (numero * numero));

	}

}
