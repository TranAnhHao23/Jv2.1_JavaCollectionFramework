package homework;

import homework.animals.Animal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AnimalManager animalManager = new AnimalManager();
        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Add 1 animal to the list");
            System.out.println("2. Delete animal to the list by name");
            System.out.println("3. Edit animal to the list by name");
            System.out.println("4. Display animal to the list by name");
            System.out.println("5. Display animal to the list");
            System.out.println("6. Display animal to the list via class Dog");
            System.out.println("7. Display animal to the list via weight range");
            System.out.println("0. Exit");
            System.out.println("Select your choice");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    animalManager.addAnimal();
                    break;
                case 2:
                    System.out.println("Input animal name");
                    String nameDelete = sc.nextLine();
                    animalManager.deleteAnimal(nameDelete);
                    break;
                case 3:
                    System.out.println("Input animal name");
                    String nameEdit = sc.nextLine();
                    animalManager.editAnimal(nameEdit);
                    break;
                case 4:
                    System.out.println("Input animal name");
                    String nameDisplay = sc.nextLine();
                    animalManager.displayAnimal(nameDisplay);
                    break;
                case 5:
                    animalManager.displayAnimalList();
                    break;
                case 6:
                    animalManager.displayAnimalDogClass();
                    break;
                case 7:
                    System.out.println("Input lower weight: ");
                    double lowerWeight = sc.nextDouble();
                    System.out.println("Input higher weight: ");
                    double higherWeight = sc.nextDouble();
                    animalManager.displayAnimalByWeight(lowerWeight,higherWeight);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Wrong choice!!!");
                    break;

            }
        } while (choice != 0);


    }
}
