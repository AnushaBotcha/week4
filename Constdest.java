import java.util.Scanner;

class Student {
    String fullName;
    int rollNum;
    double semPercentage;
    String collegeName;
    int collegeCode;

    void displaydetails() {
        System.out.println("Name: " + fullName);
        System.out.println("Roll Number: " + rollNum);
        System.out.println("Sem Percentage: " + semPercentage);
        System.out.println("College Name: " + collegeName);
        System.out.println("College Code: " + collegeCode);
    }

    Student() {
        System.out.println("The Student ID has been Created !");
    }
}

public class Constdest {
    public static void main(String[] args) {
        Student Anusha = new Student();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Name: ");
        Anusha.fullName = input.nextLine();

        System.out.print("Enter the Roll Number: ");
        Anusha.rollNum = input.nextInt();
        input.nextLine(); 

        System.out.print("Enter the Sem percentage: ");
        Anusha.semPercentage = input.nextDouble();
        input.nextLine();
        System.out.print("Enter the College Name: ");
        Anusha.collegeName = input.nextLine();

        System.out.print("Enter the College Code: ");
        Anusha.collegeCode = input.nextInt();

        input.close();

        Anusha.displaydetails();
    }
}

