package aatQuat;

import java.util.Scanner;

public class aatQuatt {

	public static void main(String[] args) {
		
		int ini, fini;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Informe um numero inicial: ");
			ini = ler.nextInt();
			System.out.println("Informe um numero final: ");
			fini = ler.nextInt();
		}while (ini < 0);
		while (ini <= fini) {
			ini ++;
			System.out.println(ini);
		}

	}

}
