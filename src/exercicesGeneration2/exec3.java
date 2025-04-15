package exercicesGeneration2;

import java.util.Scanner;

public class exec3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		String name = "";
		int age;
		boolean firstTime;

		System.out.printf("Digite o Nome do doador: \n");
		name = read.nextLine();

		System.out.printf("Digite a Idade do doador: \n");
		age = read.nextInt();

		System.out.printf("Primeira doação de sangue?: \n");
		firstTime = read.nextBoolean();

		String res = "%s Não esta apto";
		if (age >= 18 && age < 60) {
			res = "%s esta apto";
		} else if ((age >= 60 && age <= 69) && !firstTime) {
			res = "%s esta apto";
		}

		res += " para doar sangue!";

		System.out.printf(res, name);

		read.close();
	}

}
