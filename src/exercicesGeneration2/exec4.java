package exercicesGeneration2;

import java.util.Scanner;

public class exec4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.printf("Digite as caracteristicas do animal: \n");
		
		int entries = 3;
		String n[] = new String[entries];

		for (int cont = 0; cont < entries; cont++) {
			try {
				n[cont] = read.nextLine();

			} catch (Exception e) {
				cont--;
			    System.err.println("Erro ao digitar o valor tente novamente!");
			    System.err.println("Não digite valores numéricos");

			    read.nextLine();
				continue;
			}

		}

		String res = "";
		if (n[0].equalsIgnoreCase("vertebrado")) {
			if (n[1].equalsIgnoreCase("ave")) {
				if (n[2].equalsIgnoreCase("carnivoro")) {
					res = "Águia";
				} else if (n[2].equalsIgnoreCase("onivoro")) {
					res = "Pomba";
				}
			} else if (n[1].equalsIgnoreCase("mamifero")) {
				if (n[2].equalsIgnoreCase("onivoro")) {
					res = "Homem";
				} else if (n[2].equalsIgnoreCase("herbivoro")) {
					res = "Vaca";
				}
			}
		} else if (n[0].equalsIgnoreCase("invertebrado")) {
			if (n[1].equalsIgnoreCase("inseto")) {
				if (n[2].equalsIgnoreCase("hematófago")) {
					res = "Pulga";
				} else if (n[2].equalsIgnoreCase("herbivoro")) {
					res = "Lagarta";
				}
			} else if (n[1].equalsIgnoreCase("anelideo")) {
				if (n[2].equalsIgnoreCase("hematofago")) {
					res = "Sanguessuga";
				} else if (n[2].equalsIgnoreCase("onivoro")) {
					res = "Minhoca";
				}
			}
		}

		System.out.println(res);
		read.close();
	}
	
	

}
