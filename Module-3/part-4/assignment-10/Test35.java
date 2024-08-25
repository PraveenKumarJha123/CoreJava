class Test35 {

    public static void main(String args[]) {
        B r1 = new B();  // Create an object of class B
        B r2 = new B();  // Create another object of class B

        r1.x = 99;       // Set x of r1 to 99
        r2.x = 88;       // Set x of r2 to 88

        r1.show();       // Call show method on r1
        r2.show();       // Call show method on r2
    }
}

class A {
    int x;   // Instance variable x in class A
}

class B extends A {

    void show() {
        System.out.println(super.x);  // Print x from superclass A
    }
}
