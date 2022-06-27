import java.util.Scanner;

public class Ejer_07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num1 = entrada.nextInt();
		
		System.out.println("Introduce un numero: ");
		int num2 = entrada.nextInt();
		
		int i;
		int total = 0;
		
		if(num1>num2) {
			for(i=num2;i<=num1;i++) {
				if(i%7==0) {
					System.out.println(i);
					++total;
				}
			}
		}
		else if(num2>num1) {
			for(i=num1;i<=num2;i++) {
				if(i%7==0) {
					System.out.println(i);
					++total;
				}
			}
		}
		else {
			System.out.println("No se puede calcular ya que son iguales");
		}
		
		System.out.println("Hay "+total+" multiplos de 7");
	}

}
