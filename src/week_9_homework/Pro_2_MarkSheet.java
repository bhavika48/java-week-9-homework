package week_9_homework;
/*Rewrite the student mark sheet programme (From java-homework-week3
programmes) using if else and while loop.*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Pro_2_MarkSheet {
    public static void main(String[] args) {
        // scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Student Name   \t \t:\t");
        String name = scanner.next();
        System.out.print("Enter Student Roll Number \t \t:\t");
        int rollNum = scanner.nextInt();

        List<String> subjectList = new ArrayList<>();
        subjectList.add("Maths");
        subjectList.add("Science");
        subjectList.add("English");

        List<Integer> marksList = new ArrayList<>();

        Iterator<String> iterator = subjectList.iterator();
        while (iterator.hasNext()) {
            System.out.print("Enter Marks of Subject " + iterator.next() + " \t:\t");
            int subjectMarks = scanner.nextInt();
            if (subjectMarks < 0 || subjectMarks > 100) {
                System.out.print("\nInvalid input, Marks should between 0 to 100");
                System.out.print("\nPlease enter correct marks\t\t:\t");
                subjectMarks = scanner.nextInt();
            }
            marksList.add(subjectMarks);
        }

        int total = sum(marksList.get(0), marksList.get(1), marksList.get(2));
        int percentage = (total * 100) / 300;
        String result = calculateResult(marksList.get(0), marksList.get(1), marksList.get(2));
        ;
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNum, marksList.get(0), marksList.get(1), marksList.get(2), total, percentage, result, grade);
        //Closing the scanner object
        scanner.close();
    }

    //calculating the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Calculating the results on subjects marks
    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    // Calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        } else {
            grade = "-";
        }
        return grade;
    }

    // Printing the Marks sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks,
                                         int englishMarks, double total, double percentage, String result,
                                         String grade) {
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");
    }
}
