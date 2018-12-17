
//No funciona

import java.util.Scanner;

public class Ejercicio_3_examen {

	public static void main(String[] args) {

		Scanner teclado =new Scanner(System.in);
		
		int e;
		int a;
	
		int c;
		int g;
		
		
		System.out.println("Introduce un numero mayor a 1");
		
		e= teclado.nextInt();
		a= e%2;
		c= e/2;
		g= e*3;
		
		
		
		if (e<=1) {//Aqui programa
			
			if (a==0) {
				
				for ( int i=e; i<c; i++) {
					while (i<=1)
						System.out.println(i);
											}
						}
				else {
					
					for(int p=e; p<g; p ++) {
						while (p<=1)
							System.out.println(p);
							}
					}		
				
		}//este va con el primer if
			
		else {//este va con el else del primer if
				
				System.out.println("Introducca otro número mayor a 0");
				e=teclado.nextInt();
				while(e<=1) 
					System.out.println("Introduce otro número mayor a 0");
					e=teclado.nextInt();
			}//este cierra el primer else
	
		teclado.close();
		
	}
	
}
		
	
			
			
		
	
																	
			
		
		
		

