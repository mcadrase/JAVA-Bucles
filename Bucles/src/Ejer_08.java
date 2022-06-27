import java.util.Scanner;

public class Ejer_08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num = entrada.nextInt();
		
		int i;
		
		for(i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i+" es divisor de "+num);
			}
		}

	}

}
