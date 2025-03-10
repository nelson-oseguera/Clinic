package Clinic;

// Subclass of Person representing an employee
public class Employee extends Person {
 private double monthlyWorkingHours;
 private double salary;

 public Employee(String firstName, String lastName, double monthlyWorkingHours, double salary) {
     super(firstName, lastName);
     this.monthlyWorkingHours = monthlyWorkingHours;
     this.salary = salary;
 }

 // Method to calculate employee's paycheck based on working hours
 public String calculatePaycheck() {
     double paycheck;
     if (monthlyWorkingHours > 165) {
         double overtimePay = (salary / 165) * 1.5 * (monthlyWorkingHours - 165);
         paycheck = salary + overtimePay;
     } else {
         paycheck = salary;
     }
     return String.format("%.2f", paycheck);
 }

 // Display employee's information
 public void displayInformation() {
     System.out.println("\nEmployee Information:");
     System.out.println("Name: " + firstName + " " + lastName);
     System.out.println("Monthly Working Hours: " + monthlyWorkingHours);
     System.out.println("Salary: $" + salary);
     System.out.println("Paycheck: $" + calculatePaycheck());
 }

 // Method for a patient visit (no action for employees)
 public void visit(String doctorName) {
     // Employees don't visit doctors
 }
}

