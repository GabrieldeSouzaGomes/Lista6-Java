//4) Verificação de Estação do Ano:
//Escreva um programa que solicite ao usuário um número de 
//1 a 4 e exiba a estação doano correspondente (1 para Primavera, 2 para Verão, etc.).
package lista06;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Estações do Ano");
		System.out.println("1 - Verão");
		System.out.println("2 - outono");
		System.out.println("3 - Inverno");
		System.out.println("4 - Primavera");
		System.out.println("Número inválido! Digite um número entre 1 e 4.");
		int opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
		System.out.println("Número inválido! Digite um número entre 1 e 4.");
		break;
		case 2: 
		System.out.println("A estação do ano selecionada é Outono");
		break;
		case 3: 
		System.out.println("A estação do ano selecionada é Inverno");
		break;
		case 4: 
		System.out.println("A estação do ano selecionada é Primavera");
		break;
	default:
	System.out.println("Não existe estação do ano correspondente a esse número ");
	    break;
		}
		
		sc.close();
	}

}
