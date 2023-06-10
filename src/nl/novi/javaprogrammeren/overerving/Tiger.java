package nl.novi.javaprogrammeren.overerving;

public class Tiger extends WildAnimals {


    private int numberOfStripes;

    public Tiger(String name, String gender, String cageName, String dayLastFed, String countryOfOrigin, boolean animalMoved, boolean hasEaten, int numberOfStripes) {
        super(name, gender, cageName, dayLastFed, countryOfOrigin, animalMoved, hasEaten);
        this.numberOfStripes = numberOfStripes;
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

}
