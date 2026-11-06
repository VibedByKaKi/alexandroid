package com.amazon.alexa.featurefeedbackservice.localguardrails;

import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.alexa.featurefeedbackservice.storage.SharedPreferenceRepo;
import com.amazon.alexa.featurefeedbackservice.util.ValidationUtils;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.dee.app.services.featureservice.Constants;
import dagger.Lazy;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class LocalGuardrailsManager {
    private static final String TAG = "LocalGuardrailsManager";
    private Lazy<FeatureServiceV2> featureService;
    Map<String, Long> localGuardrailsCache = new HashMap();
    private Lazy<SharedPreferenceRepo> repo;

    @Inject
    public LocalGuardrailsManager(@NonNull Lazy<SharedPreferenceRepo> lazy, @NonNull Lazy<FeatureServiceV2> lazy2) {
        ValidationUtils.validateNonNullLazyObject("repo", lazy);
        ValidationUtils.validateNonNullLazyObject(Constants.KEY_FEATURE_SERVICE, lazy2);
        this.repo = lazy;
        this.featureService = lazy2;
    }

    private boolean forcePassLocalGuardRail() {
        if ("C".equals(this.featureService.get().getTreatmentAndRecordTrigger(com.amazon.alexa.featurefeedbackservice.constants.Constants.FEATURE_GATE_NAMESPACE, com.amazon.alexa.featurefeedbackservice.constants.Constants.FEATURE_GATE_GUARDRAILS, "C"))) {
            return false;
        }
        Log.w(TAG, "ALEXA_FEATURE_FEEDBACK_LOCAL_GUARDRAIL_ANDROID bypass local feature feedback guardrail thru feature gating");
        return true;
    }

    private long getLastPromptTimestamp(@NonNull String str) {
        if (this.localGuardrailsCache.containsKey(str)) {
            return this.localGuardrailsCache.get(str).longValue();
        }
        Long localGuardrailTimestamp = this.repo.get().getLocalGuardrailTimestamp(str);
        long longValue = localGuardrailTimestamp.longValue();
        this.localGuardrailsCache.put(str, localGuardrailTimestamp);
        return longValue;
    }

    public boolean checkAndRecordLocalGuardrail(@NonNull String str, @NonNull long j) {
        if (!shouldPassLocalGuardRail(str, j)) {
            return false;
        }
        updateLastPromptTimestamp(str, System.currentTimeMillis());
        return true;
    }

    public Map<String, Long> getLocalGuardrailsCache() {
        return this.localGuardrailsCache;
    }

    public boolean shouldPassLocalGuardRail(@NonNull String str, @NonNull long j) {
        long j2;
        long currentTimeMillis = System.currentTimeMillis();
        long lastPromptTimestamp = getLastPromptTimestamp(str);
        try {
            j2 = Math.addExact(lastPromptTimestamp, j);
        } catch (ArithmeticException unused) {
            j2 = Long.MAX_VALUE;
        }
        if (currentTimeMillis >= j2) {
            return true;
        }
        Log.i(TAG, String.format("Feature feedback local guardrail is blocking. currentTime: %d, lastShownTime: %d, localMinTimeBetweenPromptsMillis: %d", Long.valueOf(currentTimeMillis), Long.valueOf(lastPromptTimestamp), Long.valueOf(j)));
        return forcePassLocalGuardRail();
    }

    public void updateLastPromptTimestamp(@NonNull String str, @NonNull long j) {
        this.localGuardrailsCache.put(str, Long.valueOf(j));
        this.repo.get().setLocalGuardrailTimestamp(str, Long.valueOf(j));
    }
}
