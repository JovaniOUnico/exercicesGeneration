package exercicesGeneration2;

import java.util.Scanner;

public class exec2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int entries = 1;
		int n[] = new int[entries];

		for (int cont = 0; cont < entries; cont++) {
			System.out.printf("Digíte um valor Numérico: \n");

			try {
				n[cont] = read.nextInt();

			} catch (Exception e) {
				cont--;
			    System.err.println("Erro ao digitar o valor tente novamente!");

			    read.nextLine();
				continue;
			}

		}
		
		String res = "O Número %d é";
		
		if (n[0] % 2 == 0) {
			res += " Par";
		} else {
			res += " Impar";
		}

		if (n[0] > 0) {
			res += " e Positivo\n";
		} else {
			res += " e Negativo\n";
		}

		System.out.printf(res, n[0]);

		read.close();
	}

}
