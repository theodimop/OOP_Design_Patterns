package DecoratorPattern.CafeExample;

/**
 * Created by theo on 6/16/16.
 */
public abstract class Beverage {


    public enum Size{
        BIG,NORMAL,SMALL
    }

    public String description="a beverage";
    private Size size=Size.NORMAL;


    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void setSize(Size s){
        size=s;
    }

    public Size getSize(){
        return size;
    }

    public double getSizeCost(){
        switch (getSize()){
            case BIG:
                return 0.2;
            case SMALL:
                return -0.2;
            //Default is Normal
            default:
                return 0.0;
        }
    }
}
