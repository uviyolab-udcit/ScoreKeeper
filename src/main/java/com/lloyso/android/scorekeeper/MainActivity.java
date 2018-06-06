package com.lloyso.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * tracks the score for Home Team
     */
    int scoreHome = 0;
    /**
     * tracks the score for Away Team
     */
    int scoreAway = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * adds 5 points for Home Team when a try is scored
     */
    public void addFiveForHome(View v) {
        scoreHome = scoreHome + 5;
        displayForHome(scoreHome);
    }

    /**
     * adds 2 points for Home Team when a Conversion is scored
     */
    public void addTwoForHome(View v) {
        scoreHome = scoreHome + 2;
        displayForHome(scoreHome);
    }

    /**
     * adds 3 points for Home Team when a Penalty is scored
     */
    public void addThreeForHome(View v) {
        scoreHome = scoreHome + 3;
        displayForHome(scoreHome);
    }

    /**
     * adds 3 points for Home Team when a Drop Goal is scored
     */
    public void addThreeForHomeD(View v) {
        scoreHome = scoreHome + 3;
        displayForHome(scoreHome);
    }

    /**
     * adds 5 points for Away Team when a Try is scored
     */
    public void addFiveForAway(View v) {
        scoreAway = scoreAway + 5;
        displayForAway(scoreAway);
    }

    /**
     * adds 2 points for Away Team when a Goal is scored
     */
    public void addTwoForAway(View v) {
        scoreAway = scoreAway + 2;
        displayForAway(scoreAway);
    }

    /**
     * adds 3 points for Away Team when a Penalty is scored
     */
    public void addThreeForAway(View v) {
        scoreAway = scoreAway + 3;
        displayForAway(scoreAway);
    }

    /**
     * adds 3 point for Away Team when a Drop Goal is scored
     */
    public void addThreeForAwayD(View v) {
        scoreAway = scoreAway + 3;
        displayForAway(scoreAway);
    }

    /**
     * Resets the scores for both teams to 0.
     */
    public void resetScore(View V) {
        scoreHome = 0;
        scoreAway = 0;
        displayForHome(scoreHome);
        displayForAway(scoreAway);
    }

    /**
     * Displays the given score for Team South Africa.
     */
    public void displayForHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team Away.
     */
    public void displayForAway(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_score);
        scoreView.setText(String.valueOf(score));
    }

}

