package aattQuat;

import java.util.Scanner;

public class aattQuatt {

	public static void main(String[] args) {
		
		int ini, fini;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o numero inicial: ");
		ini = ler.nextInt();
		System.out.println("Informe o numero final: ");
		fini = ler.nextInt();
	
		for (int c =0; ini <= fini; ini++) {

			System.out.println(ini);
			
		}
		
	}

}
