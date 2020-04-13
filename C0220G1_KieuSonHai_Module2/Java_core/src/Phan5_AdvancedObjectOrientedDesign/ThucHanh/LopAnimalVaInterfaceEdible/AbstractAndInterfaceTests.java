package Phan5_AdvancedObjectOrientedDesign.ThucHanh.LopAnimalVaInterfaceEdible;

import Phan5_AdvancedObjectOrientedDesign.ThucHanh.LopAnimalVaInterfaceEdible.Animal.Animal;
import Phan5_AdvancedObjectOrientedDesign.ThucHanh.LopAnimalVaInterfaceEdible.Animal.Chicken;
import Phan5_AdvancedObjectOrientedDesign.ThucHanh.LopAnimalVaInterfaceEdible.Animal.Tiger;
import Phan5_AdvancedObjectOrientedDesign.ThucHanh.LopAnimalVaInterfaceEdible.Edible.Edible;
import Phan5_AdvancedObjectOrientedDesign.ThucHanh.LopAnimalVaInterfaceEdible.Fruit.Apple;
import Phan5_AdvancedObjectOrientedDesign.ThucHanh.LopAnimalVaInterfaceEdible.Fruit.Fruit;
import Phan5_AdvancedObjectOrientedDesign.ThucHanh.LopAnimalVaInterfaceEdible.Fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Edible) animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}