package Phan5_AdvancedObjectOrientedDesign.ThucHanh.LopAnimalVaInterfaceEdible.Animal;

import Phan5_AdvancedObjectOrientedDesign.ThucHanh.LopAnimalVaInterfaceEdible.Edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
