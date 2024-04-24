package Assignment7_3_StudentRoster_DB;

//author: Donevyn Bellido

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 StudentRoster roster = new StudentRoster();

	        boolean running = true;
	        while (running) {
	            System.out.println("1. Enter student information");
	            System.out.println("2. Print the student roster");
	            System.out.println("3. Search for a student");
	            System.out.println("4. Save the student roster to disk");
	            System.out.println("5. Read the student roster from disk");
	            System.out.println("6. Exit");

	            System.out.print("Enter your choice: ");
	            if (scanner.hasNextInt()) {
	                int choice = scanner.nextInt();
	                scanner.nextLine();

	                switch (choice) {
	                    case 1:
	                    
	                        if (roster.getSize() < StudentRoster.MAX_SIZE) {
	                            System.out.print("Enter student's first name: ");
	                            String firstName = scanner.nextLine();
	                            System.out.print("Enter student's last name: ");
	                            String lastName = scanner.nextLine();
	                            System.out.print("Enter student's current address: ");
	                            String currentAddress = scanner.nextLine();
	                            System.out.print("Enter student's home address: ");
	                            String homeAddress = scanner.nextLine();
	                            System.out.print("Enter student's phone number: ");
	                            String phoneNumber = scanner.nextLine();
	                            System.out.print("Enter student's GPA: ");
	                            double GPA = scanner.nextDouble();
	                            scanner.nextLine();

	                            
	                            Student newStudent = new Student(firstName, lastName, currentAddress, homeAddress, phoneNumber, GPA);
	                            roster.addStudent(newStudent);
	                        } else {
	                            System.out.println("Student roster is full. Cannot add more students.");
	                        }
	                        break;
	                }
	            } else {
	                System.out.println("Invalid input. Please enter a number.");
	                scanner.next(); 
	            }
	        }

	        scanner.close();
		
		

	}

}
