public class Person {
		private String name;
		private int age;
		private char gender;
		Person (String name, int age, char gender) {
			setName(name);
			setAge(age);
			setGender(gender);
		}

		Person (String name, char gender) {
			this(name, 0, gender);
		}

		Person (char gender) {
			this(null, 0, gender);
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public char getGender() {
			return gender;
		}

		public String getAgeStatus() {
			if (age < 0) {
				return "error";
			}

			if ((age > 0 && age <= 17) && ( gender == 'M' || gender== 'm')){
				return "Boy";
			}

			else if ((age > 0 && age <= 17) && ( gender == 'F' || gender== 'f')){
				return "Girl";
			}

			else if ((age >= 18) && ( gender == 'M' || gender == 'm')) {
				return "Man";
			}

			else if((age >= 18) && ( gender == 'F' || gender == 'f')) {
				return "Woman";
			}
			else return "Error";
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}

		public String toString() {
			String all = name + ", age = " + age + ",gender = " + gender +"\n" + "Is " + getAgeStatus();
			return all;
		}
	}

