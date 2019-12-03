package generics;

import net.mindview.util.*;
import net.mindview.util.FourTuple;
import net.mindview.util.ThreeTuple;
import net.mindview.util.TwoTuple;

import static net.mindview.util.Tuple.*;

public class TupleTest2 {

    static TwoTuple<String, Integer> f() { return new TwoTuple<>("hi", 47); }
    static TwoTuple<String, Integer> f2() { return tuple("hi", 47); }

//    static ThreeTuple<Amphibian, String, Integer> g() { return new ThreeTuple<>(new Amphibian(), "hi", 47);}
    static ThreeTuple<Amphibian, String, Integer> g() {
        return tuple(new Amphibian(), "hi", 47);
    }

//    static FourTuple<Vehicle, Amphibian, String, Integer> h() { return new FourTuple<>(new Vehicle(), new Amphibian(), "hi", 47); }
    static FourTuple<Vehicle, Amphibian, String, Integer> h() { return tuple(new Vehicle(), new Amphibian(), "hi", 47); }

//    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() { return new FiveTuple<>(new Vehicle(), new Amphibian(), "hi", 47, 11.1); }
    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() { return tuple(new Vehicle(), new Amphibian(), "hi", 47, 11.1); }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(f2());
//        ttsi.first = "there";   // Compile error :final
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}
