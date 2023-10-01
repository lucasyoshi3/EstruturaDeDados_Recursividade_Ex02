package controller;

public class Controle {
	public int menorValor(int []vetor,int tamanho,int menor) {
		// TODO Auto-generated method stub
		if(tamanho<0) {
			return menor;
		}
		if(vetor[tamanho]<menor) {
			return menorValor(vetor,tamanho-1,vetor[tamanho]);
		}
		return menorValor(vetor,tamanho-1,menor);
	}
}
