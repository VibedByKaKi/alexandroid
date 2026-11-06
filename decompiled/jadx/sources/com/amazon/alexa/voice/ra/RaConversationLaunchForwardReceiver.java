package com.amazon.alexa.voice.ra;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.ui.ra.RaConversationLaunchHandler;
import com.amazon.alexa.voice.ui.ra.RaConversationLaunchHandlerRegistry;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class RaConversationLaunchForwardReceiver extends BroadcastReceiver {
    public static final String ACTION_FORWARD_SHOW_RA_UI = "com.amazon.alexa.voice.intent.action.FORWARD_SHOW_RA_UI";
    private static final String ACTION_SHOW_RA_UI = "amazon.intent.action.SHOW_RA_UI";
    public static final String EXTRA_ALREADY_FORWARDED = "com.amazon.alexa.voice.intent.extra.ALREADY_FORWARDED";
    private static final String TAG = "RaConversationLaunchForwardReceiver";

    public static void forward(Context context, Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.setAction(ACTION_FORWARD_SHOW_RA_UI);
        intent2.putExtra(EXTRA_ALREADY_FORWARDED, true);
        intent2.setClass(context, RaConversationLaunchForwardReceiver.class);
        context.sendBroadcast(intent2);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent == null || !ACTION_FORWARD_SHOW_RA_UI.equals(intent.getAction())) {
            return;
        }
        Intent intent2 = new Intent(intent);
        intent2.setAction("amazon.intent.action.SHOW_RA_UI");
        intent2.setComponent(null);
        intent2.setPackage(context.getPackageName());
        intent2.addFlags(268435456);
        RaConversationLaunchHandler raConversationLaunchHandler = RaConversationLaunchHandlerRegistry.get();
        if (raConversationLaunchHandler != null) {
            try {
                if (raConversationLaunchHandler.handleConversationLaunch(intent2)) {
                    Log.i(TAG, "forwarded launch consumed by the pluggable handler in the main process");
                    return;
                }
                str = "declined";
            } catch (RuntimeException e) {
                Log.e(TAG, "handler threw handling a forwarded launch; starting the legacy activity", e);
                str = "threw";
            }
        } else {
            str = "absent";
        }
        TableInfo$$ExternalSyntheticOutline0.m8110m("forwarded launch: handler ", str, "; starting the legacy activity", TAG);
        context.startActivity(intent2);
    }
}
