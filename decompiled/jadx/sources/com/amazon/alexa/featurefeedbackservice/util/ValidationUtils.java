package com.amazon.alexa.featurefeedbackservice.util;

import androidx.annotation.NonNull;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.featurefeedbackservice.api.utils.Utils;
import com.amazon.alexa.featurefeedbackservice.cache.ConfigCache;
import com.amazon.alexa.featurefeedbackservice.localguardrails.LocalGuardrailsManager;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.dee.app.services.featureservice.Constants;
import dagger.Lazy;
import defpackage.a$$ExternalSyntheticOutline0;
import java.security.InvalidParameterException;
import org.bouncycastle.asn1.ocsp.CrlID$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ValidationUtils {
    private static final String TAG = "ValidationUtils";

    private ValidationUtils() {
    }

    public static boolean isFeatureEligible(@NonNull Lazy<ConfigCache> lazy, @NonNull Lazy<FeatureServiceV2> lazy2, @NonNull String str) {
        validateNonNullLazyObject("configCache", lazy);
        validateNonNullLazyObject(Constants.KEY_FEATURE_SERVICE, lazy2);
        Utils.validateNonEmptyString("featureName", str);
        if ("C".equals(lazy2.get().getTreatmentAndRecordTrigger(com.amazon.alexa.featurefeedbackservice.constants.Constants.FEATURE_GATE_NAMESPACE, com.amazon.alexa.featurefeedbackservice.constants.Constants.FEATURE_GATE_ENABLED, "C"))) {
            return false;
        }
        return lazy.get().isEligible(str);
    }

    public static boolean isFeatureEligibleAfterLocalGuardrails(@NonNull String str, @NonNull Lazy<LocalGuardrailsManager> lazy, @NonNull Lazy<ConfigCache> lazy2) {
        validateNonNullLazyObject("localGuardrailsManager", lazy);
        validateNonNullLazyObject("configCache", lazy2);
        Utils.validateNonEmptyString("featureName", str);
        return lazy.get().checkAndRecordLocalGuardrail(str, lazy2.get().getLocalMinTimeBetweenPromptsMillis(str));
    }

    public static <T> void validateNonNullLazyObject(String str, Lazy<T> lazy) {
        if (Utils.isEmptyString(str)) {
            CrlID$$ExternalSyntheticBUOutline0.m$8("name cannot be null or empty");
        } else if (lazy == null || lazy.get() == null) {
            throw new InvalidParameterException(a$$ExternalSyntheticOutline0.m("Lazy object ", str, " cannot be null"));
        }
    }

    public static <T> void validateNonNullObject(String str, T t) {
        if (Utils.isEmptyString(str)) {
            CrlID$$ExternalSyntheticBUOutline0.m$8("name cannot be null or empty");
        } else if (t == null) {
            throw new InvalidParameterException(BitVector$$ExternalSyntheticOutline0.m(str, " cannot be null"));
        }
    }
}
