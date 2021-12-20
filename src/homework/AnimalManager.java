package homework;

import com.sun.javafx.iio.gif.GIFImageLoaderFactory;
import homework.animals.Animal;
import homework.animals.Cat;
import homework.animals.Dog;
import homework.animals.Mouse;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnimalManager {
    Map<String, Animal> animalMap = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    public Animal creatAnimal() {
        int choice;
        Animal animal = null;
        String name;
        int age;
        double weight;
        int speed;
        do {
            System.out.println("Select animal to create: ");
            System.out.println("1. Normal animal");
            System.out.println("2. Dog");
            System.out.println("3. Cat");
            System.out.println("4. Mouse");

            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("Animal name: ");
            name = sc.nextLine();
            System.out.println("Animal age: ");
            age = sc.nextInt();
            System.out.println("Animal weight: ");
            weight = sc.nextDouble();
            switch (choice) {
                case 1:
                    animal = new Animal(name, age, weight);
//                    animalMap.put(name, animal);
                    break;
                case 2:
                    System.out.println("Dog speed: ");
                    speed = sc.nextInt();
                    animal = new Dog(name, age, weight, speed);
                    break;
                case 3:
                    System.out.println("Cat speed: ");
                    speed = sc.nextInt();
                    animal = new Cat(name, age, weight, speed);
                    break;
                case 4:
                    System.out.println("Mouse speed: ");
                    speed = sc.nextInt();
                    animal = new Mouse(name, age, weight, speed);
                    break;
                case 0:
                    break;
            }
        } while (choice == 0);
        return animal;
    }

    public void addAnimal() {
        Animal animal = creatAnimal();
        if (animalMap.containsKey(animal.getName())) {
            System.out.println("Already exist on this list");
        } else {
            animalMap.put(animal.getName(), animal);
        }
    }

    public void deleteAnimal(String name) {
        if (animalMap.containsKey(name)) {
            animalMap.remove(name);
        } else {
            System.out.println(name + " doesn't exist on this list");
        }
    }

    public void editAnimal(String name) {
        if (animalMap.containsKey(name)) {
            Animal animal = creatAnimal();
            animalMap.remove(name);
            animalMap.replace(name, animalMap.get(name), animalMap.put(animal.getName(), animal));
        } else {
            System.out.println(name + " doesn't exist on this list");
        }
    }

    public void displayAnimal(String name) {
        if (animalMap.containsKey(name)) {
            System.out.println(animalMap.get(name));
        } else {
            System.out.println(name + " doesn't exist on this list");
        }
    }

    public void displayAnimalList() {
        for (Map.Entry<String, Animal> animals : animalMap.entrySet()) {
            String name = animals.getKey();
            Animal animal = animals.getValue();
            System.out.println(name + " " + animal);
        }
    }

    public void displayAnimalDogClass() {
        for (Map.Entry<String, Animal> animals : animalMap.entrySet()) {
            if (animals.getValue() instanceof Dog) {
                System.out.println(animals.getValue());
            }
        }
    }

    public void displayAnimalByWeight(double lowerWeight, double hihgerWeight) {
        for (Map.Entry<String, Animal> animals : animalMap.entrySet()) {
            if (animals.getValue().getWeight() > lowerWeight && animals.getValue().getWeight() < hihgerWeight) {
                System.out.println(animals.getValue());
            }
        }
    }

}
