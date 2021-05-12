package Math;

public enum Accessory {
	CORNISE("Карниз"), 
	SILL("Подоконник"),
	BOTH("Подоконник и карниз");

	private String text;

	Accessory(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

	public static Accessory fromString(String text) {
		for (Accessory b : Accessory.values()) {
			if (b.text.equalsIgnoreCase(text)) {
				return b;
			}
		}
		return null;
	}
}