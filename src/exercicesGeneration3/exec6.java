package exercicesGeneration3;

import java.util.Scanner;

public class exec6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int number = 0;
		int qtdNumbers = 0;
		int total = 0;
		do {
			System.out.printf("Digíte um número: \n");

			try {
				number = read.nextInt();
				
				if (number % 3 == 0 &&  number != 0) {
					qtdNumbers += number;
					total++;
				}

			} catch (Exception e) {
			    System.err.println("Erro ao digitar o valor tente novamente!");

			    read.nextLine();
				continue;
			}

		} while (number != 0);

		System.out.printf("A média de todos os números múltiplos de 3 é: %.2f\n", (float) (qtdNumbers / total));

		read.close();
	}

}
