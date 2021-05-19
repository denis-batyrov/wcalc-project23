package Math;

public enum OpeningMechanism {
	DULL("Глухое"), 
	FOLDING("Поворотное"), 
	SWIVIEL("Откидное"),
	SWINGOUT("Поворотно-откидное");

	private String text;

	OpeningMechanism(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

	public static OpeningMechanism fromString(String text) {
		for (OpeningMechanism b : OpeningMechanism.values()) {
			if (b.text.equalsIgnoreCase(text)) {
				return b;
			}
		}
		return null;
	}
}
