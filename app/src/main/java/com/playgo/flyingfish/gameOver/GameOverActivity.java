package com.playgo.flyingfish.gameOver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.playgo.flyingfish.AppNavigator;
import com.playgo.flyingfish.R;

public class GameOverActivity extends AppCompatActivity {

    public static final String KEY_SCORE = "score";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        if (getIntent() != null && getIntent().getExtras() != null) {
            String score = String.valueOf(getIntent().getExtras().get(KEY_SCORE));
            TextView scoreTextView = findViewById(R.id.scoreTextView);
            scoreTextView.setText("Score = " + score);
        }

        findViewById(R.id.playAgainButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppNavigator.navigateToMainActivity(GameOverActivity.this);
            }
        });
    }
}
