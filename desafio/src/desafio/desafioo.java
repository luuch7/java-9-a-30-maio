package desafio;

import java.util.Scanner;

public class desafioo {

	public static void main(String[] args) {
		
		int op = 0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Escolha uma opcao: ");
			System.out.println("1: Tabuada");
			System.out.println("2: Potencia");
			System.out.println("3: Sair");
			op = ler.nextInt();
		}while(op >=1 && op >3);
		
		switch (op){
		
		case 1:
			int nume, c = 1;
			
			while (c <= 10) {
			System.out.println("Informe um numero: ");
			nume = ler.nextInt();
			
			System.out.println(nume + " x "+ c + " = "+ (nume*c));
			c++;}
			break;
			
		case 2:
			int nUm, nDois;
			
			do {
			System.out.println("Informe o primeiro numero: ");
			nUm = ler.nextInt();
			System.out.println("Informe o segundo numero: ");
			nDois = ler.nextInt();
			
			} while (nUm < 0 || nDois < 0 );
			
			
		
		}

	}

}
