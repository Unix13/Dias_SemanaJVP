/**
 * 
 */
package diasSemana;

import java.util.Scanner;

/**
 * @author vivas
 *
 */

//Inicio del programa y declaraci�n de variables:
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
				solucion = "El d�a seleccionado es LUNES";
				break;
			case 2:
				solucion = "El d�a seleccionado es MARTES";
				break;
			case 3:
				solucion = "El d�a seleccionado es MI�RCOLES";
				break;
			case 4:
				solucion = "El d�a seleccionado es JUEVES";
				break;
			case 5:
				solucion = "El d�a seleccionado es VIERNES";
				break;
			case 6:
				solucion = "El d�a seleccionado es S�BADO";
				break;
			case 7:
				solucion = "El d�a seleccionado es DOMINGO";
				break;
			default:
				solucion = "ERROR: n�mero incorrecto.";
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
		System.out.println("El programa te devuelve el d�a de la semana seleccionando:");
		System.out.println("1.- Lunes.");
		System.out.println("2.- Martes.");
		System.out.println("3.- Mi�rcoles.");
		System.out.println("4.- Jueves.");
		System.out.println("5.- Viernes.");
		System.out.println("6.- S�bado.");
		System.out.println("7.- Domingo.");
		System.out.println("_____________________________________________________________");
		System.out.print("Dime un n�mero y te digo a qu� d�a de la semana corresponde: ");
		numero = numeroDia.nextInt();
		return numero;
	}
}