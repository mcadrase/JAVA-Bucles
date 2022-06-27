import java.util.Scanner;

public class Ejer_09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num = entrada.nextInt();
		
		int i;
		int multiplicacion;
		
		for(i=0;i<=10;i++) {
			multiplicacion=num*i;
			System.out.println(num+"x"+i+"="+multiplicacion);
		}

	}

}
