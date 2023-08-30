package practice.animal;

import practice.edible.Edible;

public class Chicken extends Animal implements Edible {
    public String makeSound(){
        return "Chicken";
    }
    public String howToEat(){
        return "could be fried" ;
    }
}
