package trabTres;

import java.util.Scanner;

public class trabTress {

	public static void main(String[] args) {
		
		double sala = 0, media, mediaDois, soma = 0, somaFilhos = 0, porc, maior;
		int nFilho = 0, c = -1, cDois = -1;
		
		maior = sala;
		
		Scanner ler = new Scanner(System.in);
		
		while (sala >= 0) {
			
			System.out.println("Informe o seu salario: ");
			sala = ler.nextDouble();
			
			if (sala <= 150) {
				
				cDois ++;
			}
			
			if (sala > maior) {
				
				maior = sala;
			}
			
			if (sala >= 0) {
				
				System.out.println("Informe a quantidade de filhos: ");
				nFilho = ler.nextInt();
			}
			
			somaFilhos = somaFilhos + nFilho;
			soma = soma + sala;
			c ++;
		}
		
		porc = cDois / c;
		media = soma / c;
		mediaDois = somaFilhos / c;
		
		System.out.println("Media do salario da populacao: "+ media);
		System.out.println("Media do numero de filhos: "+ mediaDois);
		System.out.println("Maior salario: "+ maior);
		System.out.println("A porcentagem de pessoas com salario ate 150 reais: "+ porc);
		

	}

}
