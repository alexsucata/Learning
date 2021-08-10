package com.alexsucata.generics;

public class Main {

    public static void main(String[] args) {
        FootbalPlayer leo = new FootbalPlayer("Leo");
        BasketballPlayer kevin = new BasketballPlayer("Kevin");
        HandballPlayer nikola = new HandballPlayer("Nikola");

        Team<FootbalPlayer> fcBarcelona = new Team<>("FC Barcelona");
        fcBarcelona.addPlayer(leo);
        //fcBarcelona.addPlayer(kevin);
        //fcBarcelona.addPlayer(nikola);

        System.out.println(fcBarcelona.numPlayers());

        Team<BasketballPlayer> brooklynNets = new Team<>("Brooklyn Nets");
        brooklynNets.addPlayer(kevin);

        Team<HandballPlayer> hcBarcelona = new Team<>("HC Barcelona");
        hcBarcelona.addPlayer(nikola);

        Team<FootbalPlayer> realMadrid = new Team<>("Real Madrid");
        FootbalPlayer karim = new FootbalPlayer("Karim Benzema");
        realMadrid.addPlayer(karim);

        Team<FootbalPlayer> atleticoMadrid = new Team<>("Atletico Madrid");
        FootbalPlayer luis = new FootbalPlayer("Luis Suarez");
        atleticoMadrid.addPlayer(luis);

        realMadrid.matchResult(fcBarcelona, 0, 3);
        fcBarcelona.matchResult(atleticoMadrid, 3, 1);
        atleticoMadrid.matchResult(realMadrid, 1, 1);
        //fcBarcelona.matchResult(brooklynNets, 4, 0);
    }

}
