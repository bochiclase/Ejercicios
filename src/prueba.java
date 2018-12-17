//import java.util.Scanner;


//Ejercio 3 del examen Dibujo de una cruz

public class prueba {

	static void tablero (int f, int c) {
		
		for (int i=1; i<=f; i++) {
			
			
			for (int j=0; j<3; j++) {
		
				
				
				if (i%2 == 0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			
			
		}
		}System.out.println();
	}
	
	


public static void main(String[] args) {

    tablero (10,10);
}
}

