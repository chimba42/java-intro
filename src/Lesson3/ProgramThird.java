package Lesson3;

public class ProgramThird {

    public static void main(String[] args) {
        Bee beel = new Bee(1.5, new AttackImpl( "STING", "Crowl") );
        beel.move();
        beel.attack();


        Bee bee2 = new Bee("Green", 2.5);
        bee2.move();
        bee2.attack();

    }
}
