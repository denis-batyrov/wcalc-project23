package Math;

public enum FrameColor {
	WHITE("Бесцветный"), 
	COLOR("Цветной");

	private String text;

	FrameColor(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

	public static FrameColor fromString(String text) {
		for (FrameColor b : FrameColor.values()) {
			if (b.text.equalsIgnoreCase(text)) {
				return b;
			}
		}
		return null;
	}
}