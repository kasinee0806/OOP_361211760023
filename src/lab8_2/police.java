package lab8_2;

public class police extends person{
    private String WorkCounTry;

    public police(String name, String dateOfBirth,String workCounTry) {
        super(name, dateOfBirth);
        this.WorkCounTry = workCounTry;
    }
    public void inteoduce(){
        super.introduce();
        System.out.println("I work at"+this.WorkCounTry);
    }
    //getter and setter

    public String getWorkCounTry() {
        return WorkCounTry;
    }

    public void setWorkCounTry(String workCounTry) {
        WorkCounTry = workCounTry;
    }

    //toString

    @Override
    public String toString() {
        return "police{" +
                "WorkCounTry='" + WorkCounTry + '\'' +
                "} " + super.toString();
    }
}
