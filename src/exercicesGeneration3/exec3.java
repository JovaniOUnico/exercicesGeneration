package exercicesGeneration3;

import java.util.Scanner;

public class exec3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int age = 1;
		int qtdLess = 0;
		int qtdMore = 0;

		while (age > 0) {
			System.out.printf("Digíte uma idade: \n");

			try {
				age = read.nextInt();
				
				if (age < 21 && age > 0) {
					qtdLess++;
				}

				if (age > 50) {
					qtdMore++;
				}

			} catch (Exception e) {
			    System.err.println("Erro ao digitar o valor tente novamente!");

			    read.nextLine();
				continue;
			}

		}

		System.out.printf("Total de pessoas menores de 21 anos: %d\n", qtdLess);
		System.out.printf("Total de pessoas maiores de 50 anos: %d\n", qtdMore);

		read.close();
	}

}
