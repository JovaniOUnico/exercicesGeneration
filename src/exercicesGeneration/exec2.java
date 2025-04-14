package exercicesGeneration;

import java.util.Scanner;

public class exec2 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int n[] = new int[4];
		float sum = 0;

		for (int cont = 0; cont < 4; cont++) {
			System.out.printf("Digíte o Valor da Nota %d: \n", (cont + 1));

			try {
				n[cont] = read.nextInt();

				sum += n[cont];
			} catch (Exception e) {
				cont--;
			    System.err.println("Erro ao digitar o valor tente novamente!");

			    read.nextLine();
				continue;
			}

		}

		sum /= 4;
		System.out.printf("Média final: %.2f", sum);

	}

}
