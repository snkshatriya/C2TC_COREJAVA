import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name");
        String name = sc.next();

        System.out.println("Enter the Income");
        int income = sc.nextInt();

        System.out.println("Enter the Gender");
        String gender = sc.next();

        System.out.println("Enter the age");
        int age = sc.nextInt();

        sc.close(); // Close the scanner to release resources

        // Create a Person object and set the attributes
        Person p = new Person();
        p.setName(name);
        p.setIncome(income);
        p.setGender(gender);
        p.setAge(age);

        // Now you can work with the populated Person object
        System.out.println("Person details:");
        System.out.println("Name: " + p.getName());
        System.out.println("Income: $" + p.getIncome());
        System.out.println("Gender: " + p.getGender());
        System.out.println("Age: " + p.getAge());
        System.out.println("Tax not calculated: $" + p.getTax()); 
        // Tax might not be calculated yet
        TaxCalcuate calc=new TaxCalcuate();
        calc.calculateTax(p);
        System.out.println("Tax after calculation: $" + p.getTax()); 
        
        
        
    }
}
