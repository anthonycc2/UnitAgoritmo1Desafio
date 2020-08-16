package atividadeDesafio;

import javax.swing.JOptionPane;

public class Desafio02 {

	/*
	 * Faça um programa que calcule o valor de A, dado pela fórmula abaixo , a partir de um valor de dupla
	 * precisão N informado: A = N + (N-1)/2 + (N-2)/3 + ... + 1/N
	 */
	public static void main(String[] args) {
		String n = JOptionPane.showInputDialog("Insira um número para calcular o resultado da expresão: "
				+ "A = N + (N-1)/2 + (N-2)/3 + ... + 1/N");
		double numero = Double.parseDouble(n);
		double a = calcular(numero);
		JOptionPane.showMessageDialog(null, "O resultado da expressão é " + a);
	}
	
	/**
	 * Calcula o resultado da expressão: A = N + (N-1)/2 + (N-2)/3 + ... + 1/N
	 * @param N Número real.
	 * @return A Somatório.
	 */
	private static double calcular(double n) {
		double somatorio = 0;
		
		for (int i = 0; i < n; i++) {
			somatorio += ((n - i)/(i + 1));
		}
		
		return somatorio;
	}

}
