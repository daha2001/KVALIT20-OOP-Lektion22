package se.nackademin.animals;

        // superklass

public class Animal {

    public void eat(){
        System.out.println("I can eat!");
    }

    public void sleep(){
        System.out.println("I can sleep!");
    }

    @Override
    public String toString() {
        return "Jag är ett djur";
    }
}
