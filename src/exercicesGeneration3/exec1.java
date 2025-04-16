package exercicesGeneration3;

import java.util.Scanner;

public class exec1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int n1, n2;
		
		System.out.println("Dígite o primeiro numero:");
		n1 = read.nextInt();

		System.out.println("Dígite o segundo numero:");
		n2 = read.nextInt();
		
		if (n1 > n2) {
			System.out.println("Intervalo inválido!");
		} else {
			System.out.printf("No Intervalo entre %d e %d:\n", n1, n2);
			for (int i = n1; i < n2; i++) {
				
				if (i == 0) {
					continue;
				}
				
				if (i % 3 == 0 && i % 5 == 0) {					
					System.out.printf("%d é multiplo de 3 e 5\n", i);
				}
			}
		}

		read.close();
	}

}
