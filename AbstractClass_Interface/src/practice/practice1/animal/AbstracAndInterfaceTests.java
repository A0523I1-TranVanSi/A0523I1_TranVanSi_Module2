package practice.animal;

import practice.fruit.Apple;
import practice.fruit.Fruit;
import practice.fruit.Orange;

public class AbstracAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());
        }

        Fruit[] fruit = new Fruit[2] ;
        fruit[0] = new Orange();
        fruit[1] = new Apple();
        for (Fruit fruit1 : fruit){
            System.out.println(fruit1.howToEat());
        }
    }
}
