package week_9_homework;

/*
Write a Java program to reverse an array of integer values.

 */
public class Pro_3_ReverseArrayOfInteger {
    public static void main(String[] args) {
        int numbers[] = new int[]{10, 20, 30, 40, 50, 60};

        System.out.println("Original order :");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Reverse order :");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

    }

}
