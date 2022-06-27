import java.util.Scanner;

public class Ejer_11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num = entrada.nextInt();
		
		int i = 0;
		int multiplicacion;
		
		do {
			multiplicacion=num*i;
			System.out.println(num+"x"+i+"="+multiplicacion);
			++i;
		}while(i<=10);

	}

}
