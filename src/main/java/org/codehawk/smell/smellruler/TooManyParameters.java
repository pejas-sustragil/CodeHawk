package org.codehawk.smell.smellruler;

public class TooManyParameters implements Smell{
	private static final Smell.Type smellType = Smell.Type.TOOMANYPARAMETERS;

	@Override
	public boolean is(Type type) {
		return smellType == type;
	}

	@Override
	public Type type() {
		return smellType;
	}

	@Override
	public String smellDetail() {
		return "Avoid TOO MANY CASES IN ONE SWITCH!";
	}
}
