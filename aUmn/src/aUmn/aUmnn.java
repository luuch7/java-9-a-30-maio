package aUmn;

public class aUmnn {

	public static void main(String[] args) {
		
		int nume = 10;
		int cont = 0;
		
		while (nume >= 0) {
			
			System.out.println("Tabuada do número "+ nume);
			cont = 0;
			while (cont <= 10) {
				System.out.println(nume + " x "+ cont + " = "+ (nume*cont));
				cont ++;
			}
			nume --;
		}
		System.out.println("cabo");

	}

}
