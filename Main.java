class Object {
    public Object () {
        System.out.println("Object Initing ....");
    }
}

class Animal extends Object {
    public Animal() {
        System.out.println("Animal Initing ...");
    }
}

class Hippo extends Animal {
    public Hippo() {
        System.out.println("Hippo Initing ....");
    }
}

// =============

class Animal2 {
    public Animal2() {
        System.out.println("Animal2 Initing ....");
    }
}

class Duck extends Animal2 {
    int size;

    public Duck(int size) {
        super(); // If we don't provide the Compiler will add one (default) for us
        this.size = size;
        System.out.println("Duck Initing ....");
    }
}

class Main {
    public static void main(String[] args) {
        // How the Concret class and their SuperClasses are creating
//        Hippo hippo = new Hippo();
        // Stack
        // Object() => Animal() => Hippo()
        /*
            Object Initing ....
            Animal Initing ...
            Hippo Initing ....
         */

        // ==========

        Duck duck = new Duck(23);
    }
}