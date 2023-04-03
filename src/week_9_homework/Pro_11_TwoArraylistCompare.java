package week_9_homework;
/*
Declare following two arrylist and compare it.
ArrayList<String> c1= new ArrayList<String>();
c1.add("Red");
c1.add("Green");
c1.add("Black");
c1.add("White");
c1.add("Pink");
ArrayList<String> c2= new ArrayList<String>();
c2.add("Red");
c2.add("Green");
c2.add("Black");
c2.add("Pink");
 */

import java.util.ArrayList;

public class Pro_11_TwoArraylistCompare {

    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");


        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        //System.out.println(c1.equals(c2));
        System.out.println("==============check in c1=====================");
        for (String colourName : c2) {

            System.out.println("loop : " + colourName);
            if (c1.contains(colourName)) {
                System.out.println("Yes, I am in C1: " + colourName);
            } else {
                System.out.println("No, I am not in C1: " + colourName);
            }
        }
        System.out.println("===============check in c2==========================");

        for (String colourName : c1) {

            System.out.println("loop : " + colourName);
            if (c2.contains(colourName)) {
                System.out.println("Yes, I am in C2: " + colourName);
            } else {
                System.out.println("No, I am not in C2: " + colourName);
            }
        }

    }
}










