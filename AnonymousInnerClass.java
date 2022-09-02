package Week3.Day11;

class OuterAIC {
    public void show() {
        System.out.println("This is show() from outer class .");
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        OuterAIC obj1 = new OuterAIC() {
            @Override
            public void show() {
                super.show();
                System.out.println("This is show() from anonymous inner class");
            }
        };

        obj1.show();
    }
}

/*

This is show() from outer class .
This is show() from anonymous inner class


* */
