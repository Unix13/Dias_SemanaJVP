/**
 * 
 */
package diasSemana;

import java.util.Scanner;

/**
 * @author vivas
 *
 */

//Inicio del programa y declaración de variables:
public class DiasSemana {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int numero
			;
			String solucion = null;
// Solicitud de datos al usuario
			numero = decisionDia(scanner);
// Realizamos comparaciones y mostramos el resultado
			switch (numero) {
			case 1:
				solucion = "El día seleccionado es LUNES";
				break;
			case 2:
				solucion = "El día seleccionado es MARTES";
				break;
			case 3:
				solucion = "El día seleccionado es MIÉRCOLES";
				break;
			case 4:
				solucion = "El día seleccionado es JUEVES";
				break;
			case 5:
				solucion = "El día seleccionado es VIERNES";
				break;
			case 6:
				solucion = "El día seleccionado es SÁBADO";
				break;
			case 7:
				solucion = "El día seleccionado es DOMINGO";
				break;
			default:
				solucion = "ERROR: número incorrecto.";
			}
			System.out.println(solucion);
		}
	}

	/**
	 * @param numeroDia
	 * @return
	 */
	public static int decisionDia(Scanner numeroDia) {
		int numero;
		System.out.println("El programa te devuelve el día de la semana seleccionando:");
		System.out.println("1.- Lunes.");
		System.out.println("2.- Martes.");
		System.out.println("3.- Miércoles.");
		System.out.println("4.- Jueves.");
		System.out.println("5.- Viernes.");
		System.out.println("6.- Sábado.");
		System.out.println("7.- Domingo.");
		System.out.println("_____________________________________________________________");
		System.out.print("Dime un número y te digo a qué día de la semana corresponde: ");
		numero = numeroDia.nextInt();
		return numero;
	}
}