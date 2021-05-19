package Math;

public enum Accessory {
	CORNISE("Корниз"), 
	SILL("Поддоконник"),
	BOTH("Корниз и Поддоконник");

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
