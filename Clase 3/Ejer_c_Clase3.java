package Clase3;

public class Ejer_c_Clase3 {

	public static void main(String[] args) {
		int numeros[] = {3,5,7,9,2,4}, x = 5, suma=0;
		for(int i=0;i<numeros.length;i++) {
			if( numeros[i] > x ) {
				suma += numeros[i];
			}
		}
		System.out.println("El resultado es: " + suma);

	}

}
