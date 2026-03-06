package Lab5;
import java.util.Scanner;
public class Student {
        // Method to input and return name
        String inputName(String name) {
            return name;
        }

        // Method to check average and pass/fail
        String average(int m1, int m2, int m3) {
            double avg = (m1 + m2 + m3) / 3.0;

            if (avg > 50) {
                return "Pass";
            } else {
                return "Fail";
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Student s = new Student();

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks of 3 exams: ");
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();

            System.out.println("Student Name: " + s.inputName(name));
            System.out.println("Result: " + s.average(m1, m2, m3));
        }
    }

