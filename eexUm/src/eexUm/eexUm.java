package eexUm;

import java.util.Scanner;

public class eexUm {

	public static void main(String[] args) {
		
		int n1, n2, r;
		char op = 'S';
		
		Scanner ler = new Scanner(System.in);
		
		while (op == 'S' || op == 's') {
			
			System.out.println("Programa soma");
			System.out.println("-------------------------");
			System.out.println("Digite um numero inteiro: ");
			n1 = ler.nextInt();
			System.out.println("Digite o segundo numero inteiro: ");
			n2 = ler.nextInt();
			System.out.println("A soma é: "+ (n1+n2));
			System.out.println("--------------------------");
			ler.nextLine();
			System.out.println("Deseja realizar outro calculo ? (S ou N):");
			op = ler.next().charAt(0);
			
		}
		System.out.println("cabo");
	}

}
