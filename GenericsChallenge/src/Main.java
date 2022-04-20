public class Main {
    public static void main(String[] args) {

        League<Team<FootballPlayer>> epl = new League<>("EPL");
        Team<FootballPlayer> manUtd = new Team<>("Man Utd");
        Team<FootballPlayer> chelsea = new Team<>("Chelsea");
        Team<FootballPlayer> arsenal = new Team<>("Arsenal");
        Team<FootballPlayer>  manCity= new Team<>("Man City");

        epl.add(manUtd);
        epl.add(chelsea);
        epl.add(arsenal);
        epl.add(manCity);

        epl.showLeagueTable();

        chelsea.matchResult(manCity,2,3);
        manUtd.matchResult(arsenal,6,5);
        manCity.matchResult(manUtd,1,6);
        arsenal.matchResult(chelsea,3,1);

        epl.showLeagueTable();
    }
}