package android.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeamA = 0;
    int scoreTeamB = 0;



    public void point3(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayTeamA(scoreTeamA);
    }

    public void point2(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayTeamA(scoreTeamA);
    }

    public void point1(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayTeamA(scoreTeamA);
    }

    private void displayTeamA(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.team_A_score);
        scoreTextView.setText("" + number);
    }

    public void point3_Team_B(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayTeamB(scoreTeamB);
    }

    public void point2_Team_B(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayTeamB(scoreTeamB);
    }

    public void point1_Team_B(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayTeamB(scoreTeamB);
    }

    private void displayTeamB(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.team_B_score);
        scoreTextView.setText("" + number);
    }

    public void resetScores(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);
        displayScores("");

    }

    public void submitScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);
        displayScores("Scores has been Submitted");


    }

    private void displayScores(String scores){
        TextView submitScoreTextView = (TextView) findViewById(R.id.submit_score_text_view);
                submitScoreTextView.setText("" + scores);
    }
}
