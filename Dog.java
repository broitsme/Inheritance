package OopsConcepts.Inheritance;

//Dog Is-A Animal
public class Dog extends Animal {
    @Override
    void makeSound(){
        System.out.println("Bark!");
    }
}
