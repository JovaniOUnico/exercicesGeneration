package exercicesGeneration4;

import java.util.Scanner;

public class exec3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int vt[][] = new int[3][3];
		String resP = "", resS = "";
		int sumP, sumS;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("Digite o número para linha %d, posição %d: \n", (i + 1), (j + 1));
				try {
					vt[i][j] = read.nextInt();

				} catch (Exception e) {
					j--;
				    System.err.println("Erro ao digitar o valor tente novamente!");

				    read.nextLine();
					continue;
				}

			}
		}

		resP = vt[0][0] + " " + vt[1][1] + " " + vt[2][2];
		sumP = vt[0][0] + vt[1][1] + vt[2][2];
		resS = vt[0][2] + " " + vt[1][1] + " " + vt[2][0];
		sumS = vt[2][0] + vt[1][1] + vt[0][2];

		System.out.printf("Elementos da Diagonal Principal: %s \n", resP);
		System.out.printf("Elementos da Diagonal Secundária: %s \n", resS);
		System.out.printf("Soma dos Elementos da Diagonal Principal: %d \n",sumP);
		System.out.printf("Soma dos Elementos da Diagonal Secundária: %d \n", sumS);

		read.close();
	}

}
