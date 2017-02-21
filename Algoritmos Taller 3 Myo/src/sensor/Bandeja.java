package sensor;

import java.util.LinkedList;

import processing.core.*;

public class Bandeja implements Validable {

	private PApplet app;
	private PImage forma;
	private float x;
	private float y;
	private boolean pedidoListo;
	private int cantidadCrispetas;
	private int cantidadHotDog;
	private int cantidadGeseosa;
	private LinkedList<Crispeta> crispetasPedidas;
	private LinkedList<Gaseosa> gaseosasPedidas;
	private LinkedList<HotDog> hotDogsPedidos;

	public Bandeja(PImage forma, int cantidadCrispetas, int cantidadHotDog, int cantidadGeseosa) {
		this.forma = forma;
		this.cantidadCrispetas = cantidadCrispetas;
		this.cantidadHotDog = cantidadHotDog;
		this.cantidadGeseosa = cantidadGeseosa;

		crispetasPedidas = new LinkedList<>();
		gaseosasPedidas = new LinkedList<>();
		hotDogsPedidos = new LinkedList<>();

		pedidoListo = false;
	}

	public void pintar() {
		app.imageMode(PApplet.CENTER);
		app.image(forma, x, y);

	}

	public void pintarPedido() {
		// TODO Auto-generated method stub

	}

	public boolean validar(float myoX, float myoY) {

		if (PApplet.dist(x, y, myoX, myoY) < 50) {
			return true;
		} else {
			return false;
		}
	}

	public void agregarCrispeta(Crispeta cris) {
		crispetasPedidas.add(cris);
	}

	public void agregarGaseosa(Gaseosa gas) {
		gaseosasPedidas.add(gas);
	}

	public void agregarHotDog(HotDog hd) {
		hotDogsPedidos.add(hd);
	}

	public boolean getPedidoListo() {

		if (crispetasPedidas.size() == cantidadCrispetas && gaseosasPedidas.size() == cantidadGeseosa
				&& hotDogsPedidos.size() == cantidadHotDog) {
			pedidoListo = true;
			return pedidoListo;
		} else {
			return pedidoListo;
		}

	}

}
