package com.khilman.www.scorecounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ResultActivity extends AppCompatActivity {

    @BindView(R.id.winner_team)
    TextView winnerTeam;
    @BindView(R.id.team_a)
    TextView teamA;
    @BindView(R.id.team_b)
    TextView teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);

        // mendapatkan nilai yang dikirim oleh intent

        Intent i = getIntent();

        String team_a = i.getStringExtra("nm_a");
        String team_b = i.getStringExtra("nm_b");

        String score_a = i.getStringExtra("sc_a");
        String score_b = i.getStringExtra("sc_b");

        String winner = i.getStringExtra("wn");

        // set nilai ke widget

        winnerTeam.setText(winner);

        teamA.setText(team_a + " : " + score_a );
        teamB.setText(team_b + " : " + score_b );
    }
}
