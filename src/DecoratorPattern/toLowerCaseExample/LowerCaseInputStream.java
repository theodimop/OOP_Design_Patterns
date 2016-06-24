package DecoratorPattern.toLowerCaseExample;

import java.io.*;

/**
 * Created by theo on 6/16/16.
 */
public
class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException{
        int c=super.read();
        return
                (c== -1 ? c : Character.toLowerCase( c));
    }

}
