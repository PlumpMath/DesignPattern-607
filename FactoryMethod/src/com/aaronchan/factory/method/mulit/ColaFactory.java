package com.aaronchan.factory.method.mulit;

public class ColaFactory {
	public Cola producePensiCola(Size size) {
		return new CocaCola(size);
	}

	public Cola produceCocaCola(Size size) {
		return new PensiCola(size);
	}
}
