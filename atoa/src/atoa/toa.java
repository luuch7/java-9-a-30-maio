package atoa;

import java.util.Scanner;

public class toa {

	public static void main(String[] args) {
		
		int mae;
		char respUm = 'S' , respDois = 'S', op = 'S';
		
		Scanner ler = new Scanner(System.in);
		
		
			while (op == 's' || op == 'S') {
				
				System.out.println("---------------------------------");
				System.out.println("Teste Gay");
				System.out.println("---------------------------------");
				System.out.println("Responda somente uma vez S e uma vez N");
				System.out.println("---------------------------------");
				
				System.out.println("Voce e gay? (S ou N)");
				respUm = ler.next().charAt(0);
				
				if (respUm == 'n' || respUm == 'N') {
					
					while (respDois == 'n' || respDois == 'N') {
					System.out.println("Voce esta mentindo? (S ou N)");
					respDois = ler.next().charAt(0);
					}
					
					
					if (respDois == 's' || respDois == 'S') {
						
						System.out.println("Voce e gay");
					}
				
					
	
				}
				else {
					System.out.println("Voce e gay");
				}
				System.out.println("Deseja testar denovo? (S ou N)");
				op = ler.next().charAt(0);
			}
			System.out.println("Cabo");

	}

}
