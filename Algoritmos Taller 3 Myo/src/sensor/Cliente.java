package sensor;

import processing.core.*;

public class Cliente {

	private PApplet app;
	private PImage display;
	private boolean pedidoListo;
	private boolean caramelizada;
	private int cantidadCrispetas;
	private int cantidadGaseosa;
	private int cantidadHotDog;
	private int tiempoEspera;

	public Cliente(PImage display, int cantidadCrispetas, int cantidadGaseosa, int cantidadHotDog, int tiempoespera) {
		this.display = display;
		this.cantidadCrispetas = cantidadCrispetas;
		this.cantidadGaseosa = cantidadGaseosa;
		this.cantidadHotDog = cantidadHotDog;
		this.setTiempoEspera(tiempoespera);

		setPedidoListo(false);
	}

	public void pintar() {
		app.image(display, 0, 0);
	}

	public boolean isCaramelizada() {
		return caramelizada;
	}

	public int getCantidadCrispetas() {
		return cantidadCrispetas;
	}

	public int getCantidadGaseosa() {
		return cantidadGaseosa;
	}

	public int getCantidadHotDog() {
		return cantidadHotDog;
	}

	public boolean isPedidoListo() {
		return pedidoListo;
	}

	public void setPedidoListo(boolean pedidoListo) {
		this.pedidoListo = pedidoListo;
	}

	public int getTiempoEspera() {
		return tiempoEspera;
	}

	public void setTiempoEspera(int tiempoEspera) {
		this.tiempoEspera = tiempoEspera;
	}

}
