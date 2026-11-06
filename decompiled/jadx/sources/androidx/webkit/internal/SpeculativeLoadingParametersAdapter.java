package androidx.webkit.internal;

import androidx.webkit.NoVarySearchHeader;
import androidx.webkit.SpeculativeLoadingParameters;
import java.lang.reflect.InvocationHandler;
import java.util.HashMap;
import java.util.Map;
import org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class SpeculativeLoadingParametersAdapter implements SpeculativeLoadingParametersBoundaryInterface {
    private final SpeculativeLoadingParameters mSpeculativeLoadingParameters;

    public SpeculativeLoadingParametersAdapter(SpeculativeLoadingParameters speculativeLoadingParameters) {
        this.mSpeculativeLoadingParameters = speculativeLoadingParameters;
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public Map<String, String> getAdditionalHeaders() {
        SpeculativeLoadingParameters speculativeLoadingParameters = this.mSpeculativeLoadingParameters;
        return speculativeLoadingParameters == null ? new HashMap() : speculativeLoadingParameters.getAdditionalHeaders();
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public InvocationHandler getNoVarySearchData() {
        NoVarySearchHeader expectedNoVarySearchData;
        SpeculativeLoadingParameters speculativeLoadingParameters = this.mSpeculativeLoadingParameters;
        if (speculativeLoadingParameters == null || (expectedNoVarySearchData = speculativeLoadingParameters.getExpectedNoVarySearchData()) == null) {
            return null;
        }
        return BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new NoVarySearchHeaderAdapter(expectedNoVarySearchData));
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public boolean isJavaScriptEnabled() {
        SpeculativeLoadingParameters speculativeLoadingParameters = this.mSpeculativeLoadingParameters;
        if (speculativeLoadingParameters == null) {
            return false;
        }
        return speculativeLoadingParameters.isJavaScriptEnabled();
    }
}
