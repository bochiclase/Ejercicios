public class Mosaico {

   //Ejercicio Victor Volcan y tablero o moasico
	
	//Definir tres métodos: volcán, mozaico y tablero
    static void volcan (int h) {    //VOID por ser un método que no retorna nada

        int asteriscos=2;
        int espacios;
        int total = (int)Math.pow(2,h)/2; 
            for (int i=0; i<h; i++){
                espacios = total - asteriscos/2;
                for (int j=0; j<espacios; j++)         //CUIDADO CON LOS ; DESPUES DE DECLARAR EXPRESIONES EN EL BUCLE FOR!!!
                    System.out.print(" ");
                for (int j=0; j<asteriscos; j++)     //Si los bucles no están anidados se puede usar la misma variable de control
                    System.out.print("*");
            asteriscos += asteriscos;    //Al final de cada línea se duplica la cantidad de asteríscos: += es igual que 2
            System.out.println();
        }
    }


    static void mosaicos (int f, int c) {

    	 for (int i=0; i<f; i++){
             for (int j=0; j<c; j++) {

                 //System.out.print (?"La sentencia correcta" : "Setencia falsa");
 /*
                 if ((i%2==0 && j%2 !=0 || i%2!=0 && j%2==0)){
                     System.out.print("");
                 } else {
                     System.out.print(" ");
                 }
                 */
             	System.out.print((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0)?'*':' ');
             }
             System.out.println();
                }
            }
         
        
    

    public static void main(String[] args) {

        volcan (6);
        mosaicos (8,8);

    }

}
//TAREA PARA EL PUENTE:
  //  -QUITAR EL IF DEL MOSAICO
    //-HACER EL TABLERO CON VARIABLES DE ANCHO Y ALTO

