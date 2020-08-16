package atividadeDesafio;

import javax.swing.JOptionPane;

public class Desafio04 {

	/*
	 * Faça um programa que receba uma frase qualquer informada via teclado e
	 * imprima a quantidade de PALAVRAS existentes na frase
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog(null, "Digite uma frase", "Contador de palavras",
				JOptionPane.WARNING_MESSAGE);
		String[] vetorTexto = texto.split(" ");
		JOptionPane.showMessageDialog(null, "A quantidade de palavras na frase é " + vetorTexto.length, "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
