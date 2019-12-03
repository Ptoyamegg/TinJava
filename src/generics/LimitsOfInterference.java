package generics;

import net.mindview.util.*;
import typeinfo.pets.Person;
import typeinfo.pets.Pet;

import java.util.List;
import java.util.Map;

public class LimitsOfInterference {
    static void f(Map<Person, List<? extends Pet>> petPeople) {}

    public static void main(String[] args) {
        f(New.map());// 可以识别。。。
    }
}
