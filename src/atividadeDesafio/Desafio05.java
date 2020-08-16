package atividadeDesafio;

import javax.swing.JOptionPane;

public class Desafio05 {

	/**
	 * Elabore um programa que obtenha a série de Fibonacci com N termos, o valor de
	 * N será informado como entrada em uma variável inteira. A Série de Fibonacci é
	 * assim definida: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número", "Sequência de Fibonacci",
				JOptionPane.QUESTION_MESSAGE));
		int[] fib = fibonacci(n);

		String sequencia = "";
		for (int j = 0; j < n; j++) {
			sequencia += fib[j] + " ";
		}
		JOptionPane.showMessageDialog(null, "A sequência de Fibonacci até a posição " + n + " é: \n" + sequencia,
				"Resultado", JOptionPane.INFORMATION_MESSAGE);
	}

	private static int[] fibonacci(int n) {
		int[] fib = new int[n];
		for (int i = 1; i <= n; i++) {
			if ((i == 1) || (i == 2))
				fib[i - 1] = 1;
			else
				fib[i - 1] = fib[i - 2] + fib[i - 3];
		}
		return fib;
	}

}
