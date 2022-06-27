import java.util.Scanner;

public class Ejer_13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num = entrada.nextInt();
		
		int i;
		boolean primo=true;
		
		for(i=2;i<num;i++) {
			if(num%i==0) {
				primo=false;
			}
		}
		
		if(primo==true) {
			System.out.println(num+" es primo.");
		}else {
			System.out.println(num+" no es primo.");
		}
	}

}
