import java.util.Scanner;

public class PonerCubos {

	public static void main(String[] args) {
		
		int n;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe el numero y sera elevado al cubo");
		
		n=teclado.nextInt()+1;
		int sgtimpar =0;
		

		for (int i=1; i<n; i++) { //escribir lineas
					
			int acumulador =0;
					
			
				for (int j=1; j<i; j++) { //contar sumas
					acumulador += sgtimpar;
					sgtimpar += 2;
					
				}
				
				
				System.out.println(i + " * 3 = " + acumulador +"  "+ sgtimpar);
					}			
				
				
			}
	
		
	}

