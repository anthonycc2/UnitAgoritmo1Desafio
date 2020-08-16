package atividadeDesafio;

import javax.swing.JOptionPane;

public class Desafio07 {

	/*
	 * Fa�a um programa que calcule o fatorial do n�mero resultado da subtra��o da
	 * soma dos n�meros pares pela soma dos n�meros �mpares existentes no intervalo
	 * entre [1 e 50].
	 */
	public static void main(String[] args) {
		int somaPares = 0;
		int somaImpares = 0;

		for (int i = 1; i <= 50; i++)
			if (i % 2 == 0)
				somaPares += i;
			else
				somaImpares += i;

		int diferenca = somaPares - somaImpares;
		JOptionPane.showMessageDialog(null,
				"O fatorial do n�mero resultado da subtra��o da\n"
						+ "	 soma dos n�meros pares pela soma dos n�meros �mpares existentes no intervalo\n"
						+ "	 entre [1 e 50] � " + fatorial(diferenca),
				"Resultado", JOptionPane.INFORMATION_MESSAGE);
	}

	private static int fatorial(int n) {
		if (n == 1)
			return 1;
		else
			return n * fatorial(n - 1);
	}

}
