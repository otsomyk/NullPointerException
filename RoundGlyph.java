package constructor;

public class RoundGlyph extends Glyph {
	private int radius = 15;

	public RoundGlyph(int radius) {
		
		System.out.println("RounGlyph#Constructor");
		draw();
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("RoundGlyph#draw()");
		System.out.println("RoundGlyph radius: " + radius);

	}
}
