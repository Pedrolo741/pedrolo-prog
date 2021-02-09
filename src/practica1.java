import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica1 {

	public static void main(String[] args) {
		char caracter;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese caracter");
			caracter=entrada.readLine().charAt(0);
			if(caracter>=48&&caracter<=57) {
				System.out.println("digito");
			}
			else if(caracter>=97&&caracter<=122) {
				System.out.println("minuscula");
				switch (caracter) {
				case 'a','e','i','o','u':{
					
					System.out.println("es vocal");
					break;
				}
				default: {
					System.out.println("esconsoncnatesdajagodsndfskv");
				}
				}
			}
			else System.out.println("no");
		}
		catch (Exception exc) {
			System.out.print(exc);
		}
	}

}
