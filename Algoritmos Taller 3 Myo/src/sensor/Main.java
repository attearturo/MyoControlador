package sensor;

import de.voidplus.myo.*;
import processing.core.*;

public class Main extends PApplet {

	private Myo myo;
	private Logica logica;
	// private Jarvis jarvis;

	public static void main(String[] args) {
		PApplet.main("sensor.Main");
	}

	@Override
	public void settings() {
		size(900, 500, P3D);
	}

	@Override
	public void setup() {
		myo = new Myo(this, true); // Creo una intancia de la clase Myo
		// true permite acceder a los datos del sensor de electromiografia
		// jarvis = new Jarvis(myo);

		// jarvis.start();
		logica = new Logica(this, myo);

	}

	@Override
	public void draw() {
		background(255);
		logica.ejecutable();
		// if (jarvis.hasArm()) { // Solo cuando Jarvis est� leyendo informacion
		// // del brazo
		//
		// device = new Device(jarvis.getRawMyo(), 0); // creo una instancia
		//
		// // la clase Device, para
		// // controlar el
		// // dipositivo
		// id = device.getId();
		//
		// jarvis.unlock(Myo.Unlock.valueOf("HOLD"), id); // Desbloqueo el
		// // dispositivo
		//
		// pose = jarvis.getPose();
		//
		// // println(jarvis.getEmg(id));
		//
		// ace = jarvis.getAccelerometer();
		// println(ace);
		//
		// giro = jarvis.getGyroscope();
		// // println(giro);
		//
		// ori = jarvis.getOrientation();
		//
		// if (pose.getType() == Pose.Type.valueOf("FIST")) {
		// background(255, 0, 0);
		// float grado;
		//
		// grado = map(ori.x, 0, 1, 0, 360);
		//
		// println(ori);
		// pushMatrix();
		// translate(width / 2, height / 2, 0);
		// rotateZ(radians(grado));
		// rectMode(CENTER);
		// fill(50, 50, 50);
		// rect(0, 0, 50, 400);
		// popMatrix();
		//
		// } else if (pose.getType() == Pose.Type.valueOf("FINGERS_SPREAD"))
		// {
		// background(0, 255, 0);
		//
		// } else if (pose.getType() == Pose.Type.valueOf("WAVE_OUT")) {
		// background(0, 0, 255);
		//
		// }

		// }

	}

}
