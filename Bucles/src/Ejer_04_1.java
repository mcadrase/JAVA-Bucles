import java.util.Scanner;

public class Ejer_04_1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num1 = entrada.nextInt();
		
		System.out.println("Introduce un numero: ");
		int num2 = entrada.nextInt();
		
		int i;
		
		int menor;
		int mayor;
		
		if(num1>num2) {
			menor=num2;
			mayor=num1;
		}
		else if(num2>num1) {
			menor=num1;
			mayor=num2;
		}
		else {
			System.out.println("No se puede calcular ya que son iguales.");
		}
		
		for(i=num1;i<=num2;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}

	}

}