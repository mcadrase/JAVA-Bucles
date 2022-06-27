import java.util.Scanner;

public class Ejer_14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num = entrada.nextInt();
		
		System.out.println("Introduce otro numero: ");
		int num2 = entrada.nextInt();

		int i;
		
		int resta=0;
		
		for(i=num;i>=num2;i=i-num2) {
			resta++;
		}
		
		System.out.println(resta);
	}

}
