package com.amazon.alexa.voice.ra;

import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.utils.device.FireTabletUtils;
import com.amazon.alexa.voice.features.FeatureEnabler;
import com.amazon.alexa.voice.features.VoiceFeature;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ConversationCxPluggableFeatureEnabler implements FeatureEnabler {
    private static final String TAG = "ConversationCxPluggableFeatureEnabler";
    private final FeatureServiceV2 featureServiceV2;

    public ConversationCxPluggableFeatureEnabler(@NonNull FeatureServiceV2 featureServiceV2) {
        this.featureServiceV2 = featureServiceV2;
    }

    @Override // com.amazon.alexa.voice.features.FeatureEnabler
    public VoiceFeature getFeature() {
        return VoiceFeature.CONVERSATION_CX_PLUGGABLE;
    }

    public boolean isEnabled() {
        VoiceFeature feature = getFeature();
        try {
            if (FireTabletUtils.isFireOS()) {
                return false;
            }
            return this.featureServiceV2.hasAccess(feature.getFeatureNamespace(), feature.getName(), false);
        } catch (RuntimeException e) {
            Log.w(TAG, "gate read failed; falling back to the legacy launch path", e);
            return false;
        }
    }

    @Override // com.amazon.alexa.voice.features.FeatureEnabler
    public void enableFeature(boolean z) {
    }
}
