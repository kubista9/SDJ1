public class Programme extends Education{
	private String level;
	public Programme(String code, String title, String level){
		super(code, title);
		this.level = level;
	}

	public String getLevel() {
		return level;
	}

	public boolean Equals(Object obj){
		if (obj == null || getClass() != obj.getClass()){
			return false;
		}

		Programme other = (Programme) obj;
		return this.level.equals(other.level);
	}

	@Override
	public String toString() {
		return "Programme{" + "level='" + level + '\'' + '}';
	}
}
