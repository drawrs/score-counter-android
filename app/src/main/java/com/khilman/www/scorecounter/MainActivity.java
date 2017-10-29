package com.khilman.www.scorecounter;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.team_a)
    TextView teamA;
    @BindView(R.id.team_b)
    TextView teamB;
    @BindView(R.id.score_a)
    TextView scoreA;
    @BindView(R.id.score_b)
    TextView scoreB;
    @BindView(R.id.btn_add_score_a)
    Button btnAddScoreA;
    @BindView(R.id.btn_add_score_b)
    Button btnAddScoreB;
    @BindView(R.id.btn_finish)
    Button btnFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.team_a)
    public void onTeamAClicked() {
        // panggil method tampilEdit
        // bawa editText
        tampilEdit(teamA);
    }


    @OnClick(R.id.team_b)
    public void onTeamBClicked() {
        tampilEdit(teamB);
    }

    @OnClick(R.id.btn_add_score_a)
    public void onBtnAddScoreAClicked() {
        // dapat nilai score terakhir
        int nilai_score_a = Integer.parseInt(scoreA.getText().toString());

        // hitung score baru -> skore terakhir + 1
        int score_baru = nilai_score_a + 1;
        // set score baru ke widget
        scoreA.setText(String.valueOf(score_baru));
    }

    @OnClick(R.id.btn_add_score_b)
    public void onBtnAddScoreBClicked() {
        // dapat nilai score terakhir
        int nilai_score_b = Integer.parseInt(scoreB.getText().toString());

        // hitung score baru -> skore terakhir + 1
        int score_baru = nilai_score_b + 1;
        // set score baru ke widget
        scoreB.setText(String.valueOf(score_baru));
    }

    @OnClick(R.id.btn_finish)
    public void onBtnFinishClicked() {
        // dapatkan nilai yang akan di bawa
        String nama_team_a = teamA.getText().toString();
        String nama_team_b = teamB.getText().toString();

        String score_team_a = scoreA.getText().toString();
        String score_team_b = scoreB.getText().toString();

        String winner = "";
        // cek siapa pemenang
        if (Integer.parseInt(score_team_a) > Integer.parseInt(score_team_b)){
            // score tim a > dari team b
            winner = nama_team_a;
        } else if (Integer.parseInt(score_team_a) < Integer.parseInt(score_team_b)){
            // score tim a < dari team b
            winner = nama_team_b;
        } else {
            // score tim a =  team b
            winner = "Draw";
        }

        // siapkan Intent
        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        intent.putExtra("nm_a", nama_team_a);
        intent.putExtra("nm_b", nama_team_b);

        intent.putExtra("sc_a", score_team_a);
        intent.putExtra("sc_b", score_team_b);

        intent.putExtra("wn", winner);

        // mulai activity
        startActivity(intent);

    }

    private void tampilEdit(final TextView targetTextView) {
        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("Edit team name");
        //Log.d("Target", "" + targetTextView.getId());

        // siapkan layout inflater
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.edit_team_name, null);


        // inisiaslisasi widget dalam custom layout inflater
        final EditText edt_team_name = (EditText) view.findViewById(R.id.edt_team_name);
        // dapatkan nilai nama team sekarang
        String nama_team_sekarang = targetTextView.getText().toString();
        // set ke edt_team_name
        edt_team_name.setText(nama_team_sekarang);


        // set custom layout ke alert dialog
        alert.setView(view);
        // set postive button
        alert.setPositiveButton("Save", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // dapatkan nama team baru
                String nama_baru = edt_team_name.getText().toString();
                // pastikan input ngga kosong
                if (!nama_baru.isEmpty()){ // balik keadaan pakai negasi (!)
                    // set ke textviwe team name
                    targetTextView.setText(nama_baru);
                }
            }
        });
        alert.show();
    }

}
