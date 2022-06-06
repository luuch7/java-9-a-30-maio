package trabQuat;

import java.util.Scanner;

public class trabQuatt {

	public static void main(String[] args) {
		
		int idade = 0, maior, menor, c = 0, idadeM = 0;
		int cUm = 0;
		double sala = 0, media, menorSala, soma = 0;
		char sexo, menorSalaa = 0;
		
		idadeM = idade;
		maior = idade;
		menor = idade;
		menorSala = sala;
		
		Scanner ler = new Scanner(System.in);
		
		while (idade >= 0) {
			
			System.out.println("Informe a sua idade: ");
			idade = ler.nextInt();
			
			if (idade > 0) {
				
				System.out.println("Informe o seu sexo: (M ou F) ");
				sexo = ler.next().charAt(0);
				
				System.out.println("Informe o seu salario: ");
				sala = ler.nextDouble();
				
				if (idade > maior) {
					
					maior = idade;
				}
				
				if (idade < menor) {
					
					menor = idade;
				}
				
				if (menorSala < sala) {
					
					idadeM = idade;
					menorSala = sala;
					menorSalaa = sexo;
				}
				
				if (sexo == 'M' || sexo == 'm' && sala <= 200) {
					
					cUm ++;
				}
				
			}
			soma = soma + sala;
			c++;
		}
		
		media = soma / c;
		
		System.out.println("Media do salario do grupo: "+ media);
		System.out.println("Maior idade do grupo: "+ maior);
		System.out.println("Menor idade do grupo: "+ menor);
		System.out.println("Quantidade de mulheres com salario ate 200: "+ cUm);
		
		System.out.println("Idade e o sexo da pessoa que possui o menor salario: ");
		
		if (menorSalaa == 'M' || menorSalaa == 'm') {
			
			System.out.println("Idade: "+ idadeM + " Sexo: Feminino");
		}
		else {
			System.out.println("Idade: "+ idadeM + " Sexo: Masculino");
		}

	}

}
