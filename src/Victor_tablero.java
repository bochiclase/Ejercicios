
public class Victor_tablero {

	 static void mosaicos (int f, int c) {
		 
		 for (int i = 0; i < f; i++) {
					int x = 0;
					do {
						for (int j = 0; j < c; j++) {
							int n = 0;
							if ((i % 2 == 0 && j % 2 != 0 || i % 2 != 0 && j % 2 == 0)) {
								do {
									System.out.print("*");
									n++;
								} while (n < 3);

							} else {
								do {
									System.out.print(" ");
									n++;
								} while (n < 3);
							}
						}
						System.out.println();
						x++;
				} while (x < 3);
				}
			}
	 
	  public static void main(String[] args) {

	       
	        mosaicos (8,8);

	    }

	}
