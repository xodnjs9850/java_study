package day11.party;

import day10.inherrit.player.Hunter;
import day10.inherrit.player.Mage;
import day10.inherrit.player.Player;
import day10.inherrit.player.Warrior;

public class Main {
    public static void main(String[] args) {

        Warrior w = new Warrior("봉사왕김파괴");
        Mage m = new Mage("메테오불바다");
        Hunter h = new Hunter("야옹이는내친구");

        System.out.println("=================================");
        m.meteo(w, h);

        m.meteo(h, m, w, new Warrior("dddd"),
                new Mage("wwww"));




    }

}
