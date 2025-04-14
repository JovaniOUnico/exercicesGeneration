package exercicesGeneration;

import java.util.Scanner;

public class exec4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		float n[] = new float[4];
		float res = 0;

		for (int cont = 0; cont < 4; cont++) {
			System.out.printf("Digíte o valor %d: \n", (cont + 1));

			n[cont] = read.nextFloat();
		}

		res = (n[0] * n[1]) - (n[2] * n[3]);
		System.out.printf("Diferença: %.2f", res);

	}

}
