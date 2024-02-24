public abstract class PrintedBook extends Book {
	private boolean isPaperback;

	public PrintedBook(String title, String isbn, boolean isPaperback){
		super(title, isbn);
		this.isPaperback = isPaperback;
	}

	public boolean isPaperback(){
		return isPaperback;
	}

	public String getBookType() {
		if (isPaperback == true) {
			return "Paperback";
		} else return "Hard Cover";
	}

	public String toString(){
		return super.toString() + "Is paperback? " + isPaperback;
	}

	public boolean Equals(Object obj){
		if (obj == null || getClass() != obj.getClass()){
			return false;
		}

		PrintedBook other = (PrintedBook) obj;
		return super.equals(obj) && this.isPaperback == other.isPaperback;
	}
}
