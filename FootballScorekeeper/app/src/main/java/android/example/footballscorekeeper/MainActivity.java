package android.example.footballscorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int agoal = 0;
    public int bgoal = 0;
    public int afoul = 0;
    public int bfoul = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayGoalForTeamA(0);
        displayGoalForTeamB(0);
        displayFoulForTeamA(0);
        displayFoulForTeamB(0);
    }
    public void agoal(View view)
    {
        agoal = agoal + 1;
        displayGoalForTeamA(agoal);
    }
    public void afoul(View view)
    {
        afoul = afoul + 1;
        displayFoulForTeamA(afoul);
    }
    public void bgoal(View view)
    {
        bgoal = bgoal +1;
        displayGoalForTeamB(bgoal);
    }
    public void bfoul(View view)
    {
        bfoul = bfoul + 1;
        displayFoulForTeamB(bfoul);
    }
    public void reset(View view)
    {
        agoal = 0;
        afoul = 0;
        bgoal = 0;
        bfoul = 0;
        displayGoalForTeamA(agoal);
        displayFoulForTeamA(afoul);
        displayGoalForTeamB(bgoal);
        displayFoulForTeamB(bfoul);
    }

    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.agoal);
        scoreView.setText(String.valueOf(score));
    }
    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.bgoal);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFoulForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.afoul);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFoulForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.bfoul);
        scoreView.setText(String.valueOf(score));
    }
}
