package sensor;

import com.thalmic.myo.DeviceListener;
import com.thalmic.myo.Vector3;

import de.voidplus.myo.*;
import processing.core.*;

public class Jarvis implements Runnable {
	private Thread t;
	private PApplet app;
	private Myo myo;

	private Device device;
	private Pose pose;
	private Vector3 point;
	private DeviceListener points;
	private int id;
	private boolean emg;
	private PVector acelerometro, giroscopio, orientacion;

	public Jarvis(Myo myo,PApplet app) {
		this.myo = myo;
		this.app = app;
		t = new Thread(this, "hiloJarvis");
		t.start();
		id = 0;
	}

	@Override
	public void run() {
		while (true) {
			if (myo.hasArm()) {
				deviceControl();
				unLock();
				// gesto();
//				pointer();
				calcularFisicas();
			}
			try {
				Thread.sleep(60);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	private void deviceControl() {
		if (device == null) {
			device = new Device(myo.getRawMyo(), 0);
		}
		id = device.getId();

	}

	private void unLock() {

		myo.unlock(Myo.Unlock.valueOf("HOLD"), id);

	}

	public void pointer() {
		if (device != null) {			
			float dx = myo.getOrientation().z;
			float dy = myo.getOrientation().y;
			
			float dxF = PApplet.map(dx, 1, 0, -app.width/2, app.width+app.width/2);
			float dyF = PApplet.map(dy, 1, 0, -app.height/2, app.height+app.height/2);

			app.noStroke();
			app.fill(100);
			app.ellipse(dxF, dyF, 20, 20);
		}
	}

	public Object gesto() {
		if (myo.hasArm()) {
			pose = myo.getPose();
			Object p;
			p = pose.getType();
			return p;
		}
		return null;
	}

	public boolean validarGestos(Object p, String poseEvent) {
		if (p == Pose.Type.valueOf(poseEvent)) {
			return true;
		}
		return false;
	}

	private void calcularFisicas() {
		acelerometro = myo.getAccelerometer(id);
		giroscopio = myo.getGyroscope(id);
		orientacion = myo.getOrientation(id);
	}

}
