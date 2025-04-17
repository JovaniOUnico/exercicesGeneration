package exercicesGeneration4;

import java.util.Scanner;

public class exec4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		float vt[][] = new float[10][4];
		float avg[]  = new float [10];

		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite as notas do estudante numero %d: \n", (i + 1));
			avg[i] = 0;
			for (int j = 0; j < 4; j++) {
				System.out.printf("Nota do %dº bimestre: \n", (j + 1));
				try {
					vt[i][j] = read.nextFloat();
				} catch (Exception e) {
					j--;
				    System.err.println("Erro ao digitar o valor tente novamente!");

				    read.nextLine();
					continue;
				}
				avg[i] += vt[i][j];
			}
		}

		System.out.println("Lista de médias");
		for (int i = 0; i < 10; i++) {
			System.out.printf("Média aluno %d: %.1f\n", (i+1), (float) (avg[i] / 4));
		}

		read.close();
	}

}
