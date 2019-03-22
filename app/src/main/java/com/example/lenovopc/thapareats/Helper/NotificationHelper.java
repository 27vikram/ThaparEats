package com.example.lenovopc.thapareats.Helper;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Build;

import com.example.lenovopc.thapareats.R;

public class NotificationHelper extends ContextWrapper {

    private static final String TE_CHANNEL_ID = "com.example.lenovopc.thapareats";
    private static final String TE_CHANNEl_NAME = "Thapar Eats";

    private NotificationManager manager;

    public NotificationHelper(Context base) {
        super(base);
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O)
            createChannel();
    }

    @TargetApi(Build.VERSION_CODES.O)
    private void createChannel() {
        NotificationChannel thaparChannel = new NotificationChannel(TE_CHANNEL_ID,
                TE_CHANNEl_NAME,
                NotificationManager.IMPORTANCE_DEFAULT);
        thaparChannel.enableLights(false);
        thaparChannel.enableVibration(true);
        thaparChannel.setLockscreenVisibility(Notification.VISIBILITY_PRIVATE);

        getManager().createNotificationChannel(thaparChannel);
    }

    public NotificationManager getManager() {
        if (manager==null)
            manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        return manager;
    }

    @TargetApi(Build.VERSION_CODES.O)
    public android.app.Notification.Builder getThaparEatsChannelNotification(String title, String body, PendingIntent contentIntent,
                                                                             Uri soundUri){
        return new Notification.Builder(getApplicationContext(),TE_CHANNEL_ID)
                .setContentIntent(contentIntent)
                .setContentTitle(title)
                .setContentText(body)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setSound(soundUri)
                .setAutoCancel(false);
    }

    @TargetApi(Build.VERSION_CODES.O)
    public android.app.Notification.Builder getThaparEatsChannelNotification(String title, String body,
                                                                             Uri soundUri){
        return new Notification.Builder(getApplicationContext(),TE_CHANNEL_ID)
                .setContentTitle(title)
                .setContentText(body)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setSound(soundUri)
                .setAutoCancel(false);
    }
}
