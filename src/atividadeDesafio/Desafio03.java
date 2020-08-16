package atividadeDesafio;

import javax.swing.JOptionPane;

public class Desafio03 {

	/*
	 * Faça um programa que receba uma frase qualquer informada via teclado e
	 * imprima a quantidade de LETRAS “A” existente na frase
	 */
	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog(null, "Digite uma frase.", "Quantidade de letras A",
				JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "A quantidade de letras A na frase digitada é " + quantidadeLetrasA(frase),
				"Resultado", JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Retorna a quantidade de letras A contidas numa frase.
	 * 
	 * @param frase Uma frase qualquer.
	 * @return A quantidade de letras A contidas na frase.
	 */
	public static int quantidadeLetrasA(String frase) {
		int quantidade = 0;
		char[] vetorFrase = frase.toCharArray();

		for (int i = 0; i < vetorFrase.length; i++) {
			if ((vetorFrase[i] == 'a') || (vetorFrase[i] == 'A'))
				quantidade++;
		}

		return quantidade;
	}

}
