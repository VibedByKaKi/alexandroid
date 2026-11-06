package com.amazon.alexa.handsfree.audio.features;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.audio.features.CallStateStatusReceiver;
import com.amazon.alexa.handsfree.protocols.features.HandsFreeComponent;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class CallStateMonitor {
    private static final String TAG = "CallStateMonitor";
    private static CallStateMonitor instance;
    private boolean currentCallState;
    private final ComponentEnablementResolver mComponentEnablementResolver;
    private final Context mContext;

    public CallStateMonitor(Context context) {
        this(context, new ComponentEnablementResolver(context));
        this.currentCallState = CallStateStatusReceiver.getInstance(context, new CallStateStatusReceiver.Callback() { // from class: com.amazon.alexa.handsfree.audio.features.CallStateMonitor$$ExternalSyntheticLambda0
            @Override // com.amazon.alexa.handsfree.audio.features.CallStateStatusReceiver.Callback
            public final void onCallStateReceived(Boolean bool) {
                CallStateMonitor.this.updateCallState(bool.booleanValue());
            }
        }).activate().booleanValue();
    }

    public static CallStateMonitor getInstance(Context context) {
        if (instance == null) {
            instance = new CallStateMonitor(context);
        }
        return instance;
    }

    public boolean getCurrentCallState() {
        return this.currentCallState;
    }

    public void updateCallState(boolean z) {
        if (this.mComponentEnablementResolver.isComponentEnabled(HandsFreeComponent.AHF_NATIVE_CALLING_API_31)) {
            Log.d(TAG, "Current call state updated");
            this.currentCallState = z;
        }
    }

    @VisibleForTesting
    public CallStateMonitor(Context context, ComponentEnablementResolver componentEnablementResolver) {
        this.currentCallState = false;
        this.mContext = context;
        this.mComponentEnablementResolver = componentEnablementResolver;
    }
}
