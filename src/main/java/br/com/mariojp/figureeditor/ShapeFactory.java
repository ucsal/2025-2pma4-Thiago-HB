package br.com.mariojp.figureeditor;

import java.awt.Shape;

public interface ShapeFactory {

	public Shape makeShape(int x, int y, int height, int width );
}
