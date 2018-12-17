// Este Si Funciona

import java.util.Scanner;

public class Ejercicio3ParImpar {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		int resultado;
		System.out.println("Introduce un numero y te escribire si es Par o Impar");
		numero=teclado.nextInt();
		
		resultado=numero%2;
		
		if (resultado==0) {
			System.out.println("El numero " + numero + " es PAR");
		}
		else {
			System.out.println("El numero " + numero + " es IMPAR");
		}
		
		
	
		teclado.close();
	}

}
