import java.util.Scanner;

public class NnumerosPrimos {

	public static void main(String[] args) {
		
		int a;
		float b;
		float c;
		float d;
		float e;
		float f;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introducca la cantidad de la lista");
		a= teclado.nextInt();
		
		
		for (float i=0;i<=a;i++) {
			for (float j=0; i<=a;j++) {
			b = i/j;
			c = b%1;
			d = a-1;
			e = i/d;
			f = e%1;
			
			}
			if(c==1 && f==1) {
			
				System.out.println("El numero es primo");
			}
		
			else {
				
				System.out.println("El numero no es primo");
				
			}
			
			
		
		
		
	}

}
}
