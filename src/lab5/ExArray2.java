package lab5;

import java.util.Scanner;

public class ExArray2 {

    //user input data to array


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x[] = new int[5];

        //for
        for (int i = 0; i < x.length; i++) {
            System.out.println("Enter an integer: ");
            x[i] = sc.nextInt();

        }

        //display data in array
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[4]);

        //for
        System.out.println("Data in arreay:");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        //foreach
        System.out.println("Data in array (foreach):");
        for (int val : x) {   // วนลูปอ่านค่าข้อมูลใน array ทีละตำแหน่งในตัวแปร val
            System.out.println(val);

        }
        showDataArray(x);
        showData(x);
        show (x);


    }//main

    private static void show(int[] x) {
        int total = 0;
        for (int val:x) {
            total += val;

        }
        System.out.println("the total value in array:"+total);
        System.out.println("The average value is:"+(total/x.length));
    }

    private static void showData(int[] x) {
        System.out.println("Data in array (foreach):");
        for (int val : x) {   // วนลูปอ่านค่าข้อมูลใน array ทีละตำแหน่งในตัวแปร val
            System.out.println(val);
        }
    }

    private static void showDataArray(int[] x) {
        System.out.println("Data in arreay:");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

    }//class
}



