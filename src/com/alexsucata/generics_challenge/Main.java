package com.alexsucata.generics_challenge;

public class Main {

    public static void main(String[] args) {

        League<Team<FootbalPlayer>> championsLeague = new League<>("UCL");
        Team<FootbalPlayer> fcBarcelona = new Team<>("FC Barcelona");
        Team<FootbalPlayer> interMilan = new Team<>("Inter Milan");
        Team<FootbalPlayer> psvEindhoven = new Team<>("PSV Eindhoven");
        Team<FootbalPlayer> dynamoKiev = new Team<>("Dynamo Kiev");

        championsLeague.add(fcBarcelona);
        championsLeague.add(interMilan);
        championsLeague.add(psvEindhoven);
        championsLeague.add(dynamoKiev);

        fcBarcelona.matchResult(interMilan, 3, 1);
        psvEindhoven.matchResult(dynamoKiev, 2, 0);

        interMilan.matchResult(psvEindhoven, 2, 1);
        dynamoKiev.matchResult(fcBarcelona, 0, 4);

        fcBarcelona.matchResult(psvEindhoven, 5, 1);
        dynamoKiev.matchResult(interMilan, 1, 3);

        psvEindhoven.matchResult(fcBarcelona, 1, 1);
        interMilan.matchResult(dynamoKiev, 4, 0);

        dynamoKiev.matchResult(psvEindhoven, 1, 1);
        interMilan.matchResult(fcBarcelona, 3, 3);

        fcBarcelona.matchResult(dynamoKiev, 7, 0);
        psvEindhoven.matchResult(interMilan, 1, 0);

        championsLeague.showLeagueTable();
     }
}
