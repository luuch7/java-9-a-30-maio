package desafioo;

import java.util.Scanner;

public class desafios {

	public static void main(String[] args) {
		
		int op = 0;
		char opcao = 'S';
		
		Scanner ler = new Scanner(System.in);
		
		while (opcao == 'S' || opcao == 's' || op >= 2) {
		do {
			System.out.println("Escolha uma opcao: ");
			System.out.println("1- Tabuada");
			System.out.println("2- Potencia");
			System.out.println("3- Sair");
			op = ler.nextInt();
			
		}while (op < 0 || op > 3);
		
		switch (op) {
		
		case 1:
				int nume, c = 0;
				
				do {
				System.out.println("Informe um numero: ");
				nume = ler.nextInt();
				}while (nume < 0);
				
				do {
					System.out.println(nume + " x "+ c + " = "+ (nume*c));
					c++;
				}while (c <= 10);
				c = 0;
				System.out.println("Deseja escolher outra opcao? (S ou N)");
				opcao = ler.next().charAt(0);
				break;
				
		case 2:
			int nUm, nDois;
			double conta;
			
			System.out.println("Informe o primeiro numero: ");
			nUm = ler.nextInt();
			System.out.println("Informe o segundo numero: ");
			nDois = ler.nextInt();
			
			conta = Math.pow(nUm, nDois);
			System.out.println("O resultado da potencia e: "+ conta);
			
			System.out.println("Deseja escolher outra opcao? (S ou N)");
			opcao = ler.next().charAt(0);
			break;

		}
		

		System.out.println("Fim do programa");

	}
		switch (op) {
		
		case 3:
			System.out.println("Fim do programa");
			break;
		}

}
}
