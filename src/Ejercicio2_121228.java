
public class Ejercicio2_121228 {

	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, un método llamado 'stringToArray' que
	 * reciba a través de un parámetro formal un objeto de tipo String y retorne
	 * un vector de caracteres de la misma longitud que la cadena recibida que 
	 * contenga los mismos caracteres que ésta y en el mismo orden. 
	 */





public static char [] stringToArray (String objeto) {
	
	char[] vector = objeto.toCharArray();

	
		
		return vector;
		
   

	
	 
	 
		
		
		 
		 
		
	
}



/*
 * 0,25 puntos
 * 
 * Escribe en el método main las sentencias necesarias para poner a prueba
 * el método 'stringToArray' mostrando por pantalla el resultado de su ejecución. 
 */

public static void main(String[] args) {
	
char [] cadena = stringToArray("lamborgini");
	
	for (int i=0; i<cadena.length; i++) {
		
		
		System.out.println("En la posicion " + i + " se encuentra la letra " + cadena[i]);
	}
	
}



}