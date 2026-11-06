package androidx.webkit.internal;

import androidx.webkit.Page;
import org.chromium.support_lib_boundary.WebViewPageBoundaryInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class PageImpl implements Page {
    private final WebViewPageBoundaryInterface mPageBoundaryInterface;

    public PageImpl(WebViewPageBoundaryInterface webViewPageBoundaryInterface) {
        this.mPageBoundaryInterface = webViewPageBoundaryInterface;
    }
}
