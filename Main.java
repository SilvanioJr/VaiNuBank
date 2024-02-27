package br.com.vainaweb.backendt3.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);
         GerenciadorBancario gerenciador = new GerenciadorBancario();

         int opcao;
         System.out.println("\n===== Menu Principal =====");
         System.out.println("1. Cadastrar Conta");
         System.out.println("2. Excluir Conta");
         System.out.println("3. Editar Conta");
         System.out.println("4. Visualizar Todas as Contas");
         System.out.println("5. Realizar Operações Bancárias");
         System.out.println("0. Sair");

         System.out.print("Escolha uma opção: ");
         opcao = scanner.nextInt();

         switch (opcao) {
         	case 1:
         		gerenciador.cadastrarConta();
                break;
         	case 2:
         		gerenciador.excluirConta(2);
                break;
         	case 3:
         		gerenciador.editarConta(5, "5");
                break;
         	case 4:
         		gerenciador.visualizarTodasContas();
                break;
            case 5:
            	gerenciador.realizarOperacoesBancarias(5, "2");
            	break;
            case 0:
            	System.out.println("Saindo");
            	break;

         }
    }
}