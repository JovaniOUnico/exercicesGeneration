package exercicesGeneration4;

import java.util.Scanner;

public class exec2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int vt[] = new int[10], sum = 0;
		String resPares = "", resImpares = "";
		float avg = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o número que você deseja adicionar ao vetor: ");
			vt[i] = read.nextInt();
		}

		for (int j = 0; j < 10; j++) {
			if (vt[j] % 2 == 0) {
				resPares += " " + vt[j];
			}
			
			if (j % 2 != 0){
				resImpares += " " + vt[j];
			}
			
			sum += vt[j];
		}
		
		avg = (float) sum/10;

		System.out.printf("Elementos nos índices ímpares: %s \n", resImpares);
		System.out.printf("Elementos pares: %s \n", resPares);
		System.out.printf("Soma: %d \n",sum);
		System.out.printf("Média: %.2f \n", avg);

		read.close();
	}

}
