package view;
import java.util.*;

import controller.Controle;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Tamanho do vetor: ");
		int tamanhoVetor=sc.nextInt();
		int []vetor=new int [tamanhoVetor];
		
		
		for(int i=0;i<tamanhoVetor;i++) {
			System.out.println("Valor: ");
			vetor[i]=sc.nextInt();
		}
		Controle controle=new Controle();
		
		int menorValor=controle.menorValor(vetor,tamanhoVetor-1,vetor[tamanhoVetor-1]);
		System.out.println("Menor valor: "+menorValor);
	}
}
