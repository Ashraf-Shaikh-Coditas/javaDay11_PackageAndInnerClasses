package Week3.Day11;

class OuterMIC {

    void show() {
        class Inner {
            void show() {
                System.out.println("Inner class's show :");
            }

        }

        Inner i = new Inner();
        i.show();
    }
}

public class MethodInnerClass {
    public static void main(String[] args) {
        OuterMIC outerMIC = new OuterMIC();
        outerMIC.show();
    }
}


/*

Inner class's show :


* */