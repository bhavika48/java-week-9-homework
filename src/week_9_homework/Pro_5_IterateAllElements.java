package week_9_homework;
/* Write a Java program to iterate through all elements in an array list using
Iterater.
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Pro_5_IterateAllElements {
    ArrayList<String> boxOfColours = new ArrayList<>();

    public void addColours() {
        boxOfColours.add("Pink");
        boxOfColours.add("White");
        boxOfColours.add("Yellow");
        boxOfColours.add("Blue");
        boxOfColours.add("Black");
        boxOfColours.add("Orange");

    }

    public void printColourUsingForEach() {
        System.out.println("============printColourUsingForEach============================");
        for (String e : boxOfColours) {
            System.out.println(e);
        }
    }

    public void printColourUsingIterator() {
        System.out.println("========printColourUsingIterator========================");
        Iterator<String> iterator = boxOfColours.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        Pro_5_IterateAllElements programme = new Pro_5_IterateAllElements();
        programme.addColours();
        programme.printColourUsingIterator();
        System.out.println();
    }
}
