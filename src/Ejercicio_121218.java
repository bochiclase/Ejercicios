import java.util.Scanner;

public class Ejercicio_121218 {


	
	public static void main(String[] args) {
		
		/* 
		 * 2,5 puntos
		 * 
		 * Escribe en el método 'main' un programa que obtenga el desglose en billetes
		 * y monedas de una cantidad exacta de euros que el usuario introducirá por teclado.
		 * Hay billetes de 500, 200, 100, 50, 20, 10 y 5 euros y monedas de 1 y 2 euros.
		 * Por ejemplo, si deseamos conocer el desglose de 434 euros, el programa mostrará
		 * por pantalla el siguiente resultado:
		 * 
		 * 		2 billetes de 200 euros.
		 * 		1 billete de 20 euros.
		 * 		1 billete de 10 euros.
		 * 		2 monedas de 2 euros.
		 * 
		 * Una vez ejecutado el programa, el usuario podrá realizar tantos desgloses como
		 * desee hasta que decida finalizar su ejecución. 
		 * El programa comprobará que la cantidad introducida sea una cantidad positiva
		 * mayor que 0. En caso contrario mostrará un mensaje de error y volverá a pedirla.
		 */
		
		
		int bill500 =0;
		int bill200 =0;
		int bill100 =0;
		int bill50 =0;
		int bill20 =0;
		int bill10 =0;
		int bill5 =0;
		int mon2=0;
		int mon1=0;
		String respuesta;
		
		Scanner teclado= new Scanner (System.in);
		
		
		do {
		
		System.out.println("Escriba la cifra  mayor a 1 para desgrosar CARAJO YAAA!!!");
		int cifra=teclado.nextInt();
		
		
		while(cifra<1)
			if (cifra<1) {
				
				System.out.println("UNA MAYOR QUE 1 TE HE DICHO Introducela otra vez");
				System.out.println();
				cifra=teclado.nextInt();
			}
		
		 
		
			while(cifra<=500) 
				cifra=cifra-500;
				bill500++;
			
				while(cifra<=200) 
					cifra=cifra-200;
					bill200++;
			
				
					
				while(cifra<=100) 
					cifra=cifra-100;
					bill500++;
			
				
				
				while(cifra<=50) 
					cifra=cifra-50;
					bill50++;
			
				
				
				while(cifra<=20) 
					cifra=cifra-20;
					bill20++;
			
				
				while(cifra<=10) 
					cifra=cifra-10;
					bill10++;
			
				
				while(cifra<=5) 
					cifra=cifra-5;
					bill5++;
			
				
				while(cifra<=2) 
					cifra=cifra-2;
					mon2++;
			
				
				while(cifra<1) 
					cifra=cifra-1;
					mon1++;
			
				
			
				System.out.println("La cantidad " + cifra + "€ tiene los siguiente billetes y monedas");
				System.out.println("Billetes de 500€ tiene: " + bill500 );
				System.out.println("Billetes de 200€ tiene: " + bill200 );
				System.out.println("Billetes de 100€ tiene: " + bill100 );
				System.out.println("Billetes de 50€ tiene: " + bill50 );
				System.out.println("Billetes de 20€ tiene: " + bill20 );
				System.out.println("Billetes de 10€ tiene: " + bill10 );
				System.out.println("Billetes de 5€ tiene: " + bill5 );
				System.out.println("y monedas");
				System.out.println("Monedas de 2€ tiene: " + mon2 );
				System.out.println("Monedas de 1€ tiene: " + mon1 );
		
				System.out.println("Introducir otro desgrose SI o NO ");
				respuesta= teclado.next();
				
		} while(respuesta.toLowerCase().equals("si"));
		
		teclado.close();
		}
		
		

	}


