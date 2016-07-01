package AdapterPattern.EnumerationIntoIterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by theo on 7/1/16.
 */
public class MainEnumeratorAdapter {

    public static void main(String args[]){

        Enumeration enumeration= new EnumerationIterator();
        Iterator enumerationAdapter= new EnumerationAdapter(enumeration);
        enumerationAdapter.hasNext();
        enumerationAdapter.next();
        //Throws an Unsopported Operation Exception!
        enumerationAdapter.remove();
    }
}
