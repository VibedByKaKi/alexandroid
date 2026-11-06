package com.amazon.alexa.matter.commissioner;

import androidx.annotation.NonNull;
import com.amazon.alexa.matter.eventbus.schema.SetupPayload;
import matter.onboardingpayload.OnboardingPayload;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class OnboardingPayloadAdapter {
    private OnboardingPayloadAdapter() {
    }

    @NonNull
    public static SetupPayload toSetupPayload(@NonNull OnboardingPayload onboardingPayload) {
        SetupPayload setupPayload = new SetupPayload();
        setupPayload.setDiscriminator(onboardingPayload.getDiscriminator());
        setupPayload.setShortDiscriminator(onboardingPayload.getHasShortDiscriminator());
        int vendorId = onboardingPayload.getVendorId();
        setupPayload.setVendorID(vendorId != 0 ? Long.valueOf(vendorId) : null);
        int productId = onboardingPayload.getProductId();
        setupPayload.setProductID(productId != 0 ? Long.valueOf(productId) : null);
        setupPayload.setSetUpPINCode(onboardingPayload.getSetupPinCode());
        setupPayload.setVersion(onboardingPayload.getVersion());
        return setupPayload;
    }
}
