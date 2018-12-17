
public class Ejercicio_FirstHalf_CodingBat {

	public static String firstHalf(String str) {
		int p=str.length();
		  int m=p/2;
		  return str.substring(0,m);
		}

	
	public static void main (String [] arg ) {
		String a = firstHalf ("Murcielago");
		
		System.out.print(a);

	}
	
}
