package Math;

public enum GlassUnit {
	DOUBLEGLAZED("Двухкамерный"),
	THREECHAMBER("Трёхкамерный");

	private String text;

	GlassUnit(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

	public static GlassUnit fromString(String text) {
		for (GlassUnit b : GlassUnit.values()) {
			if (b.text.equalsIgnoreCase(text)) {
				return b;
			}
		}
		return null;
	}
}
