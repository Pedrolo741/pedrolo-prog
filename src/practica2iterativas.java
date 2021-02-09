import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practica2iterativas {

	/* Escribir un programa que mientras el usuario ingrese un número entero
menor que 10 y mayor a 1, muestre por pantalla si el número es múltiplo de
2 y múltiplo de 3 simultáneamente. */
	
	public static void main(String[] args) {
		int numero;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
		//el usuario carga un valor la primera vez
		System.out.println("Ingrese un numero ");
		numero = Integer.valueOf(entrada.readLine());
		while (numero<10&&numero>1){

		if(numero%2==0&&numero%3==00) {System.out.println("es multiplo de 2 y3");
		System.out.println("Ingrese un numero entero : ");
		numero = Integer.valueOf(entrada.readLine());
		}
		else {
			System.out.println("Ingrese un numero entero : ");
			numero = Integer.valueOf(entrada.readLine());
		}
		}
		System.out.println("cagaste");
		}
		catch (Exception exc){
		System.out.println(exc);
		}
	}

}
