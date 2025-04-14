package exercicesGeneration;

import java.util.Scanner;

public class exec1 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		float salary, abono, newSalary;
		System.out.println("Digíte o Valor do Salário: ");
		salary = read.nextFloat();

		System.out.println("Digíte o Valor do abono");
		abono = read.nextFloat();

		newSalary = (abono + salary);
		System.out.printf("O valor do novo salário é:\n");
		System.out.printf("%.2f", newSalary);

	}

}
