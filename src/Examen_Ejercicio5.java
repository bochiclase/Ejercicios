import java.util.Scanner;

public class Examen_Ejercicio5 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int cantidad;
		do {
			do {
				System.out.println("Introduce una cantidad exacta de euros");
				cantidad = s.nextInt();
				if (cantidad <=0)
					System.out.println("Cantidad incorrecta. Vueve a introducir la cantidad correcta");
			} while();
			
			System.out.println("¿deseas realizar otro desglose?");
		} while (s.next().toLowerCase().equals("s"));
		
	}

}
