package Week3.Day11.Dependent;

import Week3.Day11.Independent.Address;

public class Student {
    int id;
    private String name;
    Address address;

    public Student(int id, String name, Address address) {

        this.id = id;
        this.name = name;
        this.address = address;
    }

    void show() {
        System.out.println("This is Student's show()");
    }

}

class Main {
    public static void main(String[] args) {
        Address address = new Address("Aashiyana",14,"Varkhedi","Pachora",
                "Maharashtra","India");

        Student student = new Student(1,"Ashraf",address);

        Address address1 = student.address;

//        address1.display();   // Case : Private ::
//        If our method is private we can't access it from anywhere outside the class
//
//
//        address1.display();     // Case : Public ::
//        We can happily access public method anywhere.
//
//
//        address1.display();     // Case : Default ::
//        We cannot access default method in other packages.


//        address1.display();     // Case : Protected ::
//        We can access protected member only if there is parent child relationship between classes.

//        ********************************************************************************************************
//        student.show();  // Case : Public ::
//        We can happily access public method anywhere.

//        student.show();    // Case : Private ::
//        If our method is private we can't access it from anywhere outside the class

//        student.show();      // Case : Protected ::
//        We can access protected member only if there is parent child relationship between classes.

//        student.show();   // Case : Default ::
//        We can access default method in same package outside the defining class.


    }
}
