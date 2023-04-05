package Integrador;
import java.util.*;

public class juego {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Scanner seguir = new Scanner(System.in);
		
		String eleccion = "", deNuevo = "";
		int l = 0, v = 0, e = 0, ganadas = 0, perdidas = 0, empates= 0, partTotales = 0;
		int puntaje = 0;
		boolean pase = false;
		
		do {
		
		l = (int)(Math.random()*5+0);
		v = (int)(Math.random()*5+0);
		/*if(a==b) {
			a = a-1;
		}*/
		do {
			System.out.print("Ganador: Local - Visitante: ");
			eleccion = entrada.nextLine();
			if(eleccion.equalsIgnoreCase("l") || eleccion.equalsIgnoreCase("v") ) {
				pase = true;
			}
		}while(pase == false);
		
		System.out.println("Local: " + l + "  |    Visitante: " + v);
		
		if(eleccion.equalsIgnoreCase("l")) {
			if(l > v) {
				ganadas += 1;
				System.out.println("Has Ganado!!!");
			}else {
				perdidas += 1;
				System.out.println("Has Perdido!!!");
			}			
		}else {
			if(v > l) {
				ganadas += 1;
				System.out.println("Has Ganado!!!");
			}else {
				perdidas += 1;
				System.out.println("Has Perdido!!!");
			}
			if(l == v) {
				empates += 1;
			}
		}
		
		
		
		System.out.println("Partidas Ganadas: " + ganadas + "  |  Partidas Perdidas: " + perdidas + "  |  Empates: " + empates);
		partTotales += 1;
		
		puntaje = (ganadas * 3) + (empates * 1); 
				
		System.out.print("Jugar de nuevo? S/N: ");
		deNuevo = seguir.nextLine();
		
		}while(deNuevo.equalsIgnoreCase("s"));
		System.out.println("\n");
		System.out.println("Partidas Jugadas: " + partTotales);
		System.out.println("Partidas Ganadas: " + ganadas);
		System.out.println("Partidas Perdidas: " + perdidas);
		System.out.println("Conseguiste " + "[" + puntaje + "] " + "puntos\n");
		System.out.println("GRACIAS POR JUGAR!!!");
		
	}

}
