package papagei;

/**
 * @author kevin veen-birkenbach
 * @version 2017-09-22
 */
public abstract class Vogel implements Flugfaehig {

	private float schnabellaenge = 0.5f;

	public Vogel() {
	}

	public Vogel(float schnabellaenge) {
		setSchnabellaenge(schnabellaenge);
	}

	public void setSchnabellaenge(float schnabellaenge) {
		if (schnabellaenge >= 0) {
			this.schnabellaenge = schnabellaenge;
		}
	}

	public float getSchnabellaenge() {
		return schnabellaenge;
	}

	public abstract String gebeLaut();

	@Override
	public abstract void fliege();

}
