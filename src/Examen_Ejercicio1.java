
public class Examen_Ejercicio1 {

	public static boolean contiene(String[] vector, String cadena) {

	//	for (int i = 0; i < vector.length; i++) {
	//		if (cadena.equals(vector[i])) {
	//			return true;
	//		} else {
	//			return false;
	//		}
	//	}
//	}

	int i= 0;
	while(i < vector.length && !cadena.equals(vector[i]))
		i++;

	if (i < vector.length)
		return true;
	else
		return false;

	// return i < vector.length;

	}
	public static void main(String[] args) {
		String[] cuerdas = { "c1", "c2", "c3", "c4" };
		System.out.println(contiene(cuerdas, "hola"));
		System.out.println(contiene(cuerdas, "c1"));
		System.out.println(contiene(cuerdas, "c2"));

	}
}