import java.util.Scanner;

public class Extra4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce 10 numeros para saber cual es el menor.");
		
		int i;
		int num=0;
		int menor;
		
		for(i=1;i<=10;i++) {
			menor=num;
			System.out.println("Introduce el numero "+i+": ");
			
			num = entrada.nextInt();
			
			if(num<menor) {
				menor=num;
			}
		}
		
		System.out.println("El menor es: "+menor);

	}

}
