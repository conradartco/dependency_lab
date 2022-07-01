package org.example;

public class Main {
    public static void main(String[] args) {

        Maul maul = new Maul();
        Crossbow crossbow = new Crossbow();
        Staff staff = new Staff();
        Bartha bartha = new Bartha();
        Robot robot_one = new Robot(bartha, maul);
        Robot robot_two = new Robot(bartha, crossbow);
        Robot robot_three = new Robot(bartha, staff);
        robot_one.Attack();
        robot_two.Attack();
        robot_three.Attack();




    }
}