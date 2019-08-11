class StaticSuper{
    public static String staticGet(){
        return "Base staticGet()";
    }
    public String dynamiGet(){
        return "Base dunamicGet()";
    }
}
class StaticSub extends StaticSuper{
    public static String staticGet(){
        return "Derived staticGet()";
    }
    public String dynamiGet(){
        return "Derived dunamicGet()";
    }
}
public class StaticPolymorphism {
    public static void main(String[] args){
        StaticSuper sup = new StaticSub();
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamiGet());
       // System.out.println(StaticSub.staticGet());
    }
}
