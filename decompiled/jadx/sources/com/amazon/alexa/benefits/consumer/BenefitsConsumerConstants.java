package com.amazon.alexa.benefits.consumer;

import android.content.Context;
import com.amazon.alexa.benefits.api.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class BenefitsConsumerConstants {
    public static final String COLUMN_BENEFIT = "benefit";
    public static final String COLUMN_ENTITLEMENT_STATUS = "entitlementStatus";
    public static final String MOBILYTICS_ID = "mobilytics-owner";
    public static final String PATH_PEEK_BENEFITS = "peekBenefitsEntitlement";
    public static final String SCHEME = "content";

    private BenefitsConsumerConstants() {
    }

    public static String getAuthority(Context context) {
        return context.getString(R.string.benefitsServiceProviderId);
    }
}
