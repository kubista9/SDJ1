import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileReading {
	public static void main(String[] args)
	{
//		ex1();
			ex2();
	}
		public static void ex1() {
			String filename = "Courses.txt";
			File file = new File(filename);
			Scanner in = null;

			try {
				in = new Scanner(file);
			} catch (FileNotFoundException e) {
				throw new RuntimeException(e);
			}

			while(in.hasNext()){
				String line = in.nextLine();
				String[] token = line.split(";");
				String txt = token[0].trim();
				int x = Integer.parseInt(token[1].trim());
				System.out.println(txt + " - " + x + " - ");
			}
		}

	public static void ex2() {
		GradeList gradeList2 = new GradeList();
		gradeList2.addGrade(new Grade(7,"math"));
		gradeList2.addGrade(new Grade(10,"SDJ"));
		gradeList2.addGrade(new Grade(12,"DMAY"));

		String filename = "Grades.txt";
		File file = new File(filename);
		try {
			PrintWriter out = new PrintWriter(file);
			String[] testData = new String[gradeList2.size()];

			for (int i = 0; i < gradeList2.size(); i++){
				String text5 = gradeList2.getGrade(i).getCourse() + "; " + gradeList2.getGrade(i).getGrade();
				testData[i] = text5;
				out.println(testData[i]);
			}

			out.flush();
			out.close();

			System.out.println("End printing data to file"  + file.getAbsolutePath());
		}
		catch (FileNotFoundException e){
			throw new RuntimeException(e);
		}
	}
}

