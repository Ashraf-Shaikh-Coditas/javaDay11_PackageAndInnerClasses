package Week3.Day11;

class OuterSIC {
    void show() {
        System.out.println("This is Outer's show() :: ");
    }

    static class Inner {
        void show() {
            System.out.println("This is Inner's show()  :: ");
        }
    }

}

public class StaticInnerClass {
    public static void main(String[] args) {
        OuterSIC outerSIC = new OuterSIC();

        OuterSIC.Inner inner = new OuterSIC.Inner();

        inner.show();
    }
}


/*

This is Inner's show()  ::

* */