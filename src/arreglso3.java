import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class arreglso3 {
/*Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario una posición y realice un corrimiento a izquierda o hacia la
menor posición del arreglo.*/
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static int [] enteros = new int [MAX];
	public static void main(String[] args) {
		//cargar arreglo
		cargar_arreglo(enteros);
		System.out.println(Arrays.toString(enteros));
		imprimir_arreglo(enteros);
		//pedir una posicion
		int posicion_elegida=ingresar_entero();
		//acomodar arreglo de izq
		ordenar_arreglo_izq(posicion_elegida, enteros);
		imprimir_arreglo(enteros);
		}
	private static void imprimir_arreglo(int[] enteros2) {
		for(int pos=0;pos<MAX;pos++) {
			System.out.print(" " + enteros2[pos]);
		}
		System.out.println();
	}
	private static void ordenar_arreglo_izq(int posicion_elegida, int[] enteros2) {
		for(int pos=0; pos<posicion_elegida;pos++) {
			enteros2[pos]=enteros2[pos+1];
		}
	}
	private static int ingresar_entero() {
		int posicion_arreglo=0;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese numero de 1 al 10");
			posicion_arreglo= Integer.valueOf(entrada.readLine());
		}
		catch (Exception exc) {
			System.out.print(exc);
		}
		return posicion_arreglo-1;
	}
	private static void cargar_arreglo(int[] enteros2) {
		Random r= new Random();
		for(int pos=0; pos<MAX;pos++) {
			enteros2[pos] = (r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR);
		}
	}

}
