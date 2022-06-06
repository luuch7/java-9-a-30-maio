package exxTres;

import java.util.Scanner;

public class exxTress {

	public static void main(String[] args) {
		
		int nume;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero para a tabuada: ");
		nume = ler.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			
			System.out.println(nume + " x "+ i + " = "+ (nume*i));
		}
		System.out.println("Fim do programa! ");

	}

}
