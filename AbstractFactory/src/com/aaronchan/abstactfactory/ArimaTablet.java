package com.aaronchan.abstactfactory;

public class ArimaTablet implements Tablet {

	private static final String DESCRIPTION = "this is ArimaTablet";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}