package lab8_2;

public class personApp {
    public static void main(String[] args) {


        //create objicts
        person P1 = new person("kasinee boontawe","1998");
        person P2 = new Sheriff( "janjira kenbut","1998","Thunghong");
        person P3 = new police("weda kare","1998","nakhorn");

        P1.introduce();
        P2.introduce();
        P3.introduce();



    }
}
