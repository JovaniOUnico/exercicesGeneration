package exercicesGeneration2;

import java.util.Scanner;

public class exec7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int cod;
		float n1, n2, calc = 0;
		String res = "";

		exec7.menu();
		
		System.out.printf("Digíte o 1º Número: \n");
		n1 = read.nextFloat();

		System.out.printf("Digíte o 2º Número: \n");
		n2 = read.nextFloat();
		
		System.out.printf("Digíte a Operação: \n");
		cod = read.nextInt();

		switch(cod) {
			case 1:
				calc = n1 + n2;
				res = "%.2f + %.2f = %.2f";
				break;
			case 2:
				calc = n1 - n2;
				res = "%.2f - %.2f = %.2f";
				break;
			case 3:
				calc = n1 * n2;
				res = "%.2f * %.2f = %.2f";
				break;
			case 4:
				if (n2 == 0) {
					res = "Operação Inválida";
				} else {					
					calc = n1 / n2;
					res = "%.2f / %.2f = %.2f";
				}
				break;
			default:
				res = "Opção inválida";
				break;
		}
		
		res += "\n";

		if (cod > 0 && cod <= 4) {
			System.out.printf(res, n1, n2, calc);
		} else {
			System.out.println(res);
		}

		read.close();

	}

	public static void menu() {
		System.out.println("| Calculadora, Selecione a Operação ");
		System.out.println("|- 1 | Soma");
		System.out.println("|- 2 | Subtração");
		System.out.println("|- 3 | Multiplicação");
		System.out.println("|- 4 | Divisão");
	}

}
