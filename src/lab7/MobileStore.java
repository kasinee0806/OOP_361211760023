package lab7;

public class MobileStore {
    public static void main(String[] args) {
         Mobile Mobile1 =  new Mobile () ;

         Mobile1.setId("1001");
         Mobile1.setBrand("Wiko");
         Mobile1.setGeneration("Sunny 4 Plus");
         Mobile1.setPrice(2090);
         Mobile1.setOperation("Android 9 Go");

         System.out.println(Mobile1.getId());
         System.out.println(Mobile1.getBrand());
         System.out.println(Mobile1.getGeneration());
         System.out.println(Mobile1.getPrice());
         System.out.println(Mobile1.getOperation());

         Mobile Mobile2 = new Mobile ("2002","Apple","iPhone11pro",35900,"iOS13" );
    }
}
