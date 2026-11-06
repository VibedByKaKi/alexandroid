package com.amazon.alexa.auth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AccountChangedBroadcastReceiver {
    private static final String BROADCAST_PERMISSION = "com.amazon.dcp.sso.permission.account.changed";
    private static final String INTENT_ACCOUNT_ADDED = "com.amazon.dcp.sso.action.account.added";
    private static final String INTENT_ACCOUNT_REMOVED = "com.amazon.dcp.sso.action.account.removed";
    private static final String TAG = "AccountChangedBroadcastReceiver";
    private final InternalAccountChangedBroadcastReceiver broadcastReceiver;
    private final Context context;

    public AccountChangedBroadcastReceiver(Context context, AccountChangedListener accountChangedListener) {
        Objects.requireNonNull(context);
        Objects.requireNonNull(accountChangedListener);
        this.context = context.getApplicationContext();
        this.broadcastReceiver = new InternalAccountChangedBroadcastReceiver(accountChangedListener, 0);
    }

    public void registerReceiver() {
        IntentFilter m = TableInfo$$ExternalSyntheticOutline0.m("com.amazon.dcp.sso.action.account.added", "com.amazon.dcp.sso.action.account.removed");
        int i = Build.VERSION.SDK_INT;
        Context context = this.context;
        if (i >= 34) {
            context.registerReceiver(this.broadcastReceiver, m, "com.amazon.dcp.sso.permission.account.changed", null, 4);
        } else {
            context.registerReceiver(this.broadcastReceiver, m, "com.amazon.dcp.sso.permission.account.changed", null);
        }
    }

    public void unregisterReceiver() {
        this.context.unregisterReceiver(this.broadcastReceiver);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class InternalAccountChangedBroadcastReceiver extends BroadcastReceiver {
        private final AccountChangedListener listener;

        private InternalAccountChangedBroadcastReceiver(AccountChangedListener accountChangedListener) {
            this.listener = accountChangedListener;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction() == null) {
                Log.e(AccountChangedBroadcastReceiver.TAG, "Unexpectedly received an empty action in broadcast receiver.");
                return;
            }
            String action = intent.getAction();
            action.getClass();
            if (action.equals("com.amazon.dcp.sso.action.account.added")) {
                this.listener.onAccountAdded();
                return;
            }
            if (action.equals("com.amazon.dcp.sso.action.account.removed")) {
                this.listener.onAccountRemoved();
                return;
            }
            Log.e(AccountChangedBroadcastReceiver.TAG, "Unexpectedly received an unrecognized action in broadcast receiver. Will ignore it: " + intent.getAction());
        }

        public /* synthetic */ InternalAccountChangedBroadcastReceiver(AccountChangedListener accountChangedListener, int i) {
            this(accountChangedListener);
        }
    }
}
