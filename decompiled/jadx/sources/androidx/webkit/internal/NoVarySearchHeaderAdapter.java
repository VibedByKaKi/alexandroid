package androidx.webkit.internal;

import androidx.webkit.NoVarySearchHeader;
import java.util.List;
import org.chromium.support_lib_boundary.NoVarySearchDataBoundaryInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class NoVarySearchHeaderAdapter implements NoVarySearchDataBoundaryInterface {
    private final NoVarySearchHeader mImpl;

    public NoVarySearchHeaderAdapter(NoVarySearchHeader noVarySearchHeader) {
        this.mImpl = noVarySearchHeader;
    }

    @Override // org.chromium.support_lib_boundary.NoVarySearchDataBoundaryInterface
    public List<String> getConsideredQueryParameters() {
        return this.mImpl.consideredQueryParameters;
    }

    @Override // org.chromium.support_lib_boundary.NoVarySearchDataBoundaryInterface
    public boolean getIgnoreDifferencesInParameters() {
        return this.mImpl.ignoreDifferencesInParameters;
    }

    @Override // org.chromium.support_lib_boundary.NoVarySearchDataBoundaryInterface
    public List<String> getIgnoredQueryParameters() {
        return this.mImpl.ignoredQueryParameters;
    }

    @Override // org.chromium.support_lib_boundary.NoVarySearchDataBoundaryInterface
    public boolean getVaryOnKeyOrder() {
        return this.mImpl.varyOnKeyOrder;
    }
}
