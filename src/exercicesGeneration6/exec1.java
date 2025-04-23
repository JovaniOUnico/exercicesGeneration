package exercicesGeneration6;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exec1 {

	 public static void main(String[] args) {
	        Queue<String> filaClientes = new LinkedList<>();
	        Scanner scanner = new Scanner(System.in);
	        int opcao;

	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1: Adicionar um novo Cliente na fila");
	            System.out.println("2: Listar todos os Clientes na fila");
	            System.out.println("3: Chamar (retirar) uma pessoa da fila");
	            System.out.println("0: Finalizar o programa");
	            System.out.print("Digite a opção desejada: ");
	            opcao = scanner.nextInt();
	            scanner.nextLine();

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o nome do cliente a ser adicionado: ");
	                    String nomeCliente = scanner.nextLine();
	                    filaClientes.offer(nomeCliente);
	                    System.out.println("Cliente '" + nomeCliente + "' adicionado à fila.");
	                    break;
	                case 2:
	                    if (filaClientes.isEmpty()) {
	                        System.out.println("A fila de clientes está vazia.");
	                    } else {
	                        System.out.println("Clientes na fila:");
	                        int i = 1;
	                        for (String cliente : filaClientes) {
	                            System.out.println(i + ": " + cliente);
	                            i++;
	                        }
	                    }
	                    break;
	                case 3:
	                    if (filaClientes.isEmpty()) {
	                        System.out.println("A fila de clientes está vazia. Não há clientes para chamar.");
	                    } else {
	                        String clienteChamado = filaClientes.poll();
	                        System.out.println("Cliente '" + clienteChamado + "' foi chamado.");
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
