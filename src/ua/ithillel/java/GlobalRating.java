package ua.ithillel.java;

// ctrl + alt + L
public class GlobalRating {

    static Score[] data = new Score[4];

    static {
        Score score = new Score();
        score.category = "views:";
        score.statistic = score.statistic;
        data[0] = score;

        Score score1 = new Score();
        score1.category = "actions:";
        score1.statistic = score1.statistic;
        data[1] = score1;

        Score score2 = new Score();
        score2.category = "sharings:";
        score2.statistic = score2.statistic;
        data[2] = score2;

        Score score3 = new Score();
        score3.category = "buyings:";
        score3.statistic = score3.statistic;
        data[3] = score3;
    }
}




