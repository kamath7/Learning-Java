public class Main {
    public static void main(String[] args) {

    FootballPlayer max = new FootballPlayer("Max");
    CricketPlayer dhuni = new CricketPlayer("dhuni");


    Team<FootballPlayer> lalleTeam = new Team<>("Awesome Team");
    Team <CricketPlayer> lalleTeam2 = new Team<>("CSK");
    lalleTeam.addPlayer(max);
    lalleTeam2.addPlayer(dhuni);
//    lalleTeam.addPlayer(dhuni); -> Invalid now

        System.out.println(lalleTeam.playerCount());
    }
}