package trabDois;

import java.util.Scanner;

public class trabDoiss {

	public static void main(String[] args) {
		
		int idade,  soma = 0;
		int cUm = 0, cDois = 0, cTres = 0;
		double media, porc, peso, alt;
		
		Scanner ler = new Scanner(System.in);
		
		for (int i = 1; i <= 10; i ++) {
			
			System.out.println("Informe a sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("Informe o seu peso: ");
			peso = ler.nextDouble();
			
			System.out.println("Informe a sua altura: ");
			alt = ler.nextDouble();
			
			if (peso > 90 && alt < 150) {
				cUm ++;
			}
			
			if (idade >= 10 && idade <= 30) {
				cDois ++;
			}
			if (alt > 190) {
				cTres ++;
			}
			
			soma = soma + idade;
		}
		
		media = soma / 10;
		//*porc = (cDois / cTres) * 10;
		
		System.out.println("Media da idade das dez pessoas: "+ media);
		System.out.println("Quantidade de pessoas com peso superior a 90 quilos e altura inferior a 1,50: "+ cUm);
		System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90: "+ cDois);
		

	}

}
