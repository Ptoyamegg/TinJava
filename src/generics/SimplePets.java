package generics;

import net.mindview.util.New;
import typeinfo.pets.*;
import java.util.*;

public class SimplePets {
    public static void main(String[] args) {
        Map<Person, List<? extends Pet>> petPeople = New.map();
        //  Rest of the code is the same...
    }
}
