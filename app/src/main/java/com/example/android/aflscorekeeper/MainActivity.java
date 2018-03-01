package com.example.android.aflscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalsTeamA = 0;
    int goalsTeamB = 0;
    int behindsTeamA = 0;
    int behindsTeamB = 0;
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the Team A Goal button is clicked
     */
    public void goalForA(View v) {
        goalsTeamA += 1;
        scoreTeamA += 6;
        displayForTeamA(goalsTeamA, behindsTeamA, scoreTeamA);
    }

    /**
     * This method is called when the Team A Behind button is clicked
     */
    public void behindForA(View v) {
        behindsTeamA += 1;
        scoreTeamA += 1;
        displayForTeamA(goalsTeamA, behindsTeamA, scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int goalsTeamA, int behindsTeamA, int scoreTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        String scoreDisplay = goalsTeamA + "." + behindsTeamA + "." + scoreTeamA;
        scoreView.setText(scoreDisplay);
    }

    /**
     * This method is called when the Team B Goal button is clicked
     */
    public void goalForB(View v) {
        goalsTeamB += 1;
        scoreTeamB += 6;
        displayForTeamB(goalsTeamB, behindsTeamB, scoreTeamB);
    }

    /**
     * This method is called when the Team B Behind button is clicked
     */
    public void behindForB(View v) {
        behindsTeamB += 1;
        scoreTeamB += 1;
        displayForTeamB(goalsTeamB, behindsTeamB, scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int goalsTeamB, int behindsTeamB, int scoreTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        String scoreDisplay = goalsTeamB + "." + behindsTeamB + "." + scoreTeamB;
        scoreView.setText(scoreDisplay);
    }

    /**
     * This method is called when the reset button is clicked
     */
    public void resetScores(View v) {
        goalsTeamA = 0;
        goalsTeamB = 0;
        behindsTeamA = 0;
        behindsTeamB = 0;
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(goalsTeamA, behindsTeamA, scoreTeamA);
        displayForTeamB(goalsTeamB, behindsTeamB, scoreTeamB);
    }
}
