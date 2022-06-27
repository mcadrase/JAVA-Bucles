import java.util.Scanner;

public class Ejer_06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num = entrada.nextInt();
		
		int i;
		int factorial = num;
		
		for(i=1;i<num;i++) {
			factorial=factorial*i;
			System.out.println("El factorial de: "+num+" es: "+factorial+" y el valor es: "+i);
		}

	}

}
