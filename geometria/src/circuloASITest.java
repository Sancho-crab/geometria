import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
class circuloASITest {
	
	private double valorRadio;
	private double resultadoEsperadoArea;
	private double resultadoEsperadoPerimetro;
	
	public circuloASITest(double valorRadio, double resultadoEsperadoArea, double resultadoEsperadoPerimetro) {
		this.valorRadio = valorRadio;
		this.resultadoEsperadoArea = resultadoEsperadoArea;
		this.resultadoEsperadoPerimetro = resultadoEsperadoPerimetro;
	}
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object [][] {{7,153.93,43.98},{0,0,0},{-3,28.27,18,84}});
	}

	CirculoASI circle = new CirculoASI(valorRadio, "circulo");
	
	@Test
	void testArea() {
		double valor =circle.area();
		assertEquals(valor, resultadoEsperadoArea, 0.5);
	}
	
	void testPerimetro() {
		double valor = circle.perimetro();
		assertEquals(valor, resultadoEsperadoPerimetro, 0.5);
	}

}
