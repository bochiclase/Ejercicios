import java.util.Scanner;

public class Bucle {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numero;
		int negativo;
		
		
		System.out.println("Escribe un numero");	
		numero = teclado.nextInt();
		negativo = (numero*-1);
		System.out.println(negativo);
		
		float funcion;
		for (int i=1; i<=11; i++);
		
		negativo++;
		funcion=1/negativo;
		
		if (negativo<0) {
			System.out.println("Con el valor x: " +negativo +"       El resultado de la función [f(x)=1/x] es:  "+funcion);
			
			}
		else 
			System.out.println("Con el valor x: " +negativo +"       El resultado de la función [f(x)=1/x] es:  "+funcion);

	
	}


}
