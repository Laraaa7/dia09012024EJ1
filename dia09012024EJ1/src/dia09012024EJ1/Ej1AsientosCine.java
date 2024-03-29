package dia09012024EJ1;

import java.util.Scanner;

public class Ej1AsientosCine {

	/*1.Sistema de Reserva de Asientos para Cine 
   - Descripción: Crear un sistema de consola para reservar asientos en una sala de cine. El programa debe mostrar una matriz que represente los asientos (libres y ocupados) y permitir al usuario seleccionar
   asientos para reservarlos.
   - Retos: Manejar correctamente la entrada del usuario, actualizar y mostrar el estado actual de los asientos, y gestionar situaciones como asientos ya reservados o entradas inválidas.
   -Pasos:
     1. Crea una matriz para representar los asientos del cine (por ejemplo, `char[][] asientos`).
     2. Inicializa todos los asientos como libres (por ejemplo, usando el carácter 'L').
     3. Muestra la matriz de asientos en la consola.
     4. Pide al usuario que ingrese el número de fila y columna para seleccionar un asiento.
     5. Verifica si el asiento está libre. Si lo está, márcalo como ocupado (por ejemplo, con 'O'). Si no, muestra un mensaje de error.
     6. Repite los pasos 3 a 5 hasta que el usuario decida salir.

*/
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		char[][] asientos = new char [10][10];  //Matriz de 10 x 10 asientos
		
		for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = 'L';
            }
        } 
		
		//Muestra los asientos iniciales
		 System.out.println("Estado actual de los asientos:"); 
	        for (int i = 0; i < asientos.length; i++) {
	            for (int j = 0; j < asientos[i].length; j++) {
	                System.out.print(asientos[i][j] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println();

		 while (true) {
	            System.out.print("Introduce el número de fila: ");
	            int fila = scanner.nextInt();
	            
	            System.out.print("Introduce el número de columna: ");
	            int columna = scanner.nextInt();
	            
	            if (asientos[fila - 1][columna - 1] == 'L') { //Comprueba si el asiento está libre
	                asientos[fila - 1][columna - 1] = 'O'; //Si está libre lo marca con una O para ocuparlo
	                System.out.println("Acabas de reservar este asiento");
	            } else {
	                System.out.println("Error, asiento ya ocupado"); //Si ya está ocupado salta error
	            }
	     
	          //Muestra los asientos actualizados ocupados
	            System.out.println("Estado actual de los asientos:"); 
	            for (int i = 0; i < asientos.length; i++) {
	                for (int j = 0; j < asientos[i].length; j++) {
	                    System.out.print(asientos[i][j] + " ");
	                }
	                System.out.println();
	            }
	            
	            System.out.print("Quieres salir? (Si/No): ");
	            String respuesta = scanner.next();
	            if (respuesta.charAt(0)=='S'||respuesta.charAt(0)=='s') { //Si la respuesta empieza por S o s para de preguntar y termina el programa
	                break;
	                
	            }    
	        }
		 scanner.close();
	}
	
}
