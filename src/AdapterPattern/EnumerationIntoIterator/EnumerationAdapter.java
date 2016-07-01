package AdapterPattern.EnumerationIntoIterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by theo on 7/1/16.
 */
public class EnumerationAdapter implements Iterator{

    private Enumeration enumeration= new EnumerationIterator();


    public EnumerationAdapter(Enumeration enumerationAdapter){
        this.enumeration=enumerationAdapter;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
