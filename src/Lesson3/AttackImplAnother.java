package Lesson3;

public class AttackImplAnother implements Attack {

    String attack;

    public AttackImplAnother (String attack){
        this.attack = attack;
    }


    @Override
    public void attack() {
        System.out.println(attack + " and " + attack);
    }
}
