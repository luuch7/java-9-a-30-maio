package exUm;

public class exUmm {

	public static void main(String[] args) {
		
		int n = 1, i = 0;
		
		while (n <= 10) {
			
			System.out.println("-------------------------");
			System.out.println("Tabuada do numero: "+ n);
			System.out.println("-------------------------");
			i = 0;
			
			while (i <= 10){
				System.out.println(n + " x "+ i + " = "+ (n*i));
				i ++;
				
			}
			n++;
			
		}
		System.out.println("cabo");

	}

}
