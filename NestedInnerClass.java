package Week3.Day11;

class OuterNIC {

    private int id;

    private final String name  = "Ashraf";

    static int roll ;

    void show() {
        System.out.println("This is show from Outer class.");
        id = 2;
        System.out.println("Name :: "+name);
        roll++;
    }

    class InnerNIC {
        void show() {
            System.out.println("This is show from Inner class.");
            System.out.println("ID :: "+id);
            System.out.println("Name :: "+name);
            System.out.println("Roll :: "+roll);

        }
    }

}

public class NestedInnerClass {
    public static void main(String[] args) {
        OuterNIC outerNIC = new OuterNIC();
        outerNIC.show();

        System.out.println();

        OuterNIC.InnerNIC innerNIC = outerNIC.new InnerNIC();
        innerNIC.show();

    }
}


/*

This is show from Outer class.
Name :: Ashraf

This is show from Inner class.
ID :: 2
Name :: Ashraf
Roll :: 1


* */