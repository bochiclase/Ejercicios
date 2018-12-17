
public class Examen_Ejercicio2 {

	public static char [] stringToarray(String cadena) {
		char [] vector = new char [cadena.length()];
		for (int i=0; i<vector.length; i++)
		vector[i] = cadena.charAt(i);
		return vector;
	}
	
	
	public static void main(String[] args) {
	 char [] vector = stringToarray("hola");
	 for (int i=0; i<vector.length; i++) {
		 System.out.println();
	 }
	 
		
	}






}
