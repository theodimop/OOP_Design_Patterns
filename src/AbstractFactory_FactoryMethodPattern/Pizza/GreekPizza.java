package AbstractFactory_FactoryMethodPattern.Pizza;

/**
 * Created by theo on 6/22/16.
 */
@Deprecated
public class GreekPizza extends Pizza {

        public GreekPizza(){
            name="Greek";;
        }

        @Override
        public double cost() {
            return 5.99;
        }

        @Override
        void prepare() {

        }
}

