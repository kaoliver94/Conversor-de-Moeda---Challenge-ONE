package org.example;

import java.util.Scanner;

public class Principal {
    private static final String USD = "USD";
    private static final String EUR = "EUR";
    private static final String BRL = "BRL";
    private static final String CNY = "CNY";

    public static void main(String[] args) {
        RequestAPI converter = new RequestAPI() {
        };

        Scanner scanner = new Scanner(System.in);

        int option = -1;
        try {
            while (option != 0) {
                displayMenu();
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        convertAndDisplay(converter, USD, EUR, "USD", "EUR", scanner);
                        break;
                    case 2:
                        convertAndDisplay(converter, EUR, USD, "EUR", "USD", scanner);
                        break;
                    case 3:
                        convertAndDisplay(converter, BRL, USD, "BRL", "USD", scanner);
                        break;
                    case 4:
                        convertAndDisplay(converter, USD, BRL, "USD", "BRL", scanner);
                        break;
                    case 5:
                        convertAndDisplay(converter, EUR, BRL, "EUR", "BRL", scanner);
                        break;
                    case 6:
                        convertAndDisplay(converter, BRL, EUR, "BRL", "EUR", scanner);
                        break;

                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void displayMenu() {
        System.out.println("Escolha uma opção válida:");
        System.out.println("1. Converter USD para EUR");
        System.out.println("2. Converter EUR para USD");
        System.out.println("3. Converter BRL para USD");
        System.out.println("4. Converter USD para BRL");
        System.out.println("5. Converter EUR para BRL");
        System.out.println("6. Converter BRL para EUR");
        System.out.println("0. Sair");
    }

    public static void convertAndDisplay(RequestAPI converter, String fromCurrency, String toCurrency, String fromSymbol, String toSymbol, Scanner scanner) {
        System.out.print("Digite o valor em " + fromSymbol + ": ");
        double amount = scanner.nextDouble();
        double convertedAmount = converter.equals(amount, fromCurrency, toCurrency);
        System.out.println(amount + " " + fromSymbol + " = " + convertedAmount + " " + toSymbol);
    }
}
