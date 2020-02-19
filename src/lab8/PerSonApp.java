package lab8;

public class PerSonApp {

    public static void main(String[] args) {
        //create object
        Student std1 = new Student("1236548596325",
                "kasinee Boontawe",
                "361211760023",
                "Information Tecgnology");
        Person p1 = new Person("1623021222352",
                "Janjira Kanbut");

        System.out.println(std1.getName());
        System.out.println(p1.getName());

        System.out.println(std1.toString());
        System.out.println(p1.toString());





    }
}
