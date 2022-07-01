package org.example;

public class Bear implements Attacker{
    //Instance variables (HAS A)
    public String name;
    public int attackPower;

    public Bear(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    @Override
    public void Attack() {
        System.out.println(this.name + " slashes for " + this.attackPower);
    }
}
