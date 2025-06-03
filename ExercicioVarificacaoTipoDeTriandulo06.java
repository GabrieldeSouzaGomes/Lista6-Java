//6)  Verificação de Tipo de Triângulo:
//Escreva um programa que solicite ao usuário os comprimentos 
//dos três lados de um triângulo e classifique-o como equilátero, isósceles ou escaleno.
package lista06;

import java.util.Scanner;

public class ExercicioVarificacaoTipoDeTriandulo06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os três lados do triângulo
        System.out.print("Digite o comprimento do primeiro lado: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o comprimento do segundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o comprimento do terceiro lado: ");
        double lado3 = scanner.nextDouble();

        // Verifica se os lados formam um triângulo válido
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo válido.");
        }

        scanner.close();
    }
}
