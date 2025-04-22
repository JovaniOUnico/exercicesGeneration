package exercicesGeneration5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class exec3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();

        int entries = 10, cont = 0;
        System.out.println("Digite 10 valores inteiros:");

        while (cont < entries) {
            System.out.print("Digite um valor: ");
            if (read.hasNextInt()) {
                int valor = read.nextInt();

                if (numeros.add(valor)) {
                    System.out.println("Valor " + valor + " adicionado.");
                }

                cont++;
            } else {
                System.out.println("Entrada inválida. Digite um número inteiro.");
				//CLEAR \n
				read.skip("\\R");            
			}
        }

        System.out.println("\nElementos da Collection Set:");
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        read.close();
	}

}
