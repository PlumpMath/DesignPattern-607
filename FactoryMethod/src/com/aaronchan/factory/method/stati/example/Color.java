package com.aaronchan.factory.method.stati.example;

public enum Color {
	BLACK("black"), WHITE("white"), YELLOW("yellow");

	private String title;

	Color(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
}
