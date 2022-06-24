import java.util.Scanner;

public class Ejer_05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num = entrada.nextInt();
		
		int i;
		int suma=0;
		
		for(i=0;i<=num;i++) {
			suma=suma+i;
			System.out.println("la suma es: "+suma+" y el valor es: "+i);
		}
	}
}
