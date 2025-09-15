package br.com.mariojp.figureeditor;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
public class EllipseFactory implements ShapeFactory {

	@Override
	public Shape makeShape(int x, int y, int height, int width) {
		Ellipse2D ellipse = new Ellipse2D.Float((float)x,(float)y, (float)height, (float)width);
		return ellipse;

	}

}
