package atividadeDesafio;

import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class Desafio01 {

	/**
	 * Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria
	 * qualquer preço. O monge, necessitando de alimentos, indagou à rainha sobre o
	 * pagamento, se poderia ser feito com grãos de trigo dispostos em um tabuleiro
	 * de xadrez (que possui 64 casas), de tal forma que o primeiro quadro deveria
	 * conter apenas um grão e os quadros subsequentes, o dobro do quadro anterior.
	 * Crie um programa para calcular o total de grãos que o monge recebeu. Utilize
	 * variáveis de dupla precisão (double) para calcular a quantidade de grãos que
	 * serão armazenados na casa 64, exiba a casa e a quantidade de grãos da casa e
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
				"Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria qualquer preço. O monge,\r\n"
						+ "	necessitando de alimentos, indagou à rainha sobre o pagamento, se poderia ser feito com grãos de trigo\r\n"
						+ "	dispostos em um tabuleiro de xadrez (que possui 64 casas), de tal forma que o primeiro quadro deveria\r\n"
						+ "	conter apenas um grão e os quadros subsequentes, o dobro do quadro anterior. Qual o total de grãos que o monge recebeu.");
		JOptionPane.showMessageDialog(null, "O total de grãos que o monge recebou foi de " + resultado);
	}

	/**
	 * Calcula a exponenciação de um número qualquer com base 2.
	 * 
	 * @param n Exponente da operação.
	 * @return o Resultado da função exponencial com base 2.
	 */
	private static double exponenciacao(double n) {
		if (n == 1)
			return 1;
		else
			return 2 * exponenciacao(n - 1);
	}

}
