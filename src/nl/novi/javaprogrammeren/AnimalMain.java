package nl.novi.javaprogrammeren;

public class AnimalMain {

    public void main(String[] args) {

        System.out.println();
    }

}


    /*
    Opdracht
    Bekijk de beschrijving van onderstaande dieren. Bedenk wat je in de superklasse kan zetten. De subklassen hoef
    je nog niet te maken.

    First :

    1. Make 2 super classes : one for DomesticAnimals(dog, cat) and one for WildAnimals (lion, tiger, wolf)
    2. There are in total  5 animals - lion, tiger, wolf, dog and cat
    2. All WILD animals have the following in common: name, cageName, sex-gender, dayLastFed, countryOfOrigin
    3. All WILD animals also have one unique feature: lion - numberOfKids; tiger: numberOfStripes; wolf: packName.
    4. All DOMESTIC animals have the following in common: name, nameOfOwner, favouriteFoodBrand, type, gender.
    5. ALL GENERAL animals have the following in common : gender, name.
    5. The cat has ONE special feature: houseCat or outsideCat.

    ALL animals have to be able to do the following :
    1. method one: be able to move : if they move then print in the console: 0.25 meters moved.
    2. method two: they have  to make sounds: print out the sort of sound in the console.
    3. method three : ALL animals eat - print out WHAT they eat
    4.method four: ALL animals have to sleep  8 hours a day (boolean ? )
  --> all of the methods will be added to the ANIMAL.JAVA!

  Plan of steps:
  1. Make all 3 super-classes - Animal, Wild Animals, Domestic Animals - DONE
  2. Make all animals classes - DONE
  3. Start to add variables and methods for ALL animals to Animal.java :

  4.  Add variables for all DOMESTIC animals : nameOfOwner, favouriteFoodBrand, type.
  5. Add variables to all WILD animals: cageName, sex-gender, dayLastFed, countryOfOrigin.
  6.
    */