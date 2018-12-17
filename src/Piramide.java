// funciona
public class Piramide {

	public static void main(String[] args) {
		 int n; 
		 int espacio;
		 int digitos;
		 
		 
		for (int i=0;i<=10;i++) {
			n = i %10;
			espacio = 10 - i;
			digitos = i + i -1;
			
			for (int j = 0; j < espacio; j++)  // aqui dibujo los espacios
				System.out.print(" ");
				
			 
				for (int h= 0; h < digitos; h++) {
					
					if (h>=digitos/2) {
						if (n<0)
							n=9;
						
							System.out.print(n--);
						
						
					}
					
					else if (h<=digitos/2) {
						if (n>9)
							n=0;
							System.out.print(n++);
						
					}
					
						
				}
								
				
			System.out.println();
		}
	

	}

}
