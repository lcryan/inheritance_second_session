package nl.novi.javaprogrammeren.overerving;

public class Cat extends DomesticAnimal {
    private CatType catType;

    public Cat(String name, String gender, boolean animalMoved, String nameOfOwner, String favouriteFoodBrand, String breed, CatType catType) {
        super(name, gender, animalMoved, nameOfOwner, favouriteFoodBrand, breed);
        this.catType = catType;
    }

    public CatType getCatType() {
        return catType;
    }

    public void setCatType(CatType catType) {
        this.catType = catType;
    }

    @Override
    public void animalSound() {
        System.out.println("Kitty makes MEOUUUUWWWWWWWWW....");
    }

    public enum CatType {
        HOUSECAT,
        STREETCAT
    }
}
