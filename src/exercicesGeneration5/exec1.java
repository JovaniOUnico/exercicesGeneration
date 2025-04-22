package exercicesGeneration5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exec1 {

	public static void main(String[] args) {
		
		List<String> cores = new ArrayList<String>();

		Scanner read = new Scanner(System.in);

		int entries = 5;

		for (int cont = 0; cont < entries; cont++) {
			System.out.printf("Digíte uma cor: \n");

			try {
				cores.add(read.nextLine());

			} catch (Exception e) {
				cont--;
			    System.err.println("Erro ao digitar o valor tente novamente!");

				//CLEAR \n
				read.skip("\\R");
				continue;
			}

		}
		
		System.out.println("Lista de cores:");

		for (String cr : cores) {
			System.out.println(cr);
		}
		
		System.out.println("-----");
		System.out.println("Lista de cores ordenadas:");

		Collections.sort(cores);
		for (String cr : cores) {
			System.out.println(cr);
		}
		
		read.close();

	}

}
