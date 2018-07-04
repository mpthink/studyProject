package com.think.fixBug;

public enum TestEnum {
	Unknown(0), Up(1), Down(2),
	;

	// Member variable holding the ordinal for each enum
	private final int ordinal;

	// Constructor
	TestEnum(int ordinal) {
		this.ordinal = ordinal;
	}

	public int getOrdinal() {
		return ordinal;
	}
}
