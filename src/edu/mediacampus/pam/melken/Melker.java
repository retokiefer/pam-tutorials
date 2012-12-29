package edu.mediacampus.pam.melken;

/**
 * Created with IntelliJ IDEA. User: retokiefer Date: 13.12.12 Time: 16:30 To
 * change this template use File | Settings | File Templates.
 */
public class Melker {

	public static void main(String[] args) {
		Melkautomat melkautomat = new Melkautomat(5);
		melkautomat.melken();
		melkautomat.getMelkmenge();
	}
}
