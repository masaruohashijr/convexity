package br.com.logusinfo.gabarito;

import java.util.LinkedList;
import java.util.List;
/*
 * Tendo um array de números que representa a volatilidade do preço de uma ação.
 * Considere a convexidade como sendo uma curva crescente de valorização do preço da ação.
 * Desenvolva um código que identifica se a curva gerada pelos preços é convexa ou não.   	 
 */
public class ConvexidadeAcaoGabarito {
	public boolean isConvexo(double[] cotacoes) {
		double acrescimos = 0;
		double decrescimos = 0;
		if(cotacoes.length < 2) {
			return true;
		} else {
			double ultimo = cotacoes[0];				
			for (int i = 1;  i < cotacoes.length; i++) {
				double atual = cotacoes[i];
				if(atual > ultimo) {
					acrescimos+=(atual-ultimo);
				}
				if(atual < ultimo) {
					decrescimos+=(ultimo-atual);
				}
				ultimo = cotacoes[i];
			}
		}
		if(acrescimos > decrescimos) {
			return true;
		} else {
			return false;
		}
	}
}
