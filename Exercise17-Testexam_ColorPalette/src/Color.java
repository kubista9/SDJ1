public class Color {
	private int red, green, blue;

	public Color(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}

	public boolean isGrey(){
		return (red == green && green == blue);
	}

	public void mixWith(Color color2){
		this.red = (int)0.5*red + (int)0.5*color2.getRed();
		this.green = (int)0.5*green + (int)0.5*color2.getGreen();
		this.blue = (int)0.5*blue + (int)0.5*color2.getBlue();
	}

	public Color copy(){
		Color copy = new Color(red, green, blue);
		return copy;
	}

	public boolean equals(Object obj){
		if (obj == null && getClass() != obj.getClass()){
			return false;
		}

		Color other = (Color) obj;
		return red == other.red && blue == other.blue && green == other.green;
	}

	@Override
	public String toString() {
		return "Color{" + "red=" + red + ", green=" + green + ", blue=" + blue + '}';
	}
}




