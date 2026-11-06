package com.amazon.alexa.client.alexaservice.base.auth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.client.alexaservice.base.events.UserLoggedInEvent;
import com.amazon.alexa.client.alexaservice.base.events.UserLoggedOutEvent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AuthenticationChangeBroadcastReceiver extends BroadcastReceiver {

    @VisibleForTesting
    static final String BROADCAST_PERMISSION = "com.amazon.dcp.sso.permission.account.changed";

    @VisibleForTesting
    static final String INTENT_ACCOUNT_ADDED = "com.amazon.dcp.sso.action.account.added";

    @VisibleForTesting
    static final String INTENT_ACCOUNT_REMOVED = "com.amazon.dcp.sso.action.account.removed";
    private static final int RECEIVER_NOT_EXPORTED = 4;
    private static final String TAG = "AuthenticationChangeBroadcastReceiver";
    private final Context context;
    private final AlexaClientEventBus eventBus;
    private boolean isRegistered = false;

    @Inject
    public AuthenticationChangeBroadcastReceiver(Context context, AlexaClientEventBus alexaClientEventBus) {
        this.context = context;
        this.eventBus = alexaClientEventBus;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        action.getClass();
        if (action.equals("com.amazon.dcp.sso.action.account.added")) {
            this.eventBus.post(UserLoggedInEvent.create());
        } else if (action.equals("com.amazon.dcp.sso.action.account.removed")) {
            this.eventBus.post(UserLoggedOutEvent.create());
        }
    }

    public void register() {
        AuthenticationChangeBroadcastReceiver authenticationChangeBroadcastReceiver;
        if (this.isRegistered) {
            return;
        }
        IntentFilter m = TableInfo$$ExternalSyntheticOutline0.m("com.amazon.dcp.sso.action.account.added", "com.amazon.dcp.sso.action.account.removed");
        int i = Build.VERSION.SDK_INT;
        Context context = this.context;
        if (i >= 34) {
            authenticationChangeBroadcastReceiver = this;
            context.registerReceiver(authenticationChangeBroadcastReceiver, m, "com.amazon.dcp.sso.permission.account.changed", null, 4);
        } else {
            authenticationChangeBroadcastReceiver = this;
            context.registerReceiver(authenticationChangeBroadcastReceiver, m, "com.amazon.dcp.sso.permission.account.changed", null);
        }
        authenticationChangeBroadcastReceiver.isRegistered = true;
    }

    public void unregister() {
        if (this.isRegistered) {
            this.context.unregisterReceiver(this);
            this.isRegistered = false;
        }
    }
}
