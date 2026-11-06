package com.amazon.alexa.capabilityagent.deviceproximity.common.util;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/capabilityagent/deviceproximity/common/util/FeatureChecker;", "", "client", "Lcom/amazon/alexa/protocols/service/api/LazyComponent;", "Lcom/amazon/alexa/featureservice/api/FeatureServiceV2;", "<init>", "(Lcom/amazon/alexa/protocols/service/api/LazyComponent;)V", "isFeatureSupported", "", "featureName", "", "Companion", "AlexaMobileAndroidCapabilityAgent-DeviceProximity_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FeatureChecker {

    @NotNull
    public static final String FEATURE_NAMESPACE = "ZEPHYR_MOBILE";

    @NotNull
    private final LazyComponent<FeatureServiceV2> client;

    @Inject
    public FeatureChecker(@NotNull LazyComponent<FeatureServiceV2> lazyComponent) {
        lazyComponent.getClass();
        this.client = lazyComponent;
    }

    public final boolean isFeatureSupported(@NotNull String featureName) {
        featureName.getClass();
        try {
            return Intrinsics.areEqual(this.client.get().getTreatmentAndRecordTrigger("ZEPHYR_MOBILE", featureName, "C"), "T1");
        } catch (Exception e) {
            Logger.INSTANCE.log(5, "Failed to check feature: ".concat(featureName), e);
            return false;
        }
    }
}
