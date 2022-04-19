import java.util.ArrayList;

public class Team {
    private String name;
    int played = 0;
    int won = 0 ;
    int lost =0;
    int tied =0;

    private ArrayList<Player> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(Player player){
        if(members.contains(player)){
            System.out.println(player.getName() + "already on team");
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName()+" added");
            return  true;
        }
    }

    public int playerCount(){
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int oppScore){
        if(ourScore > oppScore){
            won++;
        }else if(ourScore == oppScore){
            tied++;

        }else{
            lost++;
        }
        played++;

        if(opponent!= null){
            opponent.matchResult(null, oppScore, ourScore);
        }
    }
}
