package Clinic;

import java.util.Scanner;

// Main class
public class Clinic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initializing doctors and employees
        Doctor doctor1 = new Doctor("Michael", "Willis", "Pediatrician", 100.0);
        Doctor doctor2 = new Doctor("John", "Blake", "Obstetrician", 150.0);
        Doctor doctor3 = new Doctor("Sara", "Frost", "Pediatric", 150.0);
        Employee employee1 = new Employee("John", "Jones", 170.0, 2000.0);
        Employee employee2 = new Employee("James", "Harison", 190.0, 3200.0);

        // Creating an array to hold staff members
        Person[] staff = { doctor1, doctor2, doctor3, employee1, employee2 };

        // Creating an array to hold patients
        Patient[] patients = new Patient[100];
        int patientCount = 0;

        // Main loop for patient interactions
        do {
            System.out.println("\nIs this a new patient? (yes/no)");
            String isNewPatient = scanner.nextLine().toLowerCase();

            if (isNewPatient.equals("yes")) {
            	// Adding a new patient
                System.out.println("Patient's first name:");
                String firstName = scanner.nextLine();
                System.out.println("Patient's last name:");
                String lastName = scanner.nextLine();
                System.out.println("Patient's address:");
                String address = scanner.nextLine();
                System.out.println("Patient's primary care doctor:");
                String primaryCareDoctor = scanner.nextLine();

                // Creating and adding new patient
                patients[patientCount] = new Patient(firstName, lastName, address, primaryCareDoctor);
                patientCount++;
            }

            // Finding a patient by last name
            System.out.println("Enter the patient's last name to find the record:");
            String lastNameInput = scanner.nextLine();
            Patient currentPatient = findPatient(patients, patientCount, lastNameInput);

            if (currentPatient != null) {
            	// Handling patient visit
                System.out.println("Doctor's name:");
                String doctorName = scanner.nextLine();
                currentPatient.visit(doctorName);
                visitPatient(staff, currentPatient, doctorName);
            }

            System.out.println("More patients? (yes/no)");
        } while (scanner.nextLine().toLowerCase().equals("yes"));

        // Displaying information for all staff members
        for (Person person : staff) {
            displayPersonInformation(person);
        }

        scanner.close();
    }
    
    // Method to find a patient by last name
    private static Patient findPatient(Patient[] patients, int patientCount, String lastName) {
        for (int i = 0; i < patientCount; i++) {
            if (patients[i].lastName.equalsIgnoreCase(lastName)) {
                return patients[i];
            }
        }
        return null;
    }
    
    // Method to visit a patient and update relevant staff members
    private static void visitPatient(Person[] staff, Patient patient, String doctorName) {
        for (Person person : staff) {
            person.visit(doctorName);
        }
    }
    
    // Method to display information for a person
    private static void displayPersonInformation(Person person) {
        person.displayInformation();
    }
}

