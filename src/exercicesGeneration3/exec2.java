package exercicesGeneration3;

import java.util.Scanner;

public class exec2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int entries = 10;
		int n[] = new int[entries];
		int qtdPar = 0;
		int qtdImpar = 0;

		for (int cont = 0; cont < entries; cont++) {
			System.out.printf("Digíte um valor Numérico: \n");

			try {
				n[cont] = read.nextInt();

				if (n[cont] % 2 == 0) {
					qtdPar++;
				} else {
					qtdImpar++;
				}
			} catch (Exception e) {
				cont--;
			    System.err.println("Erro ao digitar o valor tente novamente!");

			    read.nextLine();
				continue;
			}

		}

		System.out.printf("Total de números pares: %d\n", qtdPar);
		System.out.printf("Total de números impares: %d\n", qtdImpar);

		read.close();
	}

}
