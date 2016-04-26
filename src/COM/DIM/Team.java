package COM.DIM;

/**
 * Created by us9522 on 25.04.2016.
 */
public class Team {
    public int id;
    public String name;
    public int tur;
    public int points;
    public int matches;
    public int wins;
    public int draw;
    public int lose;
    public int goal;
    public int plusgoal;
    public int minusgoal;

    public Team(int id, String name, int tur, int points, int matches, int wins, int draw, int lose, int goal,
                int plusgoal, int minusgoal){
        this.id = id;
        this.name = name;
        this.tur = tur;
        this.points = points;
        this.matches = matches;
        this.wins = wins;
        this.draw = draw;
        this.lose = lose;
        this.goal = goal;
        this.plusgoal = plusgoal;
        this.minusgoal = minusgoal;
    }

    public String toString(){
        return "{" +
                    "id = " + id +
                    " name = " + name +
                    " tur = " + tur +
                    " points = " + points +
                    " matches = " + matches +
                    " wins = " + wins +
                " draw = " + draw +
                " lose = " + lose +
                " goal = " + goal +
                " plusgoal = " + plusgoal +
                " minusgoal = " + minusgoal +
                " };";
    }
}
