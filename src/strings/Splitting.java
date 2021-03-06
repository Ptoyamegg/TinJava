package strings;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

import java.util.Arrays;

/**
 * @author PhotoYamEgg
 * @date 2019/9/8 - 17:08
 */
public class Splitting {
    public static String knights =
            "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring!";
    public static void split(String regex){
        System.out.println(
                Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        split(" ");     //  Doesn't have to contain regex chars
        split("\\W+");  //  Non-word characters
        split("n\\W+"); //  'n' followed by non-wor d characters
    }
}
