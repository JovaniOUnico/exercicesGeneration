package exercicesGeneration3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exec4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		String finish = "S";
		List<String> gen = new ArrayList<String>();
		gen.add("Mulher Cis");
		gen.add("Homem Cis");
		gen.add("Não Binário");
		gen.add("Mulher Trans");
		gen.add("Homem Trans");
		gen.add("Outros");
		
		List<String> dev = new ArrayList<String>();
		dev.add("Backend");
		dev.add("Frontend");
		dev.add("Mobile");
		dev.add("FullStack");

		@SuppressWarnings("unused")
		int age, optGen, optDev;
		
		int total = 0;
		int totalBackend = 0;
		int totalFrontend = 0;
		int totalCTMobile= 0;
		int totalNBFullstack = 0;
		float avgAge = 0;

		System.out.printf("Seja bem vindo ao sistema de relatório de pesquisa: \n");
		while (finish.equalsIgnoreCase("S") == true) {

			try {
				System.out.printf("Idade: \n");
				age = read.nextInt();

				System.out.printf("Selecione seu Gênero: \n");
				exec4.menu(gen);
				optGen = read.nextInt();

				System.out.printf("Selecione a opção de pessoa Desenvolvedora: \n");
				exec4.menu(dev);
				optDev = read.nextInt();

				//CLEAR \n
				read.skip("\\R");

				System.out.printf("Deseja continuar (S/N): \n");
				finish = read.nextLine();

				total++;
				if (optDev == 1) {
					totalBackend++;
				}
				
				if (optDev == 2 && (optGen == 1 || optGen == 4)) {
					totalFrontend++;
				}
				
				if (optDev == 3 && (optGen == 2 || optGen == 5) && age > 40) {
					totalCTMobile++;
				}

				if (optDev == 4 && optGen == 3 && age < 40) {
					totalNBFullstack++;
				}

				avgAge += age;
			} catch (Exception e) {
				finish = "S";
			    System.err.println("Erro ao digitar o valor tente novamente!");

			    read.nextLine();
				continue;
			}

		}
		
		System.out.printf("Total de pessoas desenvolvedoras Backend: %d\n", totalBackend);
		System.out.printf("Total de Mulheres Cis e Trans desenvolvedoras Frontend: %d\n", totalFrontend);
		System.out.printf("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: %d\n", totalCTMobile);
		System.out.printf("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: %d\n", totalNBFullstack);
		System.out.printf("O número total de pessoas que responderam à pesquisa: %d\n", total);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.0f\n", (float) (avgAge / total));

		read.close();
	}

	public static void menu(List<String> opcs) {
		int cont = 1;
		System.out.println("| Digite uma das opções a seguir: |");
		for (String vl : opcs) {			
			System.out.printf("|- %d | %s \n", cont, vl);
			cont++;
		}
	}

}
