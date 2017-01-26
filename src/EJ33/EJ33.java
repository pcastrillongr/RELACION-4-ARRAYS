package EJ33;

import java.util.Scanner;

public class EJ33 {

	public static void main(String[] args) {
		
		int array[]=pedirarray();
		int numero=pedirnumero();
		int posicion=pedirposicion(array);
		int[] arraymodificado =miarraymodificado(array,numero,posicion);

	}
	
	public static int[]pedirarray(){
		
		int[]auxarray=new int[5];
		Scanner aux=new Scanner(System.in);
		String valor=" ";
		boolean esnumero=false;
		int auxnum = 0;
		
		do{
			
			for(int i=0;i<auxarray.length;i++){
			System.out.println("Introduzca los numeros del array:");
			valor=aux.nextLine();
			
			try{
				auxarray[i]=Integer.parseInt(valor);
				esnumero=true;
			}catch(Exception e){
				
				esnumero=false;
				System.out.println("No has introducido un numero");
			}
			}
		}while(esnumero==false);
		
		return auxarray;
		
		
	}
	
	public static int pedirnumero(){
		
		Scanner aux=new Scanner(System.in);
		String valor=" ";
		boolean esnumero=false;
		int auxnum = 0;
		
		do{
			System.out.println("Introduzca el numero a insertar:");
			valor=aux.nextLine();
			
			try{
				auxnum=Integer.parseInt(valor);
				esnumero=true;
			}catch(Exception e){
				
				esnumero=false;
				System.out.println("No has introducido un numero");
			}
		}while(esnumero==false);
		
		return auxnum;
		
		
		
	}
	
	public static int pedirposicion(int[]array){
		
		Scanner aux=new Scanner(System.in);
		String valor=" ";
		boolean esnumero=false;
		int posicion= 0;
		
		do{
			System.out.println("Introduzca la posicion:");
			valor=aux.nextLine();
			
			try{
				posicion=Integer.parseInt(valor);
				esnumero=true;
			}catch(Exception e){
				
				esnumero=false;
				System.out.println("No has introducido un numero");
			}
			if(posicion>array.length)
			{
				System.out.println("la posicion no puede ser mayor que la lngitud del array");
			}
		}while(esnumero==false||posicion>array.length);
		
		return posicion;
		
	}

	public static int[]miarraymodificado(int[]array,int numero,int posicion){
		
		int[]arraymodificado=new int[array.length+1];
		
		for(int i=0;i<arraymodificado.length;i++)
		{
			arraymodificado[i]=array[i];
			System.out.print(arraymodificado[i]);
		}
		return arraymodificado;
				
				
	}
}
