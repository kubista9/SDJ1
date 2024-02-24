import java.util.Arrays;

public class ColorPalette {
	private int numberOfColors;
	private Color[] colors;

	public ColorPalette(int maxNumberOfColors){
		this.numberOfColors = 0;
		this.colors = new Color[maxNumberOfColors];
	}

	public int getNumberOfColors(){
		return numberOfColors;
	}

	public void add(Color color){
			if (numberOfColors < colors.length){
				colors[numberOfColors] = color.copy();
				numberOfColors++;
		}
	}

	public Color get(int index){
		return colors[index];
	}

	public int getNumberOfGrayColors(){
		int count = 0;
		for (int i = 0; i < colors.length; i++){
			if (colors[i].isGrey()){
				count++;
			}
		}
		return count;
	}

	public void mixColors(int index, Color color2){
		colors[index].mixWith(color2);
	}

	public boolean equals(Object obj){
		if (obj == null && getClass() != obj.getClass()){
			return false;
		}

		ColorPalette other = (ColorPalette) obj;
		return numberOfColors == other.numberOfColors && colors.equals(other.colors);
	}

	@Override
	public String toString() {
		return "ColorPalette{" + "numberOfColors=" + numberOfColors + ", colors=" + Arrays.toString(colors) + '}';
	}
}
