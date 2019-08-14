package exceptions;

import java.io.*;

/**
 * @author PhotoYamEgg
 * @date 2019/8/14 - 22:09
 */
public class MainException {
    //  Pass all exceptions to the console:
    public static void main(String[] args) throws Exception{
        //  Open the file:
        FileInputStream file =
                new FileInputStream("MainException.java");
        //  Use the file ...
        //  Close the file:
        file.close();
    }
}
