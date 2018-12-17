import java.util.Random;

public class Examen_Ejercicio6 {

	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(401) + 100;
		int [] vector = new int [n];
		for (int i=0;i<n; i++)
			vector [i] = r.nextInt (1000001);
		int min = Integer.MAX_VALUE;
		for (int i=1; i<n; i++) {
			int dif = vector[i] - vector [i-1];
			if (dif < min)
				min = dif;
		}
		System.out.println("Diferencia minima: " + min);
	}

}
