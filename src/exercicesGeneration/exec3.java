package exercicesGeneration;

import java.util.Scanner;

public class exec3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		float salary, aditional, discount, extraHour;

		System.out.println("Digíte seu salário:");
		salary = read.nextFloat();

		System.out.println("Digíte o adicional noturno:");
		aditional = read.nextFloat();

		System.out.println("Digíte o numero de horas:");
		extraHour = read.nextFloat();

		System.out.println("Digíte o disconto:");
		discount = read.nextFloat();
		
		float res = (salary + aditional + (extraHour * 5)) - discount;

		System.out.printf("Salário Líquido: %.2f", res);

	}

}
