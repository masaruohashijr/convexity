package br.com.logusinfo;
/* Tendo um array de números que representa a volatilidade do preço de uma ação.
 * R$ 6, R$ 4, R$ 2, R$ 8 são os preços de aberturas de uma ação VOCE11 
 * na Bolsa de Valores de Brasília (fictício).
 * Uma sequência ser Convexa significa que os preços estão em Alta, e 
 * uma sequência ser Côncava que dizer que os preços estão em Baixa.  	 
 * Portanto, considere a convexidade como sendo uma curva crescente de valorização do preço da ação.
 * Desenvolva um código que identifica se a curva gerada pelos preços é convexa ou não.
 * Exemplo: A sequência 6 > 4 > 2 < 8 é convexa.
 * Porque 4 - 6 = -2,  2 - 4 = -2, 8 - 2 = 6, assim como -2 + (-2) + 6 dá 2 positivo, 
 * conclui-se que a sequência de preços dessa AÇÃO é convexa, 
 * pois os acréscimos superam os decréscimos nesse período da análise.
 */
public class ConvexidadeAcao {
	public boolean isConvexo(double[] cotacoes) {
		return false;
	}
}
