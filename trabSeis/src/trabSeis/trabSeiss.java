package trabSeis;

import java.util.Scanner;

public class trabSeiss {

	public static void main(String[] args) {
		
		int idade = 1, c = 0, soma = 0;
		double media;
		
		Scanner ler = new Scanner(System.in);
		
		while (idade > 0) {
			
			System.out.println("Informe uma idade: ");
			idade = ler.nextInt();
			
			c++;
			soma = soma + idade;
		}
		
		media = soma /c;
		System.out.println("Media das idades: "+ media);
		

	}

}
