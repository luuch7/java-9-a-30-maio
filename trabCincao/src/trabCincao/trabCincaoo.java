package trabCincao;

import java.util.Scanner;

public class trabCincaoo {

	public static void main(String[] args) {
		
		int voto = 1;
		int cUm = 0, cDois = 0, cTres = 0, cQuat = 0, cCinc = 0, cSeis = 0, c = 0;
		double porcB, porcN;
		
		Scanner ler = new Scanner(System.in);
		
		while (voto > 0) {
			
			System.out.println("Informe o seu voto: ");
			voto = ler.nextInt();
			
			c++;
			
			if (voto == 1) {
				cUm ++;
			}
			if (voto == 2) {
				cDois ++;
			}
			if (voto == 3) {
				cTres ++;
			}
			if (voto == 4) {
				cQuat ++;
			}
			if (voto == 5) {
				cCinc ++;
			}
			if (voto == 6) {
				cSeis ++;
			}
			
		}
		
		porcB = cSeis / c;
		porcN = cCinc / c;
		
		System.out.println("Total de votos para o candidato 1: "+ cUm);
		System.out.println("Total de votos para o candidato 2: "+ cDois);
		System.out.println("Total de votos para o candidato 3: "+ cTres);
		System.out.println("Total de votos para o candidato 4: "+ cQuat);
		System.out.println("Total de votos nulos: "+ cCinc);
		System.out.println("Total de votos em branco: "+ cSeis);
		System.out.println("Porcentagem de votos branco: "+ porcB);
		System.out.println("Porcentagem de votos nulos: "+ porcN);
		

	}

}
