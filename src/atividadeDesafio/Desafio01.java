package atividadeDesafio;

import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class Desafio01 {

	/**
	 * Uma rainha requisitou os servi�os de um monge e disse-lhe que pagaria
	 * qualquer pre�o. O monge, necessitando de alimentos, indagou � rainha sobre o
	 * pagamento, se poderia ser feito com gr�os de trigo dispostos em um tabuleiro
	 * de xadrez (que possui 64 casas), de tal forma que o primeiro quadro deveria
	 * conter apenas um gr�o e os quadros subsequentes, o dobro do quadro anterior.
	 * Crie um programa para calcular o total de gr�os que o monge recebeu. Utilize
	 * vari�veis de dupla precis�o (double) para calcular a quantidade de gr�os que
	 * ser�o armazenados na casa 64, exiba a casa e a quantidade de gr�os da casa e
	 * a soma acumulada.
	 */
	public static void main(String[] args) {
		int i;
		double exp;
		double soma = 0;
		String resultado;

		for (i = 1; i < 65; i++) {
			exp = exponenciacao(i);
			soma += exp;
		}
		resultado = NumberFormat.getNumberInstance().format(soma);

		JOptionPane.showMessageDialog(null,
				"Uma rainha requisitou os servi�os de um monge e disse-lhe que pagaria qualquer pre�o. O monge,\r\n"
						+ "	necessitando de alimentos, indagou � rainha sobre o pagamento, se poderia ser feito com gr�os de trigo\r\n"
						+ "	dispostos em um tabuleiro de xadrez (que possui 64 casas), de tal forma que o primeiro quadro deveria\r\n"
						+ "	conter apenas um gr�o e os quadros subsequentes, o dobro do quadro anterior. Qual o total de gr�os que o monge recebeu.");
		JOptionPane.showMessageDialog(null, "O total de gr�os que o monge recebou foi de " + resultado);
	}

	/**
	 * Calcula a exponencia��o de um n�mero qualquer com base 2.
	 * 
	 * @param n Exponente da opera��o.
	 * @return o Resultado da fun��o exponencial com base 2.
	 */
	private static double exponenciacao(double n) {
		if (n == 1)
			return 1;
		else
			return 2 * exponenciacao(n - 1);
	}

}
