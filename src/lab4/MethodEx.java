package lab4;

public class MethodEx {
    //1. No return No parameter : คือ เมธอดที่ไม่มีการรับค่าพารามิเตอร์ และไม่คืนค่าใด
    //และไม่คืนค่าใดกลับหลังจาก process แล้ว
    //2. No return 1 or more parameter : คือ เมธอดที่มีการรับพารามิเตอร์ตั้งแต่ 1 หรือมากกว่า
    //และไม่คืนค่าใดกลับหลังจาก process แล้ว
    //3. Return 1 value, 1 or more parameter : คือ เมธอดที่มีการรับพารามิเตอร์ตั้งแต่ 1 หรือมากกว่า
    //และมีการคืนค่ากลับไปยังส่วนที่เรียกใช้งาน (เรียกใช้จากที่ไหน   คืนค่าไปที่นั่น )
    public static void main(String[] args) {
        System.out.print("Hello from Main ().");
        //calling method A()
        A();
        A();
        A();
        //calling method B()
        B("MIT","RUTS");
        //calling method C()
        //1. ประกาศตัวแปรชนิดเดียวกันมาเก็บค่าที่เมธอดส่งกลับมาให้
        int summation = C(10,20);
        System.out.print("The summation of x and y : "+summation);
        //2. เรียกใช้เมธอดโดยไม่ประกาศตัวแปรใดๆ มาเก็บค่าที่ส่งกลับมา
        System.out.print("The summation of x and y (2): " +C(50,50));
    }//main

    public static void A(){
        System.out.print("Hello from A().");

    }//A
    public static void  B(String msg,String msg2){
        System.out.print("Hello from B ().");
        System.out.print("Message: "+msg);
        System.out.print("Message2: "+msg2);
    }//B

    public static int C (int x, int y){
        System.out.print("Hello from C ().");
        int sum = x + y ;
        return sum;

    }



}//class
