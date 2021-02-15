import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
/*Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, obtenga la cantidad de números pares que tiene y la imprima.*/
public class arreglos2 {
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static int [] enteros = new int [MAX];
	public static void main (String[] args) {
		//declarar arreglo
		//cargar arreglo
		cargar_arreglo(enteros);
		//calcular pares
		int cantidad_de_numeros_pares =calcular_pares(enteros);
		//imprimir
		imprimir_arreglo_enteros(enteros, cantidad_de_numeros_pares);
	}
	private static int calcular_pares(int[] enteros2) {
		int contador=0;
		for(int pos=0;pos<MAX;pos++) {
			if(enteros2[pos]%2==0) {
				contador++;
			}
		}
		
		System.out.println(contador);

		return contador;
	}
	private static void imprimir_arreglo_enteros(int[] enteros2, int cantidad_numeros_pares) {
		for(int pos=0; pos<MAX;pos++) {
			System.out.print(" "+ enteros2[pos]);
		}
	}
	private static void cargar_arreglo(int[] arreglo_enteros) {
		Random r = new Random();
		for(int pos=0; pos<MAX; pos++) {
			arreglo_enteros[pos]= (r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR);
		}
	}
}
