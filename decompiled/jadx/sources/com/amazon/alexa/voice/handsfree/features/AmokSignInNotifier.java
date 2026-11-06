package com.amazon.alexa.voice.handsfree.features;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.devices.AMPDInformationProvider;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfScope;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AhfScope
/* loaded from: classes19.dex */
public class AmokSignInNotifier {
    private static final String ACTION = "com.amazon.alexa.handsfree.settings.REPORT_ALEXA_SIGN_IN";
    private static final String COMPONENT_CLASS = "com.amazon.alexa.handsfree.settings.receivers.AlexaSignInReceiver";
    private static final String TAG = "AmokSignInNotifier";

    @Inject
    public AmokSignInNotifier() {
    }

    @NonNull
    public AMPDInformationProvider getAMPDInformationProvider(@NonNull Context context) {
        return AMPDInformationProvider.getInstance(context);
    }

    public void notifySignIn(@NonNull Context context) {
        String voiceAppPackageName = getAMPDInformationProvider(context).getVoiceAppPackageName();
        if (voiceAppPackageName == null) {
            Log.d(TAG, "There's no voice apk, skipping sending the broadcast");
        } else {
            Log.d(TAG, "Notify of Alexa app sign in.");
            context.sendBroadcast(new Intent().setComponent(new ComponentName(voiceAppPackageName, COMPONENT_CLASS)).setAction(ACTION));
        }
    }
}
