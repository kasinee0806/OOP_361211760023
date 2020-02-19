package lab8;

public class Triansle extends GraphicObject {
    private  double bese;
    private  double hight;

    @Override
    public void findArea() {
        double area = 0.5  * bese * hight;
        System.out.println("The area of Triansle :"+area);
    }

    public double getBese() {
        return bese;
    }

    public void setBese(double bese) {
        this.bese = bese;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }
}
