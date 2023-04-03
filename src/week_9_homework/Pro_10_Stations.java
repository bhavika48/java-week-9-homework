package week_9_homework;
/*Write a programme that tells you which line passes through particular stations.
Just use Zone 1 stations name.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Pro_10_Stations {
    public static void main(String[] args) {
        Pro_10_Stations obj = new Pro_10_Stations();
        obj.findStation();

    }

    public void findStation() {
        ArrayList<String> listOfStation = new ArrayList();
        listOfStation.add("Angel");
        listOfStation.add("Borough");
        listOfStation.add("Green Park");

        ArrayList<String> listOfLine = new ArrayList<>();
        listOfLine.add(" Victoria");
        listOfLine.add(" Bakerloo");
        listOfLine.add("Central");
        listOfLine.add("Jubilee ");
        listOfLine.add("Piccadilly");
        listOfLine.add("Northern");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Select station from zone 1 check which tube passes through the station : ");
        System.out.println("select 1 for Angel, 2 for Borough and 3 for Green Park :  ");
        int station1 = scanner.nextInt();

        for (String e : listOfStation) {
            if (station1 == 1) {
                System.out.println("Tubes passes through " + listOfStation.get(0));
                System.out.println(listOfLine.get(0));
                System.out.println(listOfLine.get(1));
                System.out.println(listOfLine.get(2));
                break;
            } else if (station1 == 2) {
                System.out.println("Tube passes through " + listOfStation.get(1));
                System.out.println(listOfLine.get(4));
                System.out.println(listOfLine.get(5));
                break;
            } else if (station1 == 3) {
                System.out.println("Tube passes" + listOfStation.get(2));
                System.out.println(listOfLine.get(0));
                System.out.println(listOfLine.get(3));
                System.out.println(listOfLine.get(4));
                break;
            } else {
                System.out.println("select valid station from list");
                break;
            }
        }
        scanner.close();
    }
}

