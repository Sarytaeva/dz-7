package com.company;

public class  Main {

    public static void Heroes() {

        Magic loky = new Magic();
        loky.setDamage(800);
        loky.setHealth(1000);
        loky.setSuperPower("телепортация");
        Medic hulk = new Medic();
        hulk.setHealth(1500);
        hulk.setDamage(1000);
        hulk.setSuperPower("прыжок");
        Warrior thor = new Warrior();
        thor.setHealth(999);
        thor.setDamage(888);
        thor.setSuperPower("выносливость");


        Hero[] arrayHeroes = {loky, hulk, thor};

        for (int i = 0; i < arrayHeroes.length ; i++) {
            arrayHeroes[i].applySuperAbility("");
        }

    }

    public static void main(String[] args) {
Heroes();
    }

	// write your code here

        {


    }
}
