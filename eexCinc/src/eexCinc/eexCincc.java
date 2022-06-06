package eexCinc;

import java.util.Scanner;

public class eexCincc {

	public static void main(String[] args) {
		
		int nume;
		char continuar = 'S';
		
		Scanner ler = new Scanner(System.in);
		
		while (continuar == 's' || continuar == 'S') {
			
			System.out.println("Informe um numero: ");
			nume = ler.nextInt();
			
			for (int i = 0; i <= 10; i++) {
				
				System.out.println(nume + " x "+ i + " = "+ (nume*i));
			}
			System.out.println("Deseja inserir outro numero? (S ou N):");
			continuar = ler.next().charAt(0);
		}
		System.out.println("Fim do programa! ");

	}

}
