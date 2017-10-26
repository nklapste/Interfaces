package testInterfaces;

public class TestClassRelations {
    public static void main(String[] args) {
        // all okay
        X x1 = new U();
        G g1 = new U();
        X x2 = new B();
        U u1 = new Z();


        // all fail
//        U u2 = new B();
//        X x3 = new G();
//        B b1 = new U();
//        Z z1 = new U();
//        G g2 = X.class;
        // x = b therefore g = x should be the same as g = b
        // which should fail (which it does)
//          G g3 = new B();

    }
}
