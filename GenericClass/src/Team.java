import java.util.ArrayList;

public class Team<T> {
    private String name;
    int played = 0;
    int won = 0 ;
    int lost =0;
    int tied =0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(((Player)player).getName() + "already on team");
            return false;
        }else{
            members.add(player);
            System.out.println(((Player)player).getName()+" added");
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

    public int ranking(){
        return (won * 2) + tied;
    }
}
