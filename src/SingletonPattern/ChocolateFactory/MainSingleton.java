package SingletonPattern.ChocolateFactory;

/**
 * Created by theo on 6/27/16.
 */
public class MainSingleton {

    public static void main(String args[]){
        ChocolateBoiler chocolateBoiler;

        chocolateBoiler=ChocolateBoiler.getChocolateBoiler();

        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();


    }
}
