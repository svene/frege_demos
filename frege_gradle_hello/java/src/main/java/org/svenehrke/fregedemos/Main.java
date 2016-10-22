package org.svenehrke.fregedemos;

import fj.Unit;
import org.svenehrke.fregedemos.FregeFunctions;

import static fj.Unit.unit;

public class Main {
	public static void main(String [] args) {
		System.out.println("Main");
		String s = FregeFunctions.java2Frege(5);
		System.out.println("java2Frege:\n" + s);
	}
}