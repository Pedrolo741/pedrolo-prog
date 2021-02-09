import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica {

	public static void main(String[] args) {
		int numero;
		try {
			
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ingrese numero: ");
		numero= Integer.valueOf(entrada.readLine());
		 if(numero>=0) {
			 if(numero>=100) System.out.println("es grande");
			 else if(numero<100) System.out.println("tuvieja");
			 System.out.println("positivocovid");
		 }
		else if(numero<0) {
			if(numero%2==0) System.out.println("es par");
			if(numero%3==0) System.out.println("es multiplo de tres");
			else System.out.print("ns/nc");
		}
		}
		catch(Exception exc){
			System.out.print(exc);
		}
		
	}

}
