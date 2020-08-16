package atividadeDesafio;

import javax.swing.JOptionPane;

public class Desafio06 {
	/*
	 * Faça um programa que receba uma frase qualquer informada via teclado e
	 * imprima a maior palavra desta frase, caso exista mais de uma palavra com a
	 * mesma quantidade de letras da maior exibir a primeira encontrada
	 */
	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog(null, "Digite uma frase", "Contador de palavras",
				JOptionPane.QUESTION_MESSAGE);
		String[] vetorFrase = frase.split(" ");
		int maiorQtdCaracteres = 0;
		String maiorPalavra = null;

		for (int i = 0; i < vetorFrase.length; i++) {
			if (vetorFrase[i].length() > maiorQtdCaracteres) {
				maiorQtdCaracteres = vetorFrase[i].length();
				maiorPalavra = vetorFrase[i];
			}
		}

		JOptionPane.showMessageDialog(null, "A maior palavra da frase é " + maiorPalavra, "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
