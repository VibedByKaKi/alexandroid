package com.amazon.alexa.voice.ra;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.voice.ui.ra.RaConversationLaunchHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class RaConversationLaunchForwarder implements RaConversationLaunchHandler {
    private static final String ACTION_SHOW_RA_UI = "amazon.intent.action.SHOW_RA_UI";
    private static final String TAG = "RaConversationLaunchForwarder";

    @NonNull
    private final Context context;

    @Nullable
    private final ConversationCxPluggableFeatureEnabler pluggableFeatureEnabler;

    @VisibleForTesting
    public RaConversationLaunchForwarder(@NonNull Context context, @Nullable ConversationCxPluggableFeatureEnabler conversationCxPluggableFeatureEnabler) {
        this.context = context.getApplicationContext();
        this.pluggableFeatureEnabler = conversationCxPluggableFeatureEnabler;
    }

    @Nullable
    private static ConversationCxPluggableFeatureEnabler buildEnablerOrNull() {
        FeatureServiceV2 featureServiceV2 = (FeatureServiceV2) Automotive$$ExternalSyntheticOutline0.m(FeatureServiceV2.class);
        if (featureServiceV2 != null) {
            return new ConversationCxPluggableFeatureEnabler(featureServiceV2);
        }
        Log.w(TAG, "FeatureServiceV2 unavailable at construction; the gate cannot be read, so launches will take the legacy path");
        return null;
    }

    @Override // com.amazon.alexa.voice.ui.ra.RaConversationLaunchHandler
    public boolean handleConversationLaunch(@NonNull Intent intent) {
        if ("amazon.intent.action.SHOW_RA_UI".equals(intent.getAction())) {
            if (intent.getBooleanExtra(RaConversationLaunchForwardReceiver.EXTRA_ALREADY_FORWARDED, false)) {
                Log.e(TAG, "already-forwarded launch reached the forwarder; is the forwarder registered in the main process? Declining so the legacy activity starts");
                return false;
            }
            ConversationCxPluggableFeatureEnabler conversationCxPluggableFeatureEnabler = this.pluggableFeatureEnabler;
            if (conversationCxPluggableFeatureEnabler != null && conversationCxPluggableFeatureEnabler.isEnabled()) {
                Log.i(TAG, "SHOW_RA_UI in secondary process; forwarding to the main process");
                RaConversationLaunchForwardReceiver.forward(this.context, intent);
                return true;
            }
        }
        return false;
    }

    public RaConversationLaunchForwarder(@NonNull Context context) {
        this(context, buildEnablerOrNull());
    }
}
