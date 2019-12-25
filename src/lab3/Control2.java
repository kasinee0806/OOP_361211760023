package lab3;

import java.util.Scanner;

public class Control2 {
    public static void main(String[] args) {
         //if-else -> เป็นคำสั่งที่เลือกทำอย่างใดอย่างหนึ่ง
        //โครงสร้างคำสั่ง
        //  if (เงื่อนไข) {
        //  คำสั่งของ if เมื่อคำสั่งเป็นจริง;
        //  } else{
        //  คำสั่ง if เมื่อคำสั่งเป็นเท็จ;
        //  }

        Scanner sc =new Scanner(System.in);
        System.out.println("How old are you? :");
        int age =sc.nextInt();

        if (age > 60){
            System.out.println("You are old (คุณแก่แล้ว).");
        }else {
            System.out.println("You are not old yet. (คุณยังไม่แก่)");
        }


    }
}
