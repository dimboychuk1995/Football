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
    public int dodpoints;

    public Team(int id, String name){
        this.id = id;
        this.name = name;
        this.tur = 0;
        this.points = 0;
        this.matches = 0;
        this.wins = 0;
        this.draw = 0;
        this.lose = 0;
        this.goal = 0;
        this.plusgoal = 0;
        this.minusgoal = 0;
        this.dodpoints = 0;
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
                " dodpoints = " + dodpoints +
                " };";
    }
}
