package Clinic;

// Subclass of Person representing a patient
public class Patient extends Person {
 private String primaryCarePhysician;
 private String lastVisitedDoctor;

 // Constructor to initialize patient's details
 public Patient(String firstName, String lastName, String address, String primaryCarePhysician) {
     super(firstName, lastName);
     this.address = address;
     this.primaryCarePhysician = primaryCarePhysician;
     this.lastVisitedDoctor = "";
 }

 // Method to handle patient visits
 public void visit(String doctorName) {
     if (primaryCarePhysician.equalsIgnoreCase(doctorName)) {
         lastVisitedDoctor = primaryCarePhysician;
     } else {
         lastVisitedDoctor = primaryCarePhysician;
         System.out.println("Visiting specialist doctor: " + doctorName);
     }
 }

 // Display patient's information
 public void displayInformation() {
     System.out.println("\nPatient Information:");
     System.out.println("Name: " + firstName + " " + lastName);
     System.out.println("Address: " + address);
     System.out.println("Primary Care Physician: " + primaryCarePhysician);
     System.out.println("Last Visited Doctor: " + lastVisitedDoctor);
 }
}
