package EJ32;

import java.util.Arrays;
import java.util.Scanner;

public class EJ32 {

	public static void main(String[] args) {

		int[] array1 = miarray1();
		int[] array2 = copiadearray(array1);

		System.out.println("Los numeros del segundo array copiado son:");

		for (int i = 0; i < array2.length; i++) {
			System.out.print("|" + array2[i]);

		}
		System.out.println("|");
	}

	public static int[] miarray1() {

		int respuesta = 0;
		Scanner aux = new Scanner(System.in);
		String valor = " ";
		
		boolean esnumero = false;

		do {
			System.out.println("De que longitud quiere el array:");
			valor = aux.nextLine();

			try {
				respuesta = Integer.parseInt(valor);
				esnumero = true;
			} catch (Exception e) {
				esnumero = false;
				System.out.println("No has introducido un numero");
			}
		} while (esnumero == false);
		
		int[] array = new int[respuesta];

		do {

			for (int i = 0; i < array.length; i++) {
				System.out.println("Introduzca los numeros del array:");
				valor = aux.nextLine();

				try {
					array[i] = Integer.parseInt(valor);
					esnumero = true;
				} catch (Exception e) {

					esnumero = false;
					System.out.println("No has introducido un numero");
				}

			}

		} while (esnumero = false);

		return array;

	}

	public static int[] copiadearray(int[] array1) {

		int[] copiadearray;

		copiadearray = Arrays.copyOf(array1, array1.length);

		return copiadearray;

	}
}
