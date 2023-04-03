package week_9_homework;
/* Write a Java program to test if an array list is empty or not.*/

import java.util.ArrayList;

public class Pro_7_ArrayListIsEmpty {
    ArrayList<String> boxOfFruit = new ArrayList<>();

    public void addFruitInBox() {
        boxOfFruit.add("Apple");
        boxOfFruit.add("Banana");
        boxOfFruit.add("Kiwi");
        boxOfFruit.add("Grapes");
        boxOfFruit.add("Blue Berry");
        boxOfFruit.add("Orange");
    }

    public static void main(String[] args) {
        Pro_7_ArrayListIsEmpty programme = new Pro_7_ArrayListIsEmpty();
        // programme.addFruitInBox();
        if (programme.isBoxEmpty()) {
            System.out.println("Fruit box is empty");
        } else {
            System.out.println("Fruit box is not empty");
        }

    }

    public boolean isBoxEmpty() {
        boolean result;
        // using isEmpty method to identify an array list is empty or not
        result = boxOfFruit.isEmpty();
        return result;
    }
}
