import java.util.Scanner;

public class TrianguloClase {

	public static void main(String[] args) {
		 
		int b;
		int c;
		int d;
		int e;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una media");
		
		b= teclado.nextInt();
		
		System.out.println("Introduce otra medida");
		c= teclado.nextInt();
		
		System.out.println("Introduce la ultima medida");
		d= teclado.nextInt();
		
		if (b < c+d && c < b+d && d < b+c) {
			System.out.println("El triangulo es valido");
		}
		
		else {
			System.out.println("El triangulo no es valido");
		}
		
		

	}

}
