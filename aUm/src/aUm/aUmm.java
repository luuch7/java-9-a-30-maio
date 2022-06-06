package aUm;

public class aUmm {

	public static void main(String[] args) {
		
		int nume = 0, i = 1;
		int cont = 1;
		
		while (nume < 1) {
			
			nume = 10;
			System.out.println("Tabuada do "+ nume);
			i = 1;
			
			while (i <= 10) {
				
				System.out.println(nume + " x "+ i + " = "+ (nume * i));
				i ++;
			}
			nume = nume - cont;
		}
		System.out.println("Cabo");

	}

}
