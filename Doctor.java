package Clinic;

// Subclass of Person representing a doctor
public class Doctor extends Person {
 private String specialty;
 private double officeVisitFee;
 private int numberOfVisitedPatients;

 // Constructor to initialize doctor's details
 public Doctor(String firstName, String lastName, String specialty, double officeVisitFee) {
     super(firstName, lastName);
     this.specialty = specialty;
     this.officeVisitFee = officeVisitFee;
     this.numberOfVisitedPatients = 0;
 }

 // Method to increment the number of visited patients
 public void addPatientVisit() {
     numberOfVisitedPatients++;
 }

 // Method to calculate doctor's paycheck based on visited patients
 public double calculatePaycheck() {
     return numberOfVisitedPatients * officeVisitFee;
 }

 // Display doctor's information
 public void displayInformation() {
     System.out.println("\nDoctor Information:");
     System.out.println("Name: " + firstName + " " + lastName);
     System.out.println("Specialty: " + specialty);
     System.out.println("Office Visit Fee: $" + officeVisitFee);
     System.out.println("Number of Visited Patients: " + numberOfVisitedPatients);
     System.out.println("Paycheck: $" + calculatePaycheck());
 }

 // Method for a patient visit
 public void visit(String patientName) {
     if (lastName.equalsIgnoreCase(patientName)) {
         addPatientVisit();
     }
 }
}
