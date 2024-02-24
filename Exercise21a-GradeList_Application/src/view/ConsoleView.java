package view;

import model.GradeListModel;
import model.GradeListModelManager;

import java.util.Scanner;

public class ConsoleView {

	private GradeListModel model;

	public ConsoleView(GradeListModel model){
		this.model = model;
	}

	public void start(){
		Scanner input = new Scanner (System.in);
		boolean running = true;

		while(running){
			System.out.println(" 1) Add a grade");
			System.out.println(" 2) Remove a grade");
			System.out.println(" 3) Average");
			System.out.println(" 4) Max");
			System.out.println(" 5) Min");
			System.out.println(" 6) Get grade");
			System.out.println(" 7) Get size");
			System.out.println(" 8) Show all grades");
			System.out.println(" 9) QUIT");

			System.out.println("\n Enter Choice: ");
			int choice = input.nextInt();

			switch (choice){
				case 1:
					System.out.println("Grade: ");
					int grade = input.nextInt();
					input.nextLine();
					System.out.println("Course: ");
					String course = input.nextLine();
					model.addGrade(grade, course);
					break;
				case 2:
					System.out.println("Index: ");
					int index = input.nextInt();
					input.nextLine();
					model.removeGrade(index);
					break;
				case 3:
					System.out.println("Average grade: " + model.getAverage());
					break;
				case 4:
					System.out.println("Max grade: " + model.getMaxGrade());
					break;
				case 5:
					System.out.println("Min grade: " + model.getMinGrade());
					break;
				case 6:
					System.out.println("Index: ");
					int indexGrade = input.nextInt();
					input.nextLine();
					System.out.println("Grade" + model.getGrade(indexGrade));
					break;
				case 7:
					System.out.println("Size: " + model.numberOfGrades());
					break;
				case 8:
					System.out.println("All grades: " + model.getAll());
					break;
				case 9:
					break;
			}
		}
	}

	public static void main(String[] args) {
		GradeListModel model = new GradeListModelManager();
		ConsoleView view = new ConsoleView(model);
		view.start();
	}

}
