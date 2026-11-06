package androidx.webkit.internal;

import androidx.webkit.SpeculativeLoadingConfig;
import org.chromium.support_lib_boundary.SpeculativeLoadingConfigBoundaryInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class SpeculativeLoadingConfigAdapter implements SpeculativeLoadingConfigBoundaryInterface {
    private final SpeculativeLoadingConfig mSpeculativeLoadingConfig;

    public SpeculativeLoadingConfigAdapter(SpeculativeLoadingConfig speculativeLoadingConfig) {
        this.mSpeculativeLoadingConfig = speculativeLoadingConfig;
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingConfigBoundaryInterface
    public int getMaxPrefetches() {
        return this.mSpeculativeLoadingConfig.getMaxPrefetches();
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingConfigBoundaryInterface
    public int getMaxPrerenders() {
        return this.mSpeculativeLoadingConfig.getMaxPrerenders();
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingConfigBoundaryInterface
    public int getPrefetchTTLSeconds() {
        return this.mSpeculativeLoadingConfig.getPrefetchTtlSeconds();
    }
}
