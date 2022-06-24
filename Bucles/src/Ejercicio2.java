import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("tablas de multiplicar");
		System.out.println("Introduce un número del 1 al 10");
		int num = teclado.nextInt();

		int i = 1;
		while ( i <= 10) {
			System.out.printf("%d x %d = %d\n", num, i, num * i);
			i++;
		}

	}

}
