package com.testing.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Practice1_Demo {
	@Test(groups="launch")
	private void browser() {
		System.out.println("browser");

	}
	@Ignore
	@Test(groups="launch")
	private void url() {
		System.out.println("url");

	}
	@Test(groups="woman")
	private void women() {
		System.out.println("women");

	}
	@Test(groups="woman")
	private void dress() {
		System.out.println("dress");

	}
	@Test(groups="man")
	private void tshirt() {
		System.out.println("T-Shirt");

	}
	@Test(groups="man")
	private void dhothi() {
		System.out.println("Dhothi");

	}


}
