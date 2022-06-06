package trabUm;

import java.util.Scanner;

public class trabUmm {

	public static void main(String[] args) {
		
		int idade, peso, alt ;
		int cUm = 0, cDois = 0, cTres = 0, cQuat = 0, somaUm = 0;
		double media;
		char cCabe, cOlho;
		
		Scanner ler = new Scanner(System.in);
		
		
		for (int i = 1; i <= 2; i++) {
			
			System.out.println("Informe a sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("Informe o seu peso: ");
			peso = ler.nextInt();
			
			System.out.println("Informe a sua altura: ");
			alt = ler.nextInt();
			
			System.out.println("Informe a cor dos olhos: (A- azul, P- preto, V- verde, C- castanho)");
			cOlho = ler.next().charAt(0);
			
			System.out.println("Informe a cor do seu cabelo: (P- preto, C- castanho, L- loiro, R- ruivo)");
			cCabe = ler.next().charAt(0);
			
			if (idade > 50 && peso < 60) {
				
				cUm ++;
				
			}
			
			if (alt < 150) {
				
				somaUm = somaUm + idade;
				cDois ++;
			}
			
			if (cOlho == 'A' || cOlho == 'a') {
				
				cTres ++;
			}
			if (cCabe == 'R' || cCabe == 'r' && cOlho != 'A' || cOlho != 'a') {
				
				cQuat ++;
			}
			
		}
		
		media = somaUm / cDois;
		
		System.out.println("A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos: "+ cUm);
		System.out.println("A media da idade das pessoas com altura inferior a 1,50: "+ media);
		System.out.println("A porcentagem de pessoas com olhos azuis entre todas as pessoas analizadas: "+ cTres);
		System.out.println("A quantidade de pessoas ruivas que nao possuem olhos azuis: "+ cQuat);
		

	}

}
