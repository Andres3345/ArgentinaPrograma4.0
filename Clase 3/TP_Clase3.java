package Clase3;

public class TP_Clase3 {

	public static void main(String[] args) {
		
		String palabra="Estrictamente encuentre el caracter e";
		char caracterBuscado='e';
		int contador=0, posicion;
		
		posicion=palabra.toLowerCase().indexOf(caracterBuscado);
		
		if(posicion==-1) {
			System.out.println("El caracter no esta en el texto.");
		}else {
			for(int i=posicion;i<palabra.length();i++)
				if(palabra.toLowerCase().charAt(i) == caracterBuscado) contador++;
		}
		
		System.out.println("Cant: "+contador);

	}

}
