package exercicesGeneration2;

import java.util.Scanner;

public class exec1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int entries = 3;
		int n[] = new int[entries], sum = 0;

		System.out.println("Digíte os valores numéricos para A, B e C respectivamente");
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
		
		String res;
		sum = (n[0] + n[1]);
		if (sum > n[2]) {
			res = "A Soma de A + B é Maior do que C";
		} else if (sum == n[2]) {
			res = "A Soma de A + B é Igual C";
		} else {
			res = "A Soma de A + B é Menor do que C";
		}
		
		System.out.println(res);

		read.close();

	}

}
