package exercicesGeneration2;

import java.util.Scanner;

public class exec6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		String name;
		int cod;
		float sal,res = 0;

		exec6.menu();
		
		System.out.printf("Digíte o Nome do Colaborador: \n");
		name = read.nextLine();

		System.out.printf("Digíte o Código do cargo: \n");
		cod = read.nextInt();
		
		System.out.printf("Digíte o Salário: \n");
		sal = read.nextFloat();

		System.out.println("Nome do Colaborador: " + name);
		res = sal;
		switch(cod) {
			case 1:
				res += (float) (sal * 0.1);
				System.out.println("Cargo: Gerente");
				break;
			case 2:
				res += (float) (sal * 0.07);
				System.out.println("Cargo: Vendedor");
				break;
			case 3:
				res += (float) (sal * 0.09);
				System.out.println("Cargo: Supervisor");
				break;
			case 4:
				res += (float) (sal * 0.6);
				System.out.println("Cargo: Motorista");
				break;
			case 5:
				res += (float) (sal * 0.5);
				System.out.println("Cargo: Estoquista");
				break;
			case 6:
				res += (float) (sal * 0.8);
				System.out.println("Cargo: Técnico de TI");
				break;
			default:
				System.out.println("Código inválido");
				break;
		}
		System.out.printf("Valor total: R$ %.2f\n", res);

		read.close();

	}

	public static void menu() {
		System.out.println("| Código do Cargo    | Cargo           | Percentual do Reajuste");
		System.out.println("|- 1                 | Gerente         | 10% ");
		System.out.println("|- 2                 | Vendedor        | 7% ");
		System.out.println("|- 3                 | Supervisor      | 9% ");
		System.out.println("|- 4                 | Motorista       | 6% ");
		System.out.println("|- 5                 | Estoquista      | 5% ");
		System.out.println("|- 6                 | Técnico de TI   | 8%");
	}

}
