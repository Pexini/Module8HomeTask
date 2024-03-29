package Easy;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[10];

        animals[0] = new Camel();
        animals[1] = new Elefant();
        animals[2] = new Fox();
        animals[3] = new Giraffe();
        animals[4] = new Hippopotamus();
        animals[5] = new Horse();
        animals[6] = new Lion();
        animals[7] = new Monkey();
        animals[8] = new Tiger();
        animals[9] = new Wolf();

        System.out.println("Наш Зоопарк содержит: ");
        for (Animal animal : animals) {
//            if (animal != null) {
                animal.say();
                animal.walk();
                System.out.println(animal.getClass().getSimpleName());
            }
        }
    }
//}