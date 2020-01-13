package OopsConcepts.Inheritance;

//Cat Is-A Animal
public class Cat extends Animal {
    @Override
    void makeSound(){
        System.out.println("Meow..");
    }
}
