package homework.animals;

import homework.AnimalInterface;

public class Dog extends Animal implements AnimalInterface {
    int speed;

    public Dog() {
    }

    public Dog(String name,int age, double weight, int speed) {
        super(name, age, weight);
        this.speed = speed;
    }

    @Override
    public int run() {
        return speed;
    }

    @Override
    public String makeSound() {
        return "Gâu gâu";
    }

    @Override
    public String toString() {
        return (super.toString()+makeSound());
    }
}
