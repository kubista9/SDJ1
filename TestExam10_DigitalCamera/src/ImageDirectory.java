public class ImageDirectory {
	private int numberOfImages;
	private Image[] images;

	public ImageDirectory(int numberOfImages) {
		this.numberOfImages = 0;
		this.images = new Image[numberOfImages];
	}

	public int getNumberOfImages(){
		return numberOfImages;
	}

	public void addImage(){
		numberOfImages++;
	}

	public void AddDescription(int index, String description){
		for (int i = 0; i < getNumberOfImages(); i++){
			if (images[i].equals(images[index])){
				images[i].setDescription(description);
			}
		}
	}

	public void removeImage(int index){
		for (int i = 0; i < getNumberOfImages(); i++){
			if (images[i].equals(images[index])){
				for (int j = 0; j < getNumberOfImages()-2; j--){
					images[i] = images[i++];
				}
				images[i - 1] = null;
				numberOfImages--;
			}
		}
	}

	public Image getImage(int index){
		return images[index];
	}

	public Image getImage(String description){
		for (int i = 0; i < getNumberOfImages(); i++){
			if (images[i].getDescription().equals(description)){
				return images[i];
			}
		}
		return null;
	}
}
