package atividadeDesafio;

import javax.swing.JOptionPane;

public class Desafio08 {

	/*
	 * Elabore um programa que permita achar as ra�zes de uma equa��o do segundo grau da forma: ax2 + bx 	+ c = 0.
	 * Ser�o informados os coeficientes da equa��o, ou seja, os valores de a, b e c.
	 */
	public static void main(String[] args) {
		String strA = JOptionPane.showInputDialog(null, "ax� + bx + c = 0\nDigite o coeficiente a", "Equa��o do 2� grau",
				JOptionPane.QUESTION_MESSAGE);
		String strB = JOptionPane.showInputDialog(null, "ax� + bx + c = 0\nDigite o coeficiente b", "Equa��o do 2� grau",
				JOptionPane.QUESTION_MESSAGE);
		String strC = JOptionPane.showInputDialog(null, "ax� + bx + c = 0\nDigite o coeficiente c", "Equa��o do 2� grau",
				JOptionPane.QUESTION_MESSAGE);

		int a = Integer.parseInt(strA);
		int b = Integer.parseInt(strB);
		int c = Integer.parseInt(strC);
		
		double[] raizes = equacaoSegundoGrau(a, b, c);
		JOptionPane.showMessageDialog(null,
				"As ra�zas da equa��o s�o " + raizes[0] + " e " + raizes[1],
				"Resultado", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	private static double[] equacaoSegundoGrau(int a, int b, int c){
		double[] x = new double[2];
		double delta = Math.pow(b, 2) - (4 * a * c); // delta = b� - 4ac
		x[0] = (-b + Math.sqrt(delta)) / (2 * a); //x' = (-b + raiz(delta))/2a
		x[1] = (-b - Math.sqrt(delta)) / (2 * a); //x" = (-b - raiz(delta))/2a
		return x;
	}

}
