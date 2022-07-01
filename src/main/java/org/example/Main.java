package org.example;

public class Main {
    public static void main(String[] args) {

        Weapon maul = new Maul();
        Name bartha = new Bartha();
        Attacker robot_one = new Robot(bartha, maul);
        robot_one.Attack();

        Attacker bear_one = new Bear("Jeremy", 35);
        bear_one.Attack();




    }
}