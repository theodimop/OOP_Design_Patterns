package AdapterPattern.EnumerationIntoIterator;

import java.util.Enumeration;

/**
 * Created by theo on 7/1/16.
 */
public class EnumerationIterator implements Enumeration {

    @Override
    public boolean hasMoreElements() {
        return false;
    }

    @Override
    public Object nextElement() {
        return null;
    }
}
