package com.amazon.alexa.voice.wakeword;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.voice.features.ExperimentalFeatures;
import com.amazon.alexa.voice.features.VoiceFeature;
import com.amazon.alexa.voice.metrics.VoxMetricEvent;
import com.amazon.alexa.voice.metrics.VoxMetricEventName;
import com.amazon.alexa.voice.metrics.VoxMetricEventProcessingService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WakeWordSegmentDisabler {
    private static final String KEY_LIVE_MODE_DISABLE_APPLIED = "ww_experiment_live_mode_disable_applied";
    private static final String KEY_S2_DISABLE_APPLIED = "ww_experiment_s2_disable_applied";
    private static final String LIVE_MODE_I18N = "ALEXA_VOX_ANDROID_LIVE_MODE_I18N";
    private static final String LIVE_MODE_ONLY_INGRESS = "ALEXA_VOX_ANDROID_LIVE_MODE_ONLY_INGRESS";
    private static final String NAMESPACE = "AVSAndroid";
    private static final String PREFS_FILE = "user_wakeword_prefs";
    private static final String RA_BACKGROUND_MODE = "ALEXA_VOX_ANDROID_RA_BACKGROUND_MODE";
    private static final String TAG = "WakeWordSegmentDisabler";
    private static final String TREATMENT_T1 = "T1";
    private static final String TREATMENT_T2 = "T2";
    private final FeatureServiceV2 featureServiceV2;
    private String liveModeTreatment;
    private boolean liveModeTriggerRecorded;
    private final SharedPreferences sharedPreferences;
    private final VoxMetricEventProcessingService voxMetricEventProcessingService;
    private final WakewordPreference wakewordPreference;

    public WakeWordSegmentDisabler(FeatureServiceV2 featureServiceV2, WakewordPreference wakewordPreference, VoxMetricEventProcessingService voxMetricEventProcessingService, Context context) {
        this.featureServiceV2 = featureServiceV2;
        this.wakewordPreference = wakewordPreference;
        this.voxMetricEventProcessingService = voxMetricEventProcessingService;
        this.sharedPreferences = context.getSharedPreferences(PREFS_FILE, 0);
    }

    private boolean alreadyApplied() {
        return this.sharedPreferences.getBoolean(KEY_S2_DISABLE_APPLIED, false);
    }

    private boolean hasAccess(VoiceFeature voiceFeature) {
        return this.featureServiceV2.hasAccess(voiceFeature.getFeatureNamespace(), voiceFeature.getName(), false);
    }

    private boolean hasLiveMode() {
        return this.featureServiceV2.hasAccess("AVSAndroid", "ALEXA_VOX_ANDROID_RA_BACKGROUND_MODE", false) || this.featureServiceV2.hasAccess("AVSAndroid", "ALEXA_VOX_ANDROID_LIVE_MODE_I18N", false);
    }

    private boolean isWeblabActive() {
        return hasAccess(VoiceFeature.WW_EXPERIMENT_S2_1) || hasAccess(VoiceFeature.WW_EXPERIMENT_S2_2);
    }

    private boolean liveModeDisableApplied() {
        return this.sharedPreferences.getBoolean(KEY_LIVE_MODE_DISABLE_APPLIED, false);
    }

    private void markApplied() {
        AppLaunchChecker$$ExternalSyntheticOutline0.m(this.sharedPreferences, KEY_S2_DISABLE_APPLIED, true);
    }

    private void markLiveModeApplied() {
        AppLaunchChecker$$ExternalSyntheticOutline0.m(this.sharedPreferences, KEY_LIVE_MODE_DISABLE_APPLIED, true);
    }

    private String resolveLiveModeTreatment() {
        if (!this.liveModeTriggerRecorded) {
            this.liveModeTreatment = this.featureServiceV2.getTreatmentAndRecordTrigger("AVSAndroid", ExperimentalFeatures.ALEXA_VOX_ANDROID_WW_DISABLE_LIVE_MODE.getName(), "C_DEFAULT");
            this.liveModeTriggerRecorded = true;
        }
        return this.liveModeTreatment;
    }

    private boolean treatmentDisablesWakeword(String str) {
        if ("T2".equals(str)) {
            return true;
        }
        return "T1".equals(str) && !this.featureServiceV2.hasAccess("AVSAndroid", "ALEXA_VOX_ANDROID_LIVE_MODE_ONLY_INGRESS", false);
    }

    public void applyIfNeeded() {
        if (!alreadyApplied() && isWeblabActive() && this.wakewordPreference.isWakewordEnabled()) {
            this.wakewordPreference.enableWakeword(false);
            markApplied();
            this.voxMetricEventProcessingService.process(VoxMetricEvent.occurNow(VoxMetricEventName.VOX_WW_DISABLED_S2_INACTIVE));
            Log.i(TAG, "Wakeword disabled for Segment 2 inactive user");
        }
    }

    public synchronized void applyLiveModeDisableIfNeeded() {
        if (liveModeDisableApplied()) {
            return;
        }
        if (hasLiveMode()) {
            if (this.wakewordPreference.isWakewordEnabled()) {
                String resolveLiveModeTreatment = resolveLiveModeTreatment();
                if (treatmentDisablesWakeword(resolveLiveModeTreatment)) {
                    this.wakewordPreference.enableWakeword(false);
                    markLiveModeApplied();
                    this.voxMetricEventProcessingService.process(VoxMetricEvent.occurNow("VOX_WW_DISABLED_LIVE_MODE:" + resolveLiveModeTreatment));
                    Log.i(TAG, "Wakeword disabled for Live Mode experiment, treatment=" + resolveLiveModeTreatment);
                }
            }
        }
    }

    public synchronized boolean willDisableLiveModeWakewordAfterFtue() {
        boolean z;
        if (!liveModeDisableApplied() && hasLiveMode()) {
            z = treatmentDisablesWakeword(resolveLiveModeTreatment());
        }
        return z;
    }
}
