package com.amazon.alexa.voiceui.externalCards;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.utils.validation.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ExternalCardBroadcastReceiver extends BroadcastReceiver {
    private final Context context;
    private final ExternalCardListener externalCardListener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Actions {
        static final String EXTERNAL_CARD_RENDERED = "com.amazon.alexa.intent.action.EXTERNAL_CARD_RENDERED";
    }

    public ExternalCardBroadcastReceiver(Context context, ExternalCardListener externalCardListener) {
        this.context = context;
        this.externalCardListener = externalCardListener;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Preconditions.notNull(action, "action is null");
        action.getClass();
        if (action.equals("com.amazon.alexa.intent.action.EXTERNAL_CARD_RENDERED")) {
            this.externalCardListener.onExternalCardRendered();
        }
    }

    public void register() {
        IntentFilter m = ErrorUtils$$ExternalSyntheticOutline0.m("com.amazon.alexa.intent.action.EXTERNAL_CARD_RENDERED");
        int i = Build.VERSION.SDK_INT;
        Context context = this.context;
        if (i >= 34) {
            context.registerReceiver(this, m, 4);
        } else {
            context.registerReceiver(this, m);
        }
    }

    public void unregister() {
        this.context.unregisterReceiver(this);
    }
}
