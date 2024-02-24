public class PriorityNote {
	private String note;
	private boolean highPriority;

	public PriorityNote(String note) {
		this.note = note;
		this.highPriority = false;
	}

	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}

	public boolean isHighPriority() {
		return highPriority;
	}

	public void setHighPriority() {
		highPriority = true;
	}

	public void setLowPriority() {
		highPriority = false;
	}

	public PriorityNote copy() {
		PriorityNote copy = new PriorityNote(note);
		copy.highPriority = highPriority;
		return copy;
	}

	public String toString() {
		String s = note;
		if (highPriority){
			s += " (high priority)";
		}
		return s;
	}
}
