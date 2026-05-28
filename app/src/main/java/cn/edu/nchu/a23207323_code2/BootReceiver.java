package cn.edu.nchu.a23207323_code2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            Intent serviceIntent = new Intent(context, LocationService.class);
            context.startService(serviceIntent);
            
            Intent notificationIntent = new Intent(context, NotificationService.class);
            context.startService(notificationIntent);
        }
    }
}