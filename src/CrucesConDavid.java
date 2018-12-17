// funciona es el bueno

import java.util.Scanner;


public class CrucesConDavid {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

        int C; //Número de columnas - Número impar mayor que 3
        int L; //Número de lineas - Número impar mayor que 3

        System.out.println("Introduce el número de lineas");
        C = teclado.nextInt();
        System.out.println("Introduce el número de columnas");
        L = teclado.nextInt();

        for(int i=0; i<C; i++) { // Crea C= es el numero de lineas que se van a construir
        	
        	if(i==C/2){ // Coge la lista del for de arriba y divide la lista por la mitad 
        				//  escogiendo la variable C numero de lineas como divisor en vez 
        				//	del ultimo numero del bucle
        		
        	    for(int j=0; j<L; j++) {   // Crea una lista de numeros que va a escribir en
        	    							//	una sola linea y va ser tan larga como  L columnas
        	    							//	escribe el usuario y la va colocar donde diga
        	    							// el if de arriba
        	    	
        	    	
        	    	
        	        System.out.print("1");
        	    }
        	}
        	
        	else{ // en las demas filas no tenemos nada para que escriba
        			
        		
        	    for(int j=0; j<L; j++) { // este for esta dentro del if y a su vez dentro del primer for 
        	    							// esto va a pintar desde la linea 1 hasta la que diga C
        	        
        	    				// Va a pintar a lo largo de la linea como diga L que marcara las columnas
        	    	
        	    	if(j==L/2){ // Divide el numero de columnas entre 2 que sera donde colocara la el punto y
        	    				// y asi repetirlo como hasta que se cumpla el primer for
        	    		
        	            System.out.print("*");
        	        }
        	    	
        	        else{
        	            System.out.print(" ");
        }

        teclado.close();
    }
        	}
        System.out.println(); // esta colocado fuera del cierre del primer for
        
        // si entre parentesis escribo i escribira los numeros del for
        
        // as estar vacios encita  a la repeticion del for y pintara huecos 
        
        //en lineas tantos como diga el for
        
        }
        
 
        
	}
}



