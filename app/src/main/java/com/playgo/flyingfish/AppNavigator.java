package com.playgo.flyingfish;

import android.content.Context;
import android.content.Intent;

import com.playgo.flyingfish.gameOver.GameOverActivity;
import com.playgo.flyingfish.main.MainActivity;
import com.playgo.flyingfish.splash.SplashActivity;

public class AppNavigator {

    public static void navigateToMainActivity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

    public static void navigateToGameOverActivity(Context context, int score) {
        Intent intent = new Intent(context, GameOverActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.putExtra(GameOverActivity.KEY_SCORE, score);
        context.startActivity(intent);
    }

}
