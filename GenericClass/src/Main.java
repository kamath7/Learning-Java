import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    FootballPlayer max = new FootballPlayer("Max");
    CricketPlayer dhuni = new CricketPlayer("dhuni");
    BaseballPlayer someDude = new BaseballPlayer("SomeDude");


    Team<FootballPlayer> lalleTeam = new Team<>("Awesome Team");
    Team <CricketPlayer> lalleTeam2 = new Team<>("CSK");
    Team<FootballPlayer> lalleTeam4 = new Team<>("Awesome Team2");


    Team<BaseballPlayer> lalleTeam3 = new Team<>("Shitty team");
    lalleTeam3.addPlayer(someDude);
    lalleTeam.addPlayer(max);
    lalleTeam2.addPlayer(dhuni);
//    lalleTeam.addPlayer(dhuni); -> Invalid now
//
    System.out.println(lalleTeam2.playerCount());

    lalleTeam.matchResult(lalleTeam4,1,2);

        System.out.println("Rankings");
        System.out.println(lalleTeam.getName()+" "+lalleTeam.ranking());

        System.out.println(lalleTeam.compareTo(lalleTeam4));

        ArrayList<Team> teams;

    }
}