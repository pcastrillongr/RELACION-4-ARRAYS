package EJ31;

import java.util.Arrays;
import java.util.Scanner;

public class EJ31 {

	public static void main(String[] args) {

		// 31. Escribe una función “ConcatenaArraysPro” a la que le pasas dos
		// arrays de enteros y te
		// los elementos del primero y a continuación los del segundo. Esta
		// función devolverá un
		// array de enteros (int[]) el cuál se creará dentro de la propia
		// función.
		int[] array1 = { 1, 3, 5, 7, 9 };
		int[] array2 = { 11, 13, 15, 17, 19 };
		int[] array3 = concatenaciondearrays(array1, array2);

		System.out.println("Mi array3 tiene estos numeros");
		for (int i = 0; i < array3.length; i++) {

			System.out.print("|" + array3[i]);
		}
		System.out.print("|");
	}

	public static int[] concatenaciondearrays(int[] array1, int[] array2) {
		Scanner aux = new Scanner(System.in);
		int[] auxarray = new int[10];
		for (int i = 0; i < array1.length; i++) {

			auxarray[i] = array1[i];

		}
		
		for (int i = array1.length; i < auxarray.length; i++) {

			auxarray[i] = array2[i-array2.length];
			

		}
		
		
		return auxarray;

	}

}
