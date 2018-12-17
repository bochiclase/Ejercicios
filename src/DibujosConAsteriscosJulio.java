
//para corregir

public class DibujosConAsteriscosJulio {

	static void volcan (int h) {
		int asteriscos=2;
		int espacios= 0;
		int total= (int)Math.pow(2,h)/2; // es una esplesion elevada. en este casoe sta elevada
		//al numero de filas H
		
		
		
		for (int i=0; i<h; i++) {
		
			for (int j=0; j<espacios; j++) {
				espacios = total - asteriscos/2;
			System.out.print(" ");
			}
			
			for (int j=0; j<asteriscos; j++) {
				System.out.print("*");
				
			}
			asteriscos += asteriscos;
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		volcan(6); //lineas que va dibujar
		

	}

}



