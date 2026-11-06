package com.amazon.alexa.presence.service.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.amazon.alexa.presence.service.PresenceSuggestGuestConnect;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class PresenceSuggestOnCancelReceiver extends BroadcastReceiver {
    private static final String TAG = "com.amazon.alexa.presence.service.receivers.PresenceSuggestOnCancelReceiver";
    private static volatile AtomicBoolean isRegistered = new AtomicBoolean();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str = TAG;
        Log.i(str, "Received intent.  Action: " + intent.getAction());
        Log.i(str, "User dismissed Guest Connect notification");
        PresenceSuggestGuestConnect presenceSuggestGuestConnect = new PresenceSuggestGuestConnect(context);
        try {
            registerForContextChanges(this, context);
            long time = new Date().getTime();
            presenceSuggestGuestConnect.updateStorage(true, intent.getLongExtra(PresenceSuggestGuestConnect.DATE_SENT, time), time);
        } catch (Throwable th) {
            String str2 = TAG;
            Log.w(str2, "Unrecoverable situation encountered while handling intent", th);
            Log.w(str2, "Intent action causing exception: " + intent.getAction());
        }
    }

    public void registerForContextChanges(PresenceSuggestOnCancelReceiver presenceSuggestOnCancelReceiver, Context context) {
        if (isRegistered.compareAndSet(false, true)) {
            Context applicationContext = context.getApplicationContext();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(PresenceSuggestGuestConnect.DISMISS_PRESENCE_BASED_SUGGESTION);
            applicationContext.registerReceiver(presenceSuggestOnCancelReceiver, intentFilter);
        }
    }
}
