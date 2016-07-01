package SingletonPattern.ChocolateFactory;

/**
 * Created by theo on 6/25/16.
 */
/*Different ways to make the singleton thread Safe
* 1
* 2
* 3 Used here
* */
public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;
    /*2 create only one instance here*/
    private/*3*/ volatile static ChocolateBoiler uniqueChocolateBoiler ;/*=2 new ChocolateBoiler();*/

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled())
            boiled = true;
    }


    public static /*1 synchronized*/ ChocolateBoiler getChocolateBoiler() {
      /*1  if (uniqueChocolateBoiler == null)
            uniqueChocolateBoiler=new ChocolateBoiler();*/
        /*3
        * Drastically reduces the overhead*/
        if (uniqueChocolateBoiler == null) {
            synchronized (ChocolateBoiler.class) {
                if (uniqueChocolateBoiler == null) {
                    uniqueChocolateBoiler = new ChocolateBoiler();
                }
            }
        }
        return uniqueChocolateBoiler;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
