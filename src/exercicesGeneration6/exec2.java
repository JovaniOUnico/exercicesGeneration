package exercicesGeneration6;

import java.util.Scanner;
import java.util.Stack;

public class exec2 {

	public static void main(String[] args) {
        Stack<String> pilhaLivros = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1: Adicionar um novo livro na pilha");
            System.out.println("2: Listar todos os livros da Pilha");
            System.out.println("3: Retirar um livro da pilha");
            System.out.println("0: Finalizar o programa");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do livro a ser adicionado: ");
                    String nomeLivro = scanner.nextLine();
                    pilhaLivros.push(nomeLivro);
                    System.out.println("Livro '" + nomeLivro + "' adicionado à pilha.");
                    break;
                case 2:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha de livros está vazia.");
                    } else {
                        System.out.println("Livros na pilha (do topo para a base):");
                        for (int i = pilhaLivros.size() - 1; i >= 0; i--) {
                            System.out.println((pilhaLivros.size() - i) + ": " + pilhaLivros.get(i));
                        }
                    }
                    break;
                case 3:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha de livros está vazia. Não há livros para retirar.");
                    } else {
                        String livroRetirado = pilhaLivros.pop();
                        System.out.println("Livro '" + livroRetirado + "' retirado da pilha.");
                    }
                    break;
                case 0:
                    System.out.println("Finalizando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, digite uma opção válida.");
            }
        } while (opcao != 0);

        scanner.close();
	}

}
