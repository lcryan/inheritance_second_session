package nl.novi.javaprogrammeren.overerving;

public class Tiger extends WildAnimals {

    private int numberOfStripes;

    public Tiger(String name, String gender, String cageName, String dayLastFed, String countryOfOrigin, boolean animalMoved, boolean hasEaten, int sleepHours, int numberOfStripes) {
        super(name, gender, cageName, dayLastFed, countryOfOrigin, animalMoved, hasEaten, sleepHours);
        this.numberOfStripes = numberOfStripes;
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    @Override
    public void animalSound() {
        System.out.println("Tigger makes ROAAARRRRRRRRRRR!!!!!");
    }
}
