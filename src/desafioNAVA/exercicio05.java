package desafioNAVA;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		float larg, comp, met;
		float area, preco;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Por favor, digite a largura do terreno:");
		larg = ler.nextFloat();
		
		System.out.println("Por favor, digite o comprimento do terreno:");
		comp = ler.nextFloat();
		
		System.out.println("Por favor, digite o valor do metro quadrado:");
		met = ler.nextFloat();
		
		area= (larg*comp);
		preco= (area*met);
		
		System.out.printf("\n" + "Valor total do terreno := %.2f\n", area);
		System.out.printf("Preço do terreno := %.2f\n", preco);
	}
}
