package homework.animals;

import homework.AnimalInterface;

public class Cat extends Animal implements AnimalInterface {
    int speed;

    public Cat() {
    }

    public Cat(String name, int age, double weight, int speed) {
        super(name, age, weight);
        this.speed = speed;
    }

    public void eat(Mouse mouse) {
        System.out.println("Eat mouse - ");
        super.setWeight(super.getWeight() + mouse.getWeight());
    }

    @Override
    public int run() {
        return speed;
    }

    @Override
    public String makeSound() {
        return "Meow Meow";
    }

    @Override
    public String toString() {
        return (super.toString()+makeSound());
    }
}
