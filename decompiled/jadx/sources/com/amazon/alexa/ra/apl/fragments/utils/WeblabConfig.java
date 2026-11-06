package com.amazon.alexa.ra.apl.fragments.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.mosaic.services.feature.Feature;
import com.amazon.alexa.mosaic.services.feature.FeatureManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/apl/fragments/utils/WeblabConfig;", "", "featureManager", "Lcom/amazon/alexa/mosaic/services/feature/FeatureManager;", "<init>", "(Lcom/amazon/alexa/mosaic/services/feature/FeatureManager;)V", "isLightBoxEnabled", "", "()Z", "AVSMobileFramework-ra-apl-fragment-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class WeblabConfig {
    public static final int $stable = 0;
    private final boolean isLightBoxEnabled;

    public WeblabConfig(@NotNull FeatureManager featureManager) {
        featureManager.getClass();
        this.isLightBoxEnabled = featureManager.isEnabled(Feature.APL_ANDROID_LIGHTBOX);
    }

    /* renamed from: isLightBoxEnabled, reason: from getter */
    public final boolean getIsLightBoxEnabled() {
        return this.isLightBoxEnabled;
    }
}
