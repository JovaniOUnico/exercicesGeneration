package exercicesGeneration4;

import java.util.Scanner;

public class exec1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int[] vt = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int search;
		int pos = -1;

		System.out.println("Digite o número que você deseja encontrar: ");
		search = read.nextInt();

		for (int i = 0; i < 10; i++) {
			if (vt[i] == search) {
				pos = i;
				break;
			}
		}
		
		if (pos == -1) {
			System.out.printf("O número %d não foi encontrado!", search);
		} else {			
			System.out.printf("O número %d está localizado na posição: %d \n", search, (pos + 1));
		}

		read.close();
	}

}
