package day11.party;

import day10.inherrit.player.Player;

public class Main {
    public static void main(String[] args) {

        Party party = new Party(3);

        party.addPlayer(new Player("dddd"));
        party.addPlayer(new Player("aaa"));
        party.addPlayer(new Player("bbb"));

        party.kickPlayer("dddd");

//        party.showPartyInfo();



    }

}
