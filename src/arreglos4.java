import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class arreglos4 {
/*Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario un numero entero y lo agregue al principio del arreglo (posición
0). Para ello tendrá que realizar un corrimiento a derecha (se pierde el último valor del arreglo) y
colocar el numero en el arreglo en la posición indicada.*/
	public static int MAX=10;
	public static int MAXVALOR=10;
	public static int MINVALOR=1;
	public static int[] enteros = new int[MAX];
	public static void main(String[] args) {
		//cargar arreglo
		cargar_arreglo(enteros);
		imprimir(enteros);
		//pedir un numero entero
		int numero_ingresado = pedir_numero_entero();
		//agregar al principio del arreglo
		agregar_numero(numero_ingresado, enteros);
		imprimir(enteros);
		
	}
	private static void imprimir(int[] enteros) {
		System.out.println(Arrays.toString(enteros));
	}
	private static void agregar_numero(int numero, int[] enteros) {
		for(int pos=MAX-1; pos>0; pos--) {
			enteros[pos]=enteros[pos-1];	
		}
		enteros[0]=numero;
	}
	private static int pedir_numero_entero() {
		int numero_ingresado=0;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese numero entero");
			numero_ingresado= Integer.valueOf(entrada.readLine());
		}
		catch (Exception exc) {
			System.out.print("ingresar numero entero");
		}
		return numero_ingresado;
	}
	private static void cargar_arreglo(int[] enteros2) {
		Random r= new Random();
		for(int pos=0; pos<MAX;pos++) {
			enteros2[pos] = (r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR);
		}
	}

}
