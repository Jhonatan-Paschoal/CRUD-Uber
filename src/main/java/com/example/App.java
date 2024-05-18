package com.example;

import java.util.Scanner;

import com.example.DAO.veiculoDAO;
import com.example.service.VeiculoService;

public class App {
    public static void main(String[] args) {
        veiculoDAO veiculoDAO = new veiculoDAO();
        VeiculoService veiculoService = new VeiculoService(veiculoDAO);
        Scanner scanner = new Scanner(System.in);
        int opcao;

        // Loop do menu
        while (true) {
            System.out.println("Escolha a tabela:");
            System.out.println("1 - Veículos");
            System.out.println("2 - Pessoas");
            System.out.println("3 - Passageiros");
            System.out.println("4 - Motorista");
            System.out.println("5 - Proprietários");
            System.out.println("6 - Viagem");
            System.out.println("7 - Motorista do veículo");
            System.out.println("8 - Tipo de pagamento");
            System.out.println("9 - SAIR");

            int tabelaEscolhida = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (tabelaEscolhida) {
                case 1:
                    veiculoService.gerenciarVeiculos(scanner);
                    break;
                case 2:
                    // gerenciarPessoas(scanner);
                    System.out.println("Funcionalidade ainda não implementada.");
                    break;
                case 3:
                    // gerenciarPassageiros(scanner);
                    System.out.println("Funcionalidade ainda não implementada.");
                    break;
                case 4:
                    // gerenciarMotorista(scanner);
                    System.out.println("Funcionalidade ainda não implementada.");
                    break;
                case 5:
                    // gerenciarProprietarios(scanner);
                    System.out.println("Funcionalidade ainda não implementada.");
                    break;
                case 6:
                    // gerenciarViagem(scanner);
                    System.out.println("Funcionalidade ainda não implementada.");
                    break;
                case 7:
                    // gerenciarMotoristaDoVeiculo(scanner);
                    System.out.println("Funcionalidade ainda não implementada.");
                    break;
                case 8:
                    // gerenciarTipoDePagamento(scanner);
                    System.out.println("Funcionalidade ainda não implementada.");
                    break;
                case 9:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
