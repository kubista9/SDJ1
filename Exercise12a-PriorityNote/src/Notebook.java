public class Notebook {
	private int size;
	private PriorityNote[] notes;

	public Notebook(int capacity) {
		this.size = 0;
		this.notes = new PriorityNote[capacity];
	}

	public int getSize() {
		return size;
	}

	public void addNote(PriorityNote note) {
		notes[size] = note.copy();
		size++;
	}

	public void addNote(String note) {
		notes[size] = new PriorityNote(note);
		size++;
	}

	public void addHighPriorityNote(String note) {
		notes[size] = new PriorityNote(note);
		notes[size].setHighPriority();
		size++;
	}

	public String getNote(int index) {
		return notes[index].getNote();
	}

	public boolean isHighPriorityNote(int index) {
		return notes[index].isHighPriority();
	}

	public int indexOfMostImportantNote(){
		for (int i = 0; i < size; i++) {
			if (isHighPriorityNote(i)) {
				return i;
			}
		}
		if (size>0) {
			return 0;
		}
		return -1;
	}

	public String getMostImportantNote() {
		int index = indexOfMostImportantNote();
		if (index > -1) {
			return notes[index].getNote();
		}
		return null;
	}

	public void removeNote(int index) {
		for (int i = index; i < size -1; i++){
			notes[i] = notes[i + 1];
		}
		notes[size -1] = null; // clean upsize--;
	}

	@Override
	public String toString() {return "Notebook{" + "size=" + size + ", notes=" + notes + '}';
	}
}
