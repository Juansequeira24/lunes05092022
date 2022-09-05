package estructurarepetitiva;

import java.util.*;
public class Adivinansa {

	public static void main(String[] args) {
		//	generar un numero entre 0 y 10
	
		Scanner lector = new Scanner(System.in);
		
		long num= Math.round(Math.random()*10);
		System.out.print("Adivine un numero entre 0 y 10:");
		
		int respuesta = lector.nextInt();
		int intentos = 1;
		
		 while (num !=respuesta) {
			System.out.println("lo siento numero incorrecto,vuelva a intentarlo");
			System.out.print("Adivina un numero entre 0  y 10:");
			respuesta = lector.nextInt();
			intentos++;
			
			if(intentos== 3) {
				System.out.println("Ha agotado todos los intentos: " + intentos);
			   System.exit(respuesta);
			  
				  System.out.println("Felicidades,Adivinaste el numero es:" + num);
				  break;
			  }
			System.out.println("Fin del juego");
			}
		}
		
		
	}

