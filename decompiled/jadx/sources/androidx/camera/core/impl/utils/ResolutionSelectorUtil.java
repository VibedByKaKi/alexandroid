package androidx.camera.core.impl.utils;

import androidx.annotation.Nullable;
import androidx.camera.core.resolutionselector.ResolutionSelector;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class ResolutionSelectorUtil {
    private ResolutionSelectorUtil() {
    }

    @Nullable
    public static ResolutionSelector overrideResolutionSelectors(@Nullable ResolutionSelector resolutionSelector, @Nullable ResolutionSelector resolutionSelector2) {
        if (resolutionSelector2 == null) {
            return resolutionSelector;
        }
        if (resolutionSelector == null) {
            return resolutionSelector2;
        }
        ResolutionSelector.Builder fromResolutionSelector = ResolutionSelector.Builder.fromResolutionSelector(resolutionSelector);
        if (resolutionSelector2.getAspectRatioStrategy() != null) {
            fromResolutionSelector.setAspectRatioStrategy(resolutionSelector2.getAspectRatioStrategy());
        }
        if (resolutionSelector2.getResolutionStrategy() != null) {
            fromResolutionSelector.setResolutionStrategy(resolutionSelector2.getResolutionStrategy());
        }
        if (resolutionSelector2.getResolutionFilter() != null) {
            fromResolutionSelector.setResolutionFilter(resolutionSelector2.getResolutionFilter());
        }
        if (resolutionSelector2.getAllowedResolutionMode() != 0) {
            fromResolutionSelector.setAllowedResolutionMode(resolutionSelector2.getAllowedResolutionMode());
        }
        return fromResolutionSelector.build();
    }
}
