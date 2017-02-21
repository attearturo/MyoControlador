package sensor;

import java.util.LinkedList;

import de.voidplus.myo.Myo;
import processing.core.*;

public class Logica {

	private PApplet app;
	private Myo myo;

	private Jarvis jarvis;

	private LinkedList<Cliente> clientes;
	private LinkedList<Crispeta> crispetas;
	private LinkedList<Gaseosa> gaseosas;
	private LinkedList<HotDog> hotDogs;

	private Object selector;
	
	private PImage[] displayClientes;
	private PImage[] displayElementos;
	private PImage[] displayPatallas;

	public Logica(PApplet app, Myo myo) {
		this.app = app;
		this.myo = myo;

		jarvis = new Jarvis(myo,app);

		clientes = new LinkedList<>();
		crispetas = new LinkedList<>();
		gaseosas = new LinkedList<>();
		hotDogs = new LinkedList<>();

		selector = null;
	}

	public void ejecutable() {

//		app.println(jarvis.validarGestos(jarvis.gesto(), "FIST"));

		if (jarvis.validarGestos(jarvis.gesto(), "FIST")) {
			app.background(255, 0, 0);

		} else if (jarvis.validarGestos(jarvis.gesto(), "FINGERS_SPREAD")) {
			app.background(0, 255, 0);

		} else if (jarvis.validarGestos(jarvis.gesto(), "WAVE_OUT")) {
			app.background(0, 0, 255);

		}
		
		jarvis.pointer();

	}

	public void ralentizarTiempo() {
		if (jarvis.validarGestos(jarvis.gesto(), "DOUBLE_TAP")) {
			app.background(255, 0, 0);

		}
	}

	public void agarrar() {
		if (jarvis.validarGestos(jarvis.gesto(), "FIST")) {
			app.background(255, 0, 0);

		}
	}

	public void soltar() {
		if (jarvis.validarGestos(jarvis.gesto(), "FINGERS_SPREAD")) {
			app.background(255, 0, 0);

		}
	}

	private void llegaCliente() {

	}

	private void creaCrispetas() {

	}

	private void creaGaseosa() {

	}

	private void creaHotDog() {

	}

	private void creaBandeja() {

	}

}
