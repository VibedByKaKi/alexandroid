package com.amazon.alexa.voice.ra;

import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.utils.device.FireTabletUtils;
import com.amazon.alexa.voice.features.VoiceFeature;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DictationFeatureEnabler {
    private static final String CONTROL = "C";
    private static final String CONTROL_DEFAULT = "C_DEFAULT";
    private static final String TAG = "DictationFeatureEnabler";
    private final FeatureServiceV2 featureServiceV2;

    public DictationFeatureEnabler(@NonNull FeatureServiceV2 featureServiceV2) {
        this.featureServiceV2 = featureServiceV2;
    }

    public boolean isEnabled() {
        try {
            if (FireTabletUtils.isFireOS()) {
                return false;
            }
            VoiceFeature voiceFeature = VoiceFeature.DICTATION_MODE;
            String treatmentAndRecordTrigger = this.featureServiceV2.getTreatmentAndRecordTrigger(voiceFeature.getFeatureNamespace(), voiceFeature.getName(), "C_DEFAULT");
            if (treatmentAndRecordTrigger != null && !"C".equals(treatmentAndRecordTrigger)) {
                if (!"C_DEFAULT".equals(treatmentAndRecordTrigger)) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e) {
            Log.w(TAG, "gate read failed; keeping the voice request", e);
            return false;
        }
    }
}
