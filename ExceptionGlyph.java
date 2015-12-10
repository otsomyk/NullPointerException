package constructor;

public class ExceptionGlyph extends Glyph {
	ExceptionGlyph[] gl = new ExceptionGlyph[2];

	public ExceptionGlyph() {
	}

	@Override
	public void draw() {
		System.out.println(gl[0]);
	}
}
