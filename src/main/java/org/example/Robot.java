package org.example;

public class Robot implements Attacker{

    //Instance variables (HAS A)
    public Name name;
    public Weapon weapon;

    public Robot(Name name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    //Methods (CAN DO)
    public void Attack(){
        System.out.println(this.name + " attacks with their " + this.weapon.name + " for " + this.weapon.power + " damage!");
    }
}
