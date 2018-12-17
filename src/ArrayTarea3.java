import java.util.Random;
import java.util.Scanner;

public class ArrayTarea3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n;
		
		do {
		
		System.out.println("Introduca el numero de valores a mostrar mayor o igual que 10 y menor o igual que 1.000.000");
		 n =in.nextInt();
		 if (n<10 || n>1000000 )
			 System.out.println(" El numero es incorrecto vuelva  a introducir numeros mayor o igual que 10 y menor o igual que 1.000.000");
		 
		} while (n<10 || n>1000000);
		
		int [] array =new int[n];
		
		Random aleatorio= new Random();
		
		for (int i=0; i<n; i++) {
			
			array[i] = aleatorio.nextInt(201) - 100;
			
			System.out.println("La posición " + i + " tiene valor " + array[i]);
		}
		
		int suma =0;
		int parcial;
		
		for (int i=0; i<n; i++) { //pasa a circurlar todo el array
		
		if (array[i] != 13) {
				
				suma+=array[i];
		}
				else {
				parcial = array[i];
				
				for (int j=i+1; j<array.length && j<+13;j++) {
					parcial += array[j];
		
					
				}
		if (parcial == 7)
			suma+= parcial;
		i+=13;
					
				
					
				
		}
			}
		
	System.out.println("El total del valor de la suma de los valores es " + suma);
				
		
			
	
			
		
		
				
			
		
			
		
		
		
		
		
		
		
		in.close();
		
	}

}
