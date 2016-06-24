package DecoratorFactory.CafeExample;

public class BeverageFactory {

    public static void decorateBeverage(Beverage beverage,Beverage.Size s){
          beverage.setSize(s);
          beverage.description+= getSizeDescription(s);
      }

    private static String getSizeDescription(Beverage.Size s) {
        if(s== Beverage.Size.BIG)
            return "BIG";
        else
            if(s== Beverage.Size.NORMAL)
                return "NORMAL";
        else
                return "SMALL";
    }

}
