package exercicesGeneration3;

import java.util.Scanner;

public class exec5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int number = 0;
		int qtdPosNumbers = 0;
		do {
			System.out.printf("Digíte um número: \n");

			try {
				number = read.nextInt();
				
				if (number > 0) {
					qtdPosNumbers += number;
				}

			} catch (Exception e) {
			    System.err.println("Erro ao digitar o valor tente novamente!");

			    read.nextLine();
				continue;
			}

		} while (number != 0);

		System.out.printf("A soma dos números positivos é: %d\n", qtdPosNumbers);

		read.close();
	}

}
