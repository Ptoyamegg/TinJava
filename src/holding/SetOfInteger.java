package holding;

import java.util.*;

public class SetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(47);
        Set<Integer> integerSet = new HashSet<Integer>();   //  Why HashSet like TreeSet ?
        for (int i = 0; i < 10000; i++)
            integerSet.add(random.nextInt(30));
        System.out.println(integerSet);
    }
}
