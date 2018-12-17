import java.util.Scanner;

public class ContadorCaracteres {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);	
		System.out.println("Escribe una palabra");
		
				String s; 
				int contadorA = 0;
				int contadorE = 0;
				int contadorI = 0;
				int contadorO = 0;
				int contadorU = 0;
				
				s = teclado.nextLine().toLowerCase(); //tolowerCase para pasar todas las letras a minuscula
				// el nextline y toloweCase son metodos refernecia o caracteristica de la clase Scanner
				
				
				for(int i=0;i<s.length();i++) {
					 
						if (s.charAt(i)=='a') {
						  contadorA++;
					  }
					  
					    if (s.charAt(i)=='e') {  	
						    contadorE++;
					    }
					    
					    if (s.charAt(i)=='i') {  	
			   			    contadorI++;
					    }
					  
					    if (s.charAt(i)=='o') {  	
						    contadorO++;
					    }
					  
					    if (s.charAt(i)=='u') {  	
						    contadorU++;
					    }
					    
					  }
				
					
				
				
				
		System.out.println( "La letra a se repite "  + contadorA );
		System.out.println( "La letra e se repite "  + contadorE );
		System.out.println( "La letra i se repite "  + contadorI );
		System.out.println( "La letra o se repite "  + contadorO );
		System.out.println( "La letra u se repite "  + contadorU );

		
		teclado.close();
	}

}
