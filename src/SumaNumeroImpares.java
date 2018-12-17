import java.util.Scanner;

public class SumaNumeroImpares {

	public static void main(String[] args) {
		Scanner teclado =new Scanner (System.in);
		
		int n;
		
		int sgtimpar = 1;
		
		System.out.println("Escribe el numero de cubos");
		
		n=teclado.nextInt() + 1;
		
		for (int i=1; i<n; i++) { //escribir lineas
					
			int acumulador =0;
					
			
				for (int j=1; j<i; j++) { //contar sumas
					acumulador += sgtimpar;
					sgtimpar += 2;
					
				}
				
				
				System.out.println(i + " * 3 = " + acumulador);
					}			
				
		
				
			

	

}


}
