package innerclasses;

abstract class Base{
    public Base(int i){
        System.out.println("Base constructor. i = " + i);
    }
    public abstract void f();
}

public class AnonymousConstructor {
    public static Base getBase(int i){
        return new Base(i) {
            { System.out.println("Inside instance initializer"); }  //实例初始化
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }
    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
