
//Este si funciona!!!

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un Numero");
		numero1 = teclado.nextInt();
		System.out.println("Introduce otro Numero");
		numero2 = teclado.nextInt();
		
		if(numero1>numero2) {
			System.out.println("El numero mayor es " + numero1);
		}
		
		else {
			System.out.println("El numero mayor es " + numero2);
		}
		teclado.close();
		
	}

}
