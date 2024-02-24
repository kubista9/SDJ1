import java.util.ArrayList;

public class KinderGarden {
	private int countTeacher;
	private ArrayList<Child> children;

	public KinderGarden(){
		this.countTeacher = 0;
		this.children = new ArrayList<>();
	}

	public void addChild(Child child){
		children.add(child);
	}

	public void removeChild(Child child){
		children.remove(child);
	}

	public void hireTeachers(int count){
		countTeacher += count;
	}

	public void fireTeacher(){
		this.countTeacher--;
	}

	public int countChildren() {
		return children.size();
	}

//	public int countTeachers() {
//		return countTeachers;
//	}

	public double getAverageChildAge(){
		int age = 0;
		for (int i = 0; i < children.size(); i++){
			age += children.get(i).getAge();
		}
		return (double)age/children.size();
	}

	public double getNorm(){
		return children.size()/countTeacher;
	}

	public void celebrateBirthday(String name){
		for (int i = 0; i < children.size(); i++){
			if (children.get(i).getName().equals(name)) {
				children.get(i).setAge(children.get(i).getAge() + 1);
			}
		}
	}

	@Override
	public String toString() {
		return "KinderGarden{" + "countTeacher=" + countTeacher + ", children=" + children + '}';
	}
}
