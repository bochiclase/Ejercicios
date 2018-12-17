import java.util.Scanner;

public class Cruzes {

	// Funciona
	
	public static void main(String[] args) {
		
		
	
		int n;
	
		Scanner teclado = new Scanner (System.in);
		
		
		System.out.println("Cuantos numeros de pares quieres");
		n=teclado.nextInt();
	
		
		
		for(int i=0;i<=n*2;i+=2) {
			
	//		while (i<=(n*2)-2) {
		//	i=i+2;
			System.out.println(i);
		//				}
								}
		
		
		
		
		teclado.close();
		
		
	}

}
