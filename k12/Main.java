import java.util.*;

public final class A extends Y {
    public void a() {
        System.out.println("Aa");
    }
     public void b() {
        System.out.println("Ab");
    }
     public void c() {
        System.out.println("Ac");
    }
}

public class B extends Y {
     public void a() {
        System.out.println("Ba");
    }
     public void b() {
        System.out.println("Bb");
    }
     public void c() {
        System.out.println("Bc");
    }
}

public interface X { void a(); }

public abstract class Y implements X {
    public abstract void a();
    public abstract void b();
}


public class Main {
    public static void main(String[] args) {
        Y [] arr = {new A(), new B()};
        for (Y yy: arr) {
            yy.b();
        }
    }

}