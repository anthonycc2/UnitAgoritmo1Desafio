package atividadeDesafio;

import javax.swing.JOptionPane;

public class Desafio02 {

	/*
	 * Fa�a um programa que calcule o valor de A, dado pela f�rmula abaixo , a partir de um valor de dupla
	 * precis�o N informado: A = N + (N-1)/2 + (N-2)/3 + ... + 1/N
	 */
	public static void main(String[] args) {
		String n = JOptionPane.showInputDialog("Insira um n�mero para calcular o resultado da expres�o: "
				+ "A = N + (N-1)/2 + (N-2)/3 + ... + 1/N");
		double numero = Double.parseDouble(n);
		double a = calcular(numero);
		JOptionPane.showMessageDialog(null, "O resultado da express�o � " + a);
	}
	
	/**
	 * Calcula o resultado da express�o: A = N + (N-1)/2 + (N-2)/3 + ... + 1/N
	 * @param N N�mero real.
	 * @return A Somat�rio.
	 */
	private static double calcular(double n) {
		double somatorio = 0;
		
		for (int i = 0; i < n; i++) {
			somatorio += ((n - i)/(i + 1));
		}
		
		return somatorio;
	}

}
