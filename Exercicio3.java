package lista06;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sistema de Calculadora ===");

        System.out.print("Digite o primeiro valor: ");
        int numero01 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        int numero02 = sc.nextInt();

        System.out.print("Digite a operação que deseja efetuar (+, -, *, /): ");
        char operacao = sc.next().charAt(0);

        float resultado;

        switch (operacao) {
            case '+':
                resultado = numero01 + numero02;
                System.out.println("O resultado da soma é: " + resultado);
                break;
            case '-':
                resultado = numero01 - numero02;
                System.out.println("O resultado da subtração é: " + resultado);
                break;
            case '*':
                resultado = numero01 * numero02;
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;
            case '/':
                if (numero02 != 0) {
                    resultado = (float) numero01 / numero02;
                    System.out.println("O resultado da divisão é: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }

        sc.close();
    }
}
