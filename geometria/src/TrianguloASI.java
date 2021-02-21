
/**
 * @author 34617
 * @version 1.2
 */
public class TrianguloASI extends FiguraGeometricaASI {
	private double lado1;
	private double lado2;
	private double lado3;
	
	/**
	 * @param tipoFigura
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 * 
	 * @tag Constructor del objeto triangulo.
	 */
	public TrianguloASI(String tipoFigura, double lado1, double lado2, double lado3) {
		super(tipoFigura);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	/**
	 * Override del método perímetro
	 */
	@Override
	public double perimetro() {
		return lado1 + lado2 + lado3;
	}
	
	/**
	 * Override de la fórmula del área con la fórmula de Heron
	 */
	@Override
	public double area() { //Utiliza la formula de Her—n
		double sp;
		sp = this.semiPerimetro();
		return Math.sqrt(sp * (sp-lado1) * (sp-lado2) * (sp-lado3));
	}
	

}
