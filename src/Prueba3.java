
import java.util.Scanner;

public class Prueba3 {
	
	static Scanner in = new Scanner(System.in);
	static String [][] rasgos = { //¿porque utiliza una matriz y no un vector?
		{"pelo","WWWWWWWWW", "\\\\\\//////", "|\"\"\"\"\"\"\"|", "|||||||||"},
		{"ojos", "|  O O  |", "|-(· ·)-|", "|-(o o)-|", "|  \\ /  |"},
		{"nariz", "@   J   @", "{   \"   }", "[   j   ]", "<   -   >"},
		{"boca", "|  ===  |", "|   -   |", "|  ___  |", "|  ---  |"},
		{"barbilla", "\\_______/", "\\,,,,,,,/"}
	};
	
	//Esto es el metodo
	
	static String getOpcion(int rasgo) { // Rasgo es el valor de las columnas
		int opcion;		//El valor de opcion es la entrada por teclado
		for (int i=1; i<rasgos[rasgo].length; i++)
			System.out.println(i + " - " + rasgos[rasgo][i]);
		do {
			System.out.println("Elige la opción para " + rasgos[rasgo][0] + " (1-" + (rasgos[rasgo].length -1) + "):");
			opcion = in.nextInt();
			if (opcion < 1 || opcion > rasgos[rasgo].length)
				System.out.println("La opción elegida no es correcta. Vuelve a introducirla");
		} while (opcion < 1 || opcion > rasgos[rasgo].length);
		return rasgos[rasgo][opcion]; //Opcion es la columna por ejemplo un tipo de pelo
	}
	
	//Esto es la invocion 
	
	public static void main(String[] args) {
		
		// ¿Preguntar por esto?
		
		String [] retrato = new String[5];
		for (int i=0; i<retrato.length; i++)
			retrato[i] = getOpcion(i);
		for (int i=0; i<retrato.length; i++)
			System.out.println(retrato[i]);
	}
	
}