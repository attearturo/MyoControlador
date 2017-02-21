package sensor;

import processing.core.*;

public class Gaseosa implements Validable, Movible, Pintable {

	private PApplet app;
	private PImage forma;
	private float x;
	private float y;
	private boolean hayGaseosa;

	public Gaseosa(PImage forma) {
		this.forma = forma;

	}

	@Override
	public void pintar() {
		app.imageMode(PApplet.CENTER);
		app.image(forma, x, y);
	}

	@Override
	public boolean validar(float x, float y) {

		return false;
	}

	@Override
	public void mover() {

	}

	@Override
	public void mover(float x, float y) {

	}

	public void cambiarSabor() {

	}

	public boolean getHayGaseosa() {
		return hayGaseosa;

	}

}
