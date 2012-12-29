package edu.mediacampus.pam.melken;

/**
 * Created with IntelliJ IDEA. User: retokiefer Date: 13.12.12 Time: 16:17 To
 * change this template use File | Settings | File Templates.
 */
public class Melkautomat {

	private int kuehe = 1;
	private int fassungsvermoegen = 20;
	private int melkMenge = 0;

	public Melkautomat() {

	}

	public Melkautomat(int kuehe) {
		this.kuehe = kuehe;
	}

	public void melken() {

		outerloop: for (int i = 1; i <= this.kuehe; i++) {

			Kuh kuh = new Kuh();

			if (kuh.isGemolken() == false) {
				do {
					this.fassungsvermoegen = this.fassungsvermoegen - 1;
					this.melkMenge++; // = +1
					kuh.werdeGemolken();
					System.out.println(kuh.toString());

					if (fassungsvermoegen <= 0) {
						System.out.println("Neue Milchkanne anschliessen!");
						break outerloop;
					}
				}

				while (kuh.getMilch() > 0);
			}
		}
	}

	public void getMelkmenge() {
		System.out.println("Es wurden bislang " + this.melkMenge
				+ " Liter Milch gemolken.");
	}

}
