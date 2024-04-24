package Assignment7_3_StudentRoster_DB;

//author: Donevyn Bellido

public class Student {
	  private String firstName;
	    private String lastName;
	    private String currentAddress;
	    private String homeAddress;
	    private String phoneNumber;
	    private double GPA;

	    
	    public Student(String firstName, String lastName, String currentAddress, String homeAddress, String phoneNumber, double GPA) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.currentAddress = currentAddress;
	        this.homeAddress = homeAddress;
	        this.phoneNumber = phoneNumber;
	        this.GPA = GPA;
	    }

	    
	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public String getCurrentAddress() {
	        return currentAddress;
	    }

	    public void setCurrentAddress(String currentAddress) {
	        this.currentAddress = currentAddress;
	    }

	    public String getHomeAddress() {
	        return homeAddress;
	    }

	    public void setHomeAddress(String homeAddress) {
	        this.homeAddress = homeAddress;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }

	    public double getGPA() {
	        return GPA;
	    }

	    public void setGPA(double GPA) {
	        this.GPA = GPA;
	    }

	    public String toString() {
	        return "Name: " + firstName + " " + lastName + "\n"
	                + "Current Address: " + currentAddress + "\n"
	                + "Home Address: " + homeAddress + "\n"
	                + "Phone Number: " + phoneNumber + "\n"
	                + "GPA: " + GPA;
	    }
	

}
