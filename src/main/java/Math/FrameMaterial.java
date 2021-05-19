package Math;

public enum FrameMaterial {
	PVC("ПВХ"), 
	WOOD("Дерево"), 
	METAL("Металл");

	private String text;

	FrameMaterial(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

	public static FrameMaterial fromString(String text) {
		for (FrameMaterial b : FrameMaterial.values()) {
			if (b.text.equalsIgnoreCase(text)) {
				return b;
			}
		}
		return null;
	}
}
