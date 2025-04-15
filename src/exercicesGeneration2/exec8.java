package exercicesGeneration2;

import java.util.Scanner;

public class exec8 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int cod;
		float val, saldo = 1000;

		menu();

		System.out.printf("Digíte a Operação: \n");
		cod = read.nextInt();

		switch(cod) {
			case 1:
				System.out.println("Operação - Saldo");
				System.out.printf("Saldo: R$ %.2f\n", saldo);
				break;
			case 2:				
				System.out.printf("Digíte o valor: \n");
				val = read.nextFloat();

				System.out.println("Operação - Saque");
				if (val <= saldo) {				
					saldo -= val;
					System.out.printf("Novo Saldo: R$ %.2f \n", saldo);
				} else {
					System.out.println("Saldo Insuficiente!");
				}
				break;
			case 3:
				System.out.printf("Digíte o valor: \n");
				val = read.nextFloat();

				System.out.println("Operação - Depósito");
				saldo += val;
				System.out.printf("Novo Saldo: R$ %.2f \n", saldo);
				break;
			default:
				System.out.println("Operação inválida");
				break;
		}
		

		read.close();
	}

	public static void menu() {
		System.out.println("| Calculadora, Selecione a Operação ");
		System.out.println("|- 1 | Saldo");
		System.out.println("|- 2 | Saque");
		System.out.println("|- 3 | Depósito");
	}

}
