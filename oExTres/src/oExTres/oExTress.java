package oExTres;

import java.util.Scanner;

public class oExTress {

	public static void main(String[] args) {
		
		int numero, i;
		String op;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero para tabuada");
			numero = ler.nextInt();
			
			i = 0;
		
		do {
			System.out.println(numero + " x "+ i + " = "+ (numero*i));
			i ++;
		}while(i <= 10);
		
		ler.nextLine();
		System.out.println("Deseja fazer novamente? (S ou N) : ");
		op = ler.nextLine();
		}while(op.toUpperCase().equals("S"));
		System.out.println("O quadrado do numero e: "+ (numero*numero));

	}

}
