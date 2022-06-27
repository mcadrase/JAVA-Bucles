import java.util.Scanner;

public class Ejer_12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num = entrada.nextInt();
		
		int i;
		int suma=0;
		
		for(i=1;i<num;i++) {
			if(num%i==0) {
				suma=suma+i;
				if(suma!=num) {
					System.out.println(suma);
				}
				
			}
		}
		
		if(suma==num) {
			System.out.println(num+" es un numero pefecto.");
		}else {
			System.out.println(num+" no es un numero pefecto.");
		}

	}

}
