package papagei;

/**
 * @author kevin veen-birkenbach
 * @version 2017-09-22
 */
public class Papagei extends Vogel {

	private int sprachbegabung = 1;

	public Papagei() {
	}

	public Papagei(float schnabellaenge, int sprachbegabung) {
		super(schnabellaenge);
		setSprachbegabung(sprachbegabung);
	}

	public int getSprachbegabung() {
		return sprachbegabung;
	}

	public void setSprachbegabung(int sprachbegabung) {
		if (sprachbegabung >= 0 && sprachbegabung <= 10) {
			this.sprachbegabung = sprachbegabung;
		}
	}

	@Override
	public String gebeLaut() {
		return "Krächz";
	}

	@Override
	public void fliege() {
		return;
	}

	public boolean lerneWort(String wort) {
		return ("Hallo".equals(wort) && this.sprachbegabung >= 5);
	}
}
