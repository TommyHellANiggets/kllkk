package com.example.projectmisyats;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ReminderBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String title = intent.getStringExtra("title");
        Toast.makeText(context, "Reminder: " + title, Toast.LENGTH_LONG).show();
        // Можно добавить код для показа уведомления
    }
}
