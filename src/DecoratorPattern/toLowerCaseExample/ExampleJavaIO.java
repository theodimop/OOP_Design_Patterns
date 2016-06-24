package DecoratorPattern.toLowerCaseExample;

import java.io.*;

/**
 * Created by theo on 6/16/16.
 */
public class ExampleJavaIO {

    public ExampleJavaIO(){
        try {
            start();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void start() throws IOException {

        //DECORATE THE FILEINPUTSTREAM object...

        /*Use Javas Packages*/
        FileInputStream fileInputStream= new FileInputStream("src/DecoratorPattern/toLowerCaseExample/file.txt");//Extends InputStream
        // @params InputStream
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);//Extends FilterInputStream
        DataInputStream dataInputStream=new DataInputStream(bufferedInputStream);

        int c;
        StringBuilder stringBuilder=new StringBuilder();

        while((c=dataInputStream.read())>-1){
            stringBuilder.append((char)c);
            System.out.print(Integer.toBinaryString(c)+" ");
            System.out.print(Integer.toHexString(c)+" ");
            System.out.print((char)c+" ");
            System.out.print(c+" \n" );
        }




        /*------------------------------------------------------*/

        FilterInputStream inputStream =
                new LowerCaseInputStream(
                        new BufferedInputStream(
                                new FileInputStream("src/DecoratorPattern/toLowerCaseExample/file.txt")));
        //reset...
        stringBuilder.setLength(0);


        while((c=inputStream.read())>-1){
            stringBuilder.append((char)c);
        }

        System.out.println(stringBuilder.toString());

    }
}
