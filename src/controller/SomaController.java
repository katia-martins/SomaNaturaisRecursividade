package controller;

public class SomaController {

	public SomaController() {
		super();
	}
	
	//funcao que calcula a soma de numeros naturais
	public int soma(int numero) {
		
		//condicao de parada
		if (numero == 0) {
			
			return 0;
			
		} else {
			
			//se o valor for igual a 0 (zero), para a recursão e retorna calculando os valores
			return numero + soma(numero - 1);
		}
	}
}
