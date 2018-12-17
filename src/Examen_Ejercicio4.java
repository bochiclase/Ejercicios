import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Examen_Ejercicio4 {


	import java.util.Scanner;

	public class Examen_Ejercicio5  {
		
	
	    public static void main(String[] args) {

	        Scanner teclado = new Scanner(System.in);

	        System.out.println("Introduce el dinero");
	        
	        int n = teclado.nextInt();

	        int de500 = 0;
	        int de200 = 0;
	        int de100 = 0;
	        int de50 = 0;
	        int de20 = 0;
	        int de10 = 0;
	        int de5 = 0;
	        int de2 = 0;
	        int de1 = 0;

	        while (n >= 500) {
	            n = n - 500;
	            de500++;
	        }
	        while (n >= 200) {
	            n = n - 200;
	            de200++;
	        }
	        while (n >= 100) {
	            n = n - 100;
	            de100++;
	        }
	        while (n >= 50) {
	            n = n - 50;
	            de50++;
	        }
	        while (n >= 20) {
	            n = n - 20;
	            de20++;
	        }
	        while (n >= 10) {
	            n = n - 10;
	            de10++;
	        }
	        while (n >= 5) {
	            n = n - 5;
	            de5++;
	        }
	        while (n >= 2) {
	            n = n - 2;
	            de2++;
	        }
	        while (n > 0) {
	            n = n - 1;
	            de1++;
	        }
	        if (de500 != 0)
	            System.out.println("Billetes de 500: " + de500);
	        if (de200 != 0)
	            System.out.println("Billetes de 200: " + de200);
	        if (de100 != 0)
	            System.out.println("Billetes de 100: " + de100);
	        if (de50 != 0)
	            System.out.println("Billetes de 50: " + de50);
	        if (de20 != 0)
	            System.out.println("Billetes de 20: " + de20);
	        if (de10 != 0)
	            System.out.println("Billetes de 10: " + de10);
	        if (de5 != 0)
	            System.out.println("Billetes de 5: " + de5);
	        if (de2 != 0)
	            System.out.println("Monedas de 2: " + de2);
	        if (de1 != 0)
	            System.out.println("Monedas de 1: " + de1);
	        teclado.close();
	    }
	}




