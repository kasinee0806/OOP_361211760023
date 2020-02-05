package lab7;

import java.util.*;

public class NoteBookApp {
    public static void main(String[] args) {

        List<NoteBook> myList = new ArrayList<NoteBook>();
        System.out.println(myList);
        myList = addNoteBook (myList);

        System.out.println(myList);


        myList = addNoteBook (myList);

        System.out.println(myList);



    }//main

    private static List<NoteBook> addNoteBook(List<NoteBook> myList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brand:");
        String brand = sc.nextLine();
        System.out.println("Enter Model");
        String model = sc.nextLine();
        System.out.println("Enter cpu:");
        String cpu = sc.nextLine();
        System.out.println("Enter GPU:");
        String GPU = sc.nextLine();
        System.out.println("Enter ram:");
        String ram = sc.nextLine();
        System.out.println("Enter display:");
        String display = sc.nextLine();
        System.out.println("Enter HDD:");
        String HDD =sc.nextLine();
        System.out.println("Enter os:");
        String os = sc.nextLine();
        System.out.println("Enter price:");
        Double price = sc.nextDouble();

        //create object
        NoteBook np = new NoteBook(brand,model,cpu,GPU,ram,display,HDD,os,price);
        // ad object into List
        myList.add(np);

        return  myList;
    }
}//class
