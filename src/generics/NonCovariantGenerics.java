package generics;
//  {CompileTimeError}  (Won't compile)

import java.util.ArrayList;
import java.util.List;

public class NonCovariantGenerics {
    //  Compile Error: incompatible types:
//    List<Fruit> fruits = new ArrayList<Apple>();
}
