
public class CirculoASI extends FiguraGeometricaASI {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public CirculoASI(double r, String tipoFigura) {
		super(tipoFigura);
		if (radio < 0) {
			radio = r*(-1);
		}else {
		radio = r;
		}
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
