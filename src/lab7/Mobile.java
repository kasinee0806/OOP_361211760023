package lab7;

public class Mobile {

    private String id;
    private String brand;
    private String generation;
    private int price;
    private String operation;

    public Mobile () {}

    public Mobile (String id, String brand, String generation,int price,String operation){
        this.id = id;
        this.brand = brand;
        this.generation = generation;
        this.price = price;
        this.operation = operation;
    }
    public void id (){
        System.out.println(id);
    }
    public void brand (){
        System.out.println(brand);
    }
    public  void generation (){
        System.out.println(generation);
    }
    public void price () {
        System.out.println(price);
    }
    public void operation () {
        System.out.println(operation);
    }

    public String  getId(){
        return  this.id;
    }
    public  void  setId(String id){
        this.id = id;
    }
    public String  getBrand(){
        return  this.brand;
    }
    public  void  setBrand(String brand){
        this.brand = brand;
    }
    public String  getGeneration(){
        return  this.generation;
    }
    public  void  setGeneration(String generation){
        this.generation = generation;
    }
    public int  getPrice(){
        return  this.price;
    }
    public  void  setPrice(int price){
        this.price = price;
    }
    public String  getOperation(){
        return  this.operation;
    }
    public  void  setOperation(String operation){
        this.id = operation;
    }
}

