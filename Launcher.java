package constructor;

public class Launcher {

	public static void main(String[] args) {
		Glyph g = new RoundGlyph(15);
		g.draw();
		Glyph g2 = new ExceptionGlyph();
		g2.draw();

	}

}
