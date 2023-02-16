package gettersetter;

class Laptop {
	int usbport;
	float processorspeed;

	public Laptop() {

	}

	public Laptop(int usbport, float processorspeed) {

		this.usbport = usbport;
		this.processorspeed = processorspeed;
	}

	public int getUsbport() {
		return usbport;
	}

	public void setUsbport(int usbport) {
		this.usbport = usbport;
	}

	public float getProcessorspeed() {
		return processorspeed;
	}

	public void setProcessorspeed(float processorspeed) {
		this.processorspeed = processorspeed;
	}

	public String toString() {
		return "Laptop [usbport=" + usbport + ", processorspeed=" + processorspeed + "]";
	}

}

public class Getset {

	public static void main(String[] args) {
		Laptop l = new Laptop();

		l.setUsbport(4);
		l.setProcessorspeed(450f);
		System.out.println("usbport=" + l.getUsbport() + " " + "processorspeed=" + l.getProcessorspeed());

	}

}
