package br.com.logusinfo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestConvexidadeAcao {

	@Test
	final void testBOVA11() {
		ConvexidadeAcao volatilidade = new ConvexidadeAcao();
		double[] cotacoes = new double[] { 127.594, 125.428, 127.013, 125.096, 126.919, 127.622, 126.802, 127.323,
				127.429, 127.255, 128.433, 128.433, 128.769, 129.242, 128.405, 128.050, 129.259, 130.091, 130.208,
				129.441, 130.076, 129.911, 129.800, 130.776, 130.125, 129.600, 128.268, 126.218, 125.561, 124.367,
				123.989, 122.988, 124.032, 122.592, 122.701, 122.636, 122.976, 122.937, 121.880, 120.719, 119.711,
				122.964, 121.904, 122.038, 119.922, 119.577, 117.725, 119.209, 118.951 };
		assertFalse(volatilidade.isConvexo(cotacoes));
	}

	@Test
	final void testRENT3() {
		ConvexidadeAcao volatilidade = new ConvexidadeAcao();
		double[] cotacoes = new double[] { 65.52, 66.14, 63.97, 63.84, 63.94, 63.01, 63.75, 64.04, 64.15, 63.69, 64.16,
				64.66, 62.90, 63.27, 63.08, 62.15, 63.68, 64.67, 64.78, 65.51, 65.89, 66.89, 66.48, 66.26, 64.60, 64.24,
				62.72, 61.42, 61.65, 63.72, 63.73, 64.44, 63.04, 62.41, 60.00, 61.89, 59.54, 58.47, 59.67, 59.08, 61.50,
				62.19, 63.19, 62.01, 61.80, 62.96, 62.10, 64.70 };
		assertFalse(volatilidade.isConvexo(cotacoes));
	}

	@Test
	final void testMGLU3() {
		ConvexidadeAcao volatilidade = new ConvexidadeAcao();
		double[] cotacoes = new double[] { 21.97, 22.06, 21.30, 21.14, 21.48, 20.78, 21.20, 21.51, 21.51, 21.37, 21.75,
				20.78, 20.93, 21.31, 21.15, 21.29, 20.28, 20.93, 20.54, 20.42, 20.26, 20.32, 21.03, 21.07, 20.92, 20.59,
				20.39, 20.24, 20.24, 22.68, 22.72, 20.34, 20.18, 22.53, 22.73, 18.66, 18.74, 18.81, 22.10, 22.58, 18.79,
				22.98, 22.98, 22.87, 22.56, 22.83, 22.83, 23.16, 23.09 };
		assertTrue(volatilidade.isConvexo(cotacoes));
	}
}
