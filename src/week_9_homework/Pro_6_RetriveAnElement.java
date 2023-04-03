package week_9_homework;
/*Write a Java program to retrieve an element (at a specified index) from a given
array list*/

import java.util.ArrayList;

public class Pro_6_RetriveAnElement {
    ArrayList<String> listOfColour = new ArrayList<>();

    public static void main(String[] args) {
        Pro_6_RetriveAnElement programme = new Pro_6_RetriveAnElement();
        programme.addElement();
        System.out.println("==============print element by index 4 ===============================");
        programme.printElementByIndex(4);
        System.out.println("===================print all elements========================");
        programme.printElement();

    }

    public void addElement() {
        listOfColour.add("Red");
        listOfColour.add("Black");
        listOfColour.add("Blue");
        listOfColour.add("White");
        listOfColour.add("Yellow");
        listOfColour.add("Orange");
    }

    public void printElementByIndex(int index) {
        System.out.println(listOfColour.get(index));

    }

    public void printElement() {
        for (int i = 0; i < listOfColour.size(); i++) {

            System.out.println(listOfColour.get(i));


        }

    }
}
