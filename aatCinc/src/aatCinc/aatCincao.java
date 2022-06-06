package aatCinc;

public class aatCincao {

	public static void main(String[] args) {
		
		int nume = 10, c = 10;
		
		do {
			
		do {
			System.out.println(nume + " x "+ c + " = "+ (nume*c));
			c--;
		}while (c >= 0);
		
		nume --;
		c = 10;

	}while (nume >= 0);
	}

}
