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

class Main {
    public static void main(String[] args) {
        // How the Concret class and their SuperClasses are creating
        Hippo hippo = new Hippo();
        // Stack
        // Object() => Animal() => Hippo()
        /*
            Object Initing ....
            Animal Initing ...
            Hippo Initing ....
         */
    }
}