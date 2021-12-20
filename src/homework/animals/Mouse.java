package homework.animals;

import homework.AnimalInterface;

public class Mouse extends Animal implements AnimalInterface {
    int speed;

    public Mouse() {
    }

    public Mouse(String name, int age, double weight, int speed) {
        super(name, age, weight);
        this.speed = speed;
    }

    public void eatCheese() {
        System.out.println("Eat cheese");
        super.setWeight(super.getWeight() + 5);
    }

    @Override
    public int run() {
        return this.speed;
    }

    @Override
    public String makeSound() {
        return "Chit chit";
    }

    @Override
    public String toString() {
        return (super.toString()+makeSound());
    }
}
