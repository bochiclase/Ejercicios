import java.util.Random;

public class ArraysDe2Dimensiones {

	public static void main(String[] args) {
		
		
		
		Random r= new Random();
		
		//una linea vector
		
		//este ejercicio matriz
		
		
		//primer corchete filas, segundo corcherte columnas
		
		int [][] matriz;
		matriz = new int [7][5];
		
		for (int i=0; i<7; i++)  //recorro filas
			for (int j=0; j<5; j++) //recorro columnas
				
				matriz[i][j] = r.nextInt(100); // mete dentro de las filas y comunas un valor aleatorio
		
		for (int i=0; i<7; i++) { //recorro la matriz las filas
			for(int j=0; j<5; j++) //recorro la matriz las columnas
				
				System.out.print(String.format("% 3d", matriz[i][j])); //estoy formateando, el "% 3d" es una especificaion de formato
																		//El espacio y el 3 me dice que es un numero entero de maximo de 3 digitos
																		// Si no tiene 3 digitos rellena con espacios en blanco por eso el espacio entre el % y el 3
		
			//en vez de poner un espacio escribo "%-2d" alineo a la izquierda "%+2d" alinea a la derecha
			//Esta documentación esta en la clase String
			
			System.out.println();
				
		}
	}

}
