package modul_6.praktikum_3;

public class Cat extends Mammal{
    private Boolean isIndoor;

    public Cat(String name, String furColor, Boolean isIndoor){
        super(name, furColor);
        this.isIndoor = isIndoor;
    }

    public void meow(){
        System.out.println(name + " is meowing: Meow meow!");
    }

    @Override
    public void eat() {
        System.out.println(name + " the cat is eating cat food.");
    }
}
