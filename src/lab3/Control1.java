package lab3;

import java.util.Scanner;

public class Control1 {
    public static void main(String[] args) {
        //if -> เป็นคำสั่งที่เลือกทำเมื่อเงื่อไขเป็นจริงเท่านั้น
        //โครงสร้างคำสั่ง
        //          if (เงื่อนไข)
        //          คำสั่งของ if 0tme'kog,njvg'njvow-gxHo0ib'
        //          }

        int x = 10 ;
        if (x >=50) {
            System.out.println("Yes");
            System.out.println("Yes2");
        }
        System.out.println("Good bye.");

        Scanner sc =new Scanner(System.in);
        System.out.println("How old are you? :");
        int age =sc.nextInt();
        if (age > 60){
            System.out.println("You are old (คุณแก่แล้ว).");
        }







    }//main
}//class
