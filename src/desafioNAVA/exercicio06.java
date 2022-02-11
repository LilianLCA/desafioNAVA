package desafioNAVA;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		
		int valor, horas, min, seg, res;
		Scanner ler = new Scanner(System.in);
		System.out.println("Por favor, digite a duração do tempo em segundos:");
		valor= ler.nextInt();
		
		horas= (valor/3600);
		res= (valor%3600);
		min=  (res/60);
		seg= (res%60);
		
		System.out.println("O tempo de duração é: " +horas+ " horas " +min+ " minutos e " +seg+ " segundos ");
	}

}
