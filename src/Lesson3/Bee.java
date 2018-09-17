package Lesson3;

public class Bee  extends Insect {

    Attack attack;

    public Bee(String color, double size) {
        super(color, size);
        attack = new AttackImplAnother("Sting");
    }

    public Bee( double size, Attack attack) {
        super("Yellow", size);
        this.attack = attack;
    }
    public void attack (){
        attack.attack();
    }
    public void move(){
        attack.move();
    }
}
