package Assignment7_3_StudentRoster_DB;

//author: Donevyn Bellido

public class StudentRoster {
	 private Student[] roster;
	    private int size;
	    public static final int MAX_SIZE = 100;


	    public StudentRoster() {
	        roster = new Student[MAX_SIZE];
	        size = 0;
	    }

	    public void addStudent(Student student) {
	        if (size < MAX_SIZE) {
	            roster[size++] = student;
	        } else {
	            System.out.println("Student roster is full. Cannot add more students.");
	        }
	    }

	    public void printStudent(Student student) {
	        System.out.println(student);
	    }

	  
	    public void printRoster() {
	        for (int i = 0; i < size; i++) {
	            System.out.println(roster[i]);
	        }
	    }

	    public void searchStudent(String firstName) {
	        boolean found = false;
	        for (int i = 0; i < size; i++) {
	            if (roster[i].getFirstName().equalsIgnoreCase(firstName)) {
	                System.out.println("Student found:");
	                System.out.println(roster[i]);
	                found = true;
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("Student with first name '" + firstName + "' not found.");
	        }
	    }

	    public int getMaxSize() {
	    	return MAX_SIZE;
	    }
	    
	    
	    public int getSize() {
	        return size;
	    }

}
