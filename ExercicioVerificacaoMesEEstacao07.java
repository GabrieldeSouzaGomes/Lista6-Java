//7) 7) Verificação de Mês e Estação:
//Escreva um programa que solicite ao usuário um número de 1 a 12 e exiba o mês e a estação do ano correspondente.
package lista06;

import java.util.Scanner;

public class ExercicioVerificacaoMesEEstacao07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 12 para indicar o mês: ");
        int mes = scanner.nextInt();

        String nomeMes = "";
        String estacao = "";

        switch (mes) {
            case 1:
                nomeMes = "Janeiro";
                estacao = "Verão";
                break;
            case 2:
                nomeMes = "Fevereiro";
                estacao = "Verão";
                break;
            case 3:
                nomeMes = "Março";
                estacao = "Verão (até 20) / Outono (a partir de 21)";
                break;
            case 4:
                nomeMes = "Abril";
                estacao = "Outono";
                break;
            case 5:
                nomeMes = "Maio";
                estacao = "Outono";
                break;
            case 6:
                nomeMes = "Junho";
                estacao = "Outono (até 20) / Inverno (a partir de 21)";
                break;
            case 7:
                nomeMes = "Julho";
                estacao = "Inverno";
                break;
            case 8:
                nomeMes = "Agosto";
                estacao = "Inverno";
                break;
            case 9:
                nomeMes = "Setembro";
                estacao = "Inverno (até 22) / Primavera (a partir de 23)";
                break;
            case 10:
                nomeMes = "Outubro";
                estacao = "Primavera";
                break;
            case 11:
                nomeMes = "Novembro";
                estacao = "Primavera";
                break;
            case 12:
                nomeMes = "Dezembro";
                estacao = "Primavera (até 20) / Verão (a partir de 21)";
                break;
            default:
                System.out.println("Número inválido. Digite um número de 1 a 12.");
                scanner.close();
                return;
        }

        System.out.println("Mês: " + nomeMes);
        System.out.println("Estação: " + estacao);

        scanner.close();
    }
}
