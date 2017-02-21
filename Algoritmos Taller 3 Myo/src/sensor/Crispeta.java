package sensor;

import processing.core.*;

public class Crispeta implements Validable, Movible, Pintable {

	private PApplet app;
	private PImage forma;
	private float x;
	private float y;
	private boolean hayCrispetas;

	public Crispeta(PImage forma) {
		this.forma = forma;
	}

	@Override
	public void pintar() {
		app.imageMode(PApplet.CENTER);
		app.image(forma, x, y);
	}

	@Override
	public boolean validar(float x, float y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub

	}

	@Override
	public void mover(float x, float y) {
		// TODO Auto-generated method stub

	}

	public boolean getHayCrispetas() {
		return hayCrispetas;

	}

	public void caramelizar() {
		// TODO Auto-generated method stub

	}

}
