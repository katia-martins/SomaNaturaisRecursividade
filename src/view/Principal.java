
/*
 * Autor: Katia Martins Goncalves
 */

package view;

import javax.swing.JOptionPane;

import controller.SomaController;

public class Principal {

	public static void main(String[] args) {
		
		//declaracao de variaveis
		int entrada;
		int res;
		SomaController somac = new SomaController();
			
			//box solicitando input do usuário
			do{
				entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero inteiro:"));
			}while (entrada < 0);

		//variavel recebe o retorno da funcao 
		res = somac.soma(entrada);
		//saida na tela
		System.out.println(res);
	}

}
