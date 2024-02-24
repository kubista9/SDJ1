public class Test {
	public static void main(String[] args) {
		Color color1 = new Color(255,255,255);
		Color color2 = new Color(200,155,255);

		ColorPalette cp = new ColorPalette(2);
		cp.add(color1);
		cp.add(color2);
		System.out.println(cp);
	}
}
