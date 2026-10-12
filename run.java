import java.sql.*;
import java.util.Scanner;

public class run {

    public static void main(String a[]) throws SQLException {

        Scanner input = new Scanner(System.in);

        operations ops = new operations();

        System.out.println("1. add student");
        System.out.println("2. delete student");
        System.out.println("3. update student");
        System.out.println("4. list all students");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        if (choice == 1) {

            System.out.print("enter id: ");
            int id = input.nextInt();

            input.nextLine();

            System.out.print("Eenter name: ");
            String name = input.nextLine();

            System.out.print("enter subject: ");
            String subject = input.nextLine();

            System.out.print("enter marks: ");
            int marks = input.nextInt();

            Student s = new Student(id, name, subject, marks);

            ops.addStudent(s);

        } else if (choice == 2) {

            System.out.print("enter ID to delete: ");
            int id = input.nextInt();

            ops.deleteStudent(id);

        } else if (choice == 3) {

            System.out.print("enter id to update: ");
            int id = input.nextInt();

            input.nextLine();

            System.out.print("enter name: ");
            String name = input.nextLine();

            System.out.print("enter subject: ");
            String subject = input.nextLine();

            System.out.print("enter marks: ");
            int marks = input.nextInt();

            Student s = new Student(id, name, subject, marks);

            ops.updateStudent(s);

        } else if (choice == 4) {

            ops.list_all();

        } else {

            System.out.println("invalid choice.");
        }

        input.close();
    }
}