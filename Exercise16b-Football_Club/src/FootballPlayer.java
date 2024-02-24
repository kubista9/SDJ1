public class FootballPlayer {
	private String name;
	private int skill;
	private int number;
	private String fieldPosition;
	private boolean isCaptain;

	public FootballPlayer(String name, int skill){
		this.name = name;
		this.skill = skill;
		this.number = 0;
		this.fieldPosition = "";
		this.isCaptain = false;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public void assignNumber(int number) {
		this.number = number;
	}

	public int getSkill() {
		return skill;
	}

	public void train() {
		skill++;
	}

	public String getFieldPosition() {
		return fieldPosition;
	}

	public void setFieldPosition(String position) {
		this.fieldPosition = position;
	}

	public boolean getIsCaptain() {
		return isCaptain;
	}

	public void setIsCaptain(boolean isCaptain) {
		this.isCaptain = isCaptain;
	}

	@Override
	public String toString() {
		return name + " " + skill + " " + number + " " + fieldPosition + " " + isCaptain;
	}
}
