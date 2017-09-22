package papagei;

/**
 * @author kevin veen-birkenbach
 * @version 2017-09-22
 */
public class PapageiTest {

	public static void main(String[] args) {
		Papagei papageno = new Papagei();
		System.out.println(papageno.gebeLaut());
		System.out.println(papageno.lerneWort("Fisch"));
		System.out.println(papageno.lerneWort("Hallo"));
		papageno.setSprachbegabung(10);
		System.out.println("Lerne Wort <<Hallo>>: " + papageno.lerneWort("Hallo"));
	}

}
