package lab3;

import java.util.Scanner;

public class ExerciseLab3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter an number 1:");
        double num1 = sc.nextDouble();
        System.out.println("Enter an number 2: ");
        double num2 =sc.nextDouble();

        if (num1>num2){
            System.out.println("more than"+num2);
        }else {
            System.out.println("less than"+num2);
        }



    }//main
}//class
