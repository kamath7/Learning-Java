public class Main {
    public static void main(String[] args) {

    FootballPlayer max = new FootballPlayer("Max");
    CricketPlayer dhuni = new CricketPlayer("dhuni");


    Team lalleTeam = new Team("Awesome Team");

    lalleTeam.addPlayer(max);
    lalleTeam.addPlayer(dhuni);

        System.out.println(lalleTeam.playerCount());
    }
}