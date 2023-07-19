// Abstract class Animal
abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// Mammal class
class Mammal extends Animal {
    private String habitat;

    public Mammal(String name, int age, String habitat) {
        super(name, age);
        this.habitat = habitat;
    }

    public void displayHabitat() {
        System.out.println("Habitat: " + habitat);
    }

    @Override
    public void makeSound() {
        System.out.println("Mammal sound");
    }
}

// Bird class
class Bird extends Animal {
    private double wingspan;

    public Bird(String name, int age, double wingspan) {
        super(name, age);
        this.wingspan = wingspan;
    }

    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird sound");
    }
}

// Reptile class
class Reptile extends Animal {
    private double length;

    public Reptile(String name, int age, double length) {
        super(name, age);
        this.length = length;
    }

    public void crawl() {
        System.out.println("Crawling");
    }

    @Override
    public void makeSound() {
        System.out.println("Reptile sound");
    }
}

// Additional Mammal subclass
class Dog extends Mammal {
    private String breed;

    public Dog(String name, int age, String habitat, String breed) {
        super(name, age, habitat);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Barking");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog sound");
    }
}

// Additional Mammal subclass
class Elephant extends Mammal {
    private double tuskLength;

    public Elephant(String name, int age, String habitat, double tuskLength) {
        super(name, age, habitat);
        this.tuskLength = tuskLength;
    }

    public void trumpet() {
        System.out.println("Trumpeting");
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant sound");
    }
}

// Additional Bird subclass
class Eagle extends Bird {
    private String prey;

    public Eagle(String name, int age, double wingspan, String prey) {
        super(name, age, wingspan);
        this.prey = prey;
    }

    public void hunt() {
        System.out.println("Hunting");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle sound");
    }
}

// Additional Bird subclass
class Penguin extends Bird {
    private double swimmingSpeed;

    public Penguin(String name, int age, double wingspan, double swimmingSpeed) {
        super(name, age, wingspan);
        this.swimmingSpeed = swimmingSpeed;
    }

    public void swim() {
        System.out.println("Swimming");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin sound");
    }
}

// Additional Reptile subclass
class Snake extends Reptile {
    private boolean venomous;

    public Snake(String name, int age, double length, boolean venomous) {
        super(name, age, length);
        this.venomous = venomous;
    }

    public void bite() {
        System.out.println("Biting");
    }

    @Override
    public void makeSound() {
        System.out.println("Snake sound");
    }
}

// Additional Reptile subclass
class Turtle extends Reptile {
    private String shellPattern;

    public Turtle(String name, int age, double length, String shellPattern) {
        super(name, age, length);
        this.shellPattern = shellPattern;
    }

    public void hideHead() {
        System.out.println("Hiding head");
    }

    @Override
    public void makeSound() {
        System.out.println("Turtle sound");
    }
}

public class Zoo {
    public static void main(String[] args) {
        // Create objects of different animal subclasses
        Mammal mammal1 = new Dog("Buddy", 3, "Land", "Bulldog");
        Mammal mammal2 = new Elephant("Dumbo", 10, "Land", 2.5);
        Bird bird1 = new Eagle("Thunder", 5, 2.0, "Rabbit");
        Bird bird2 = new Penguin("Waddles", 2, 0.5, 1.2);
        Reptile reptile1 = new Snake("Slither", 4, 1.8, true);
        Reptile reptile2 = new Turtle("Shelly", 7, 0.3, "Diamond");

        // Demonstrate polymorphism by invoking makeSound()
        Animal[] animals = {mammal1, mammal2, bird1, bird2, reptile1, reptile2};
        for (Animal animal : animals) {
            animal.makeSound();
        }

        // Access and modify attributes using getter and setter methods
        mammal1.setName("Buddy Jr.");
        mammal1.setAge(4);
        System.out.println("Name: " + mammal1.getName());
        System.out.println("Age: " + mammal1.getAge());

        // Demonstrate additional behaviors
        ((Mammal) mammal1).displayHabitat();
        ((Bird) bird1).fly();
        ((Reptile) reptile1).crawl();
        ((Dog) mammal1).bark();
        ((Elephant) mammal2).trumpet();
        ((Eagle) bird1).hunt();
        ((Penguin) bird2).swim();
        ((Snake) reptile1).bite();
        ((Turtle) reptile2).hideHead();
    }
}
