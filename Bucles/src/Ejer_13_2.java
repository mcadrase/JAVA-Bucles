import java.util.Scanner;

public class Ejer_13_2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num = entrada.nextInt();
		
		int i;
		int divisores=0;
		
		for(i=1;i<=num;i++) {
			if(num%i==0) {
				divisores++;
			}
		}
		
		if(divisores==2) {
			System.out.println(num+" es primo.");
		}else {
			System.out.println(num+" no es primo.");
		}

	}

}
