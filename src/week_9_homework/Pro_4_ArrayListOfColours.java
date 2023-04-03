package week_9_homework;
/*Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.*/

import java.util.ArrayList;

public class Pro_4_ArrayListOfColours {
    ArrayList<String> list = new ArrayList<>();
    public void addColours() {
        list.add("Pink");
        list.add("White");
        list.add("Yellow");
        list.add("Blue");
        list.add("Black");
        list.add("Orange");

    }
    public static void main(String[] args) {
        Pro_4_ArrayListOfColours programme = new Pro_4_ArrayListOfColours();
        programme.addColours();
        programme.printListOfColour();
    }

    public void printListOfColour() {
        for (String e : list) {
            System.out.println(e);
        }
    }
}
