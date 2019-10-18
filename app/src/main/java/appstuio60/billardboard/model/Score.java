package appstuio60.billardboard.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nicolaj Pedersen on 02-07-2019.
 */
public class Score {


    int score;
    List<String> scoreLog;

    public Score(int score) {
        this.score = score;
        scoreLog = new ArrayList<>();
    }

    public int reduce(int scoreReduce) {
        score-=scoreReduce;
        scoreLog.add("- "+scoreReduce);
        return score;
    }

    public int add(int addedScore) {
        score+=addedScore;
        scoreLog.add("+ "+addedScore);
        return score;
    }


}
