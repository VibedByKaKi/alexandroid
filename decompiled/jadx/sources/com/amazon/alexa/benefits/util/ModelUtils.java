package com.amazon.alexa.benefits.util;

import com.amazon.alexa.benefits.api.models.DisclaimerInfo;
import com.amazon.alexa.benefits.models.getAllBenefits.BenefitMetadata;
import java.time.Clock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ModelUtils {
    private static final String TAG = "com.amazon.alexa.benefits.util.ModelUtils";

    private ModelUtils() {
    }

    public static DisclaimerInfo translateDisclaimerInfo(BenefitMetadata benefitMetadata, long j, Clock clock) {
        if (benefitMetadata == null) {
            return null;
        }
        return new DisclaimerInfo(benefitMetadata.getDisclaimerVersion(), benefitMetadata.getDisclaimerRenderedDateTime(), TimeUtils.shouldShowDisclaimer(benefitMetadata.getDisclaimerRenderedDateTime(), j, clock));
    }
}
