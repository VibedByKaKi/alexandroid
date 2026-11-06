package com.amazon.alexa.client.alexaservice.features.bmclentitlement;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class BMCLEntitlementUpdateEvent extends Event.NotGated {
    public static BMCLEntitlementUpdateEvent create(boolean z, @Nullable String str) {
        return create(z, str, null);
    }

    @Nullable
    public abstract String getEntitledBenefit();

    @Nullable
    public abstract List<String> getPremiumBenefitLabels();

    public abstract boolean isBMCLEntitled();

    public static BMCLEntitlementUpdateEvent create(boolean z, @Nullable String str, @Nullable List<String> list) {
        return new AutoValue_BMCLEntitlementUpdateEvent(z, str, list);
    }
}
