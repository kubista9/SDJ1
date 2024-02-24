import parser.ParserException;
import parser.XmlJsonParser;

import java.io.File;

public class GradeListTest {
	public static void main(String[] args) throws ParserException {

		GradeList grades = new GradeList();
		Grade grade = new Grade(2, "SDJ");
		Grade grade1 = new Grade(4, "DMAY");
		Grade grade2 = new Grade(7, "SEP");

		grades.addGrade(grade);
		grades.addGrade(grade1);
		grades.addGrade(grade2);

		System.out.println(grades);
		for (int i = 0; i < grades.size(); i++) {
			System.out.println(grades.getGrade(i));
		}

		XmlJsonParser parser = new XmlJsonParser();
		File file1 = parser.toJson(grades, "GradeList.json");
		System.out.println("Json file: " + file1.getAbsolutePath());

		GradeList grades2 = parser.fromJson("GradeList.json", GradeList.class );

		System.out.println(grades2);
		for (int i = 0; i < grades2.size(); i++) {
			System.out.println(grades2.getGrade(i));
		}

		File file2 = parser.toXml(grades, "GradeList.xml");
		System.out.println("XML File" + file2.getAbsolutePath());
	}
}
