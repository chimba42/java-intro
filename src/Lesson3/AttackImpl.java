package Lesson3;

public class AttackImpl implements Attack  {

    String attack;
    String move;
    public AttackImpl(String attack, String move){
        this.attack = attack;
        this.move = move;
    }

    @Override
    public void attack() {
        move();
        System.out.println(attack);
    }

    @Override
    public void move() {
        System.out.println(move);

    }
}
