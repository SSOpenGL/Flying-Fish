package com.playgo.flyingfish;

import android.content.Context;
import android.content.Intent;

import com.playgo.flyingfish.main.MainActivity;

public class AppNavigator {

    public static void navigateToMainActivity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

}
