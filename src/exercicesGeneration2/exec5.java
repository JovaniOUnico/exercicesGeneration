package exercicesGeneration2;

import java.util.Scanner;

public class exec5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int cod, qtd;
		float res = 0;

		exec5.menu();

		System.out.printf("Digíte o Código do produto: \n");
		cod = read.nextInt();
		
		System.out.printf("Digíte a Quantidade de itens: \n");
		qtd = read.nextInt();

		switch(cod) {
			case 1:
				res = (float) (10.0 * qtd);
				System.out.println("Produto: Cachorro Quente");
				break;
			case 2:
				res = (float) (15.0 * qtd);
				System.out.println("Produto: X-Salada");
				break;
			case 3:
				res = (float) (18.0 * qtd);
				System.out.println("Produto: X-Bacon");
				break;
			case 4:
				res = (float) (12.0 * qtd);
				System.out.println("Produto: Bauru");
				break;
			case 5:
				res = (float) (8.0 * qtd);
				System.out.println("Produto: Refrigerante");
				break;
			case 6:
				res = (float) (13.0 * qtd);
				System.out.println("Produto: Suco de laranja");
				break;
			default:
				System.out.println("Código inválido");
				break;
		}
		System.out.printf("Valor total: %.2f\n", res);

		read.close();

	}

	public static void menu() {
		System.out.println("| Código do Produto  | Produto         | Preço   Unitário");
		System.out.println("|- 1                 | Cachorro Quente | R$ 10.00");
		System.out.println("|- 2                 | X-Salada        | R$ 15.00");
		System.out.println("|- 3                 | X-Bacon         | R$ 18.00");
		System.out.println("|- 4                 | Bauru           | R$ 12.00");
		System.out.println("|- 5                 | Refrigerante    | R$ 8.00");
		System.out.println("|- 6                 | Suco de laranja | R$ 13.00");
	}

}
