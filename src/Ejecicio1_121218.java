
public class Ejecicio1_121218 {

	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, un método llamado 'contiene' que
	 * reciba dos parámetros: un vector de cadenas de caracteres y una cadena.
	 * El método retornará true si la cadena recibida en el segundo parámetro
	 * se encuentra almacenada en el vector y false en caso contrario.
	 * El método incluirá una única sentencia 'return' y no está permitido el
	 * uso de variables booleanas.
	 */
	
	public static boolean contiene  (String [] vector, String cadena){
		
		for (int i=0; i<cadena.length();i++) {
			if (cadena.equals (vector [i]) ) {
				return true;
				}
			}	return false;
		
			
	}
	
	
	public static void main(String[] args) {
		
		String [] vector = {"audi", "masserati","pagani"};
		String cadena = "pagani";
		
		
	System.out.println("¿pertenecen a la misma compañia?");
		System.out.println(contiene (vector,cadena));
		System.out.println(contiene (vector,cadena));
		System.out.println(contiene (vector,cadena));
		
		
		
		
	}
}
