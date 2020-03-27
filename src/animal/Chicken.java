package animal;
import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "O o o...";
    }

    @Override
    public String howToEat() {
        return "Nau chin";
    }
}
