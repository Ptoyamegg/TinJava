package util;

import java.io.*;
/**
 * @author PhotoYamEgg
 * @date 2019/9/8 - 16:49
 */
public class Hex {
    public static String format(byte[] data){
        StringBuilder result = new StringBuilder();
        int n = 0;
        for (byte b : data) {
            if (n % 16 == 0)
                result.append(String.format("%05X: ", n));
            result.append(String.format("%02X", b));
            n++;
            if (n % 16 == 0) result.append("\n");
        }
        result.append("\n");
        return result.toString();
    }

    public static void main(String[] args) throws Exception{
        if(args.length == 0)
            //  Test bu displaying this class file:
            System.out.println(
                    //format(BinaryFile.read)
            );
    }
}
