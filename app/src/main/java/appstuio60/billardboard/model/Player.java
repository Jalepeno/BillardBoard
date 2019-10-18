package appstuio60.billardboard.model;


/**
 * Created by Nicolaj Pedersen on 16-12-2017.
 */
public class Player {

    Person person;
    Score score;


    public Player() {

    }

    public Score getScore() {
        return score;
    }

    public int addScore(int addedScore){
        return score.add(addedScore);
    }
    public int reduceScore(int scoreReduce){
        return score.reduce(scoreReduce);
    }
}
