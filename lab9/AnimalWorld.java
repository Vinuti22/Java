class Animal {
    String name; // [cite: 69]
    Animal(String name) { // [cite: 70]
        this.name = name; // [cite: 71]
    }
    void sound() { // [cite: 73]
        System.out.println("This animal makes a sound."); // [cite: 74]
    }
}

class Dog extends Animal { // [cite: 77]
    Dog(String name) { super(name); } // [cite: 79]
    @Override
    void sound() { // [cite: 82]
        System.out.println(name + " says: Woof Woof!"); // [cite: 83]
    }
}

class Cat extends Animal { // [cite: 86]
    Cat(String name) { super(name); } // [cite: 88]
    @Override
    void sound() { // [cite: 91]
        System.out.println(name + " says: Meow!"); // [cite: 92]
    }
}

public class AnimalWorld {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy"); // [cite: 97]
        Cat cat = new Cat("Whiskers"); // [cite: 98]
        dog.sound(); // [cite: 99]
        cat.sound(); // [cite: 100]
    }
}