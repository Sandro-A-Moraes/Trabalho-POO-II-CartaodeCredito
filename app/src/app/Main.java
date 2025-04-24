package app;

import models.CartaoDeCredito;
import models.Compra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userOp = new Scanner(System.in);

        int userInput = 1;
        userInput = userOp.nextInt();

        double doubleUserInput;

        String stringUserInput;
        //stringUserInput = userOp.toString();

        System.out.println("Por favor, informe o limite do cartão de crédito: ");
        doubleUserInput = userOp.nextDouble();

        CartaoDeCredito cartao = new CartaoDeCredito(doubleUserInput);

        while (userInput != 0) {
            System.out.println("Por favor, informe a descrição da compra: ");
            stringUserInput = userOp.toString();
            System.out.println("Por favor, informe o valor da compra: ");
            doubleUserInput = userOp.nextDouble();

            Compra compra = new Compra(stringUserInput, doubleUserInput);
            boolean compraRealizada = cartao.realizarCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");

                System.out.println("O que voce deseja fazer?\n  [0] - Sair\n  [1] - Continuar\n>");
                userInput = userOp.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                userInput = 0;
                break;
            }
        }

        System.out.println("\n\nExibindo compras:");

        for (Compra iCompra : cartao.getCompras()) {
            System.out.println(String.format("[%d] - %s", cartao.getCompras().indexOf(iCompra), iCompra));
        }

        System.out.println("\n\nSaldo restante:");
        System.out.println("R$ " + cartao.getSaldo());

    }
}