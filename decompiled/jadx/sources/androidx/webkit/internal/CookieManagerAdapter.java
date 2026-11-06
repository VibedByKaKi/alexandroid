package androidx.webkit.internal;

import java.util.List;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class CookieManagerAdapter {
    private final WebViewCookieManagerBoundaryInterface mBoundaryInterface;

    public CookieManagerAdapter(WebViewCookieManagerBoundaryInterface webViewCookieManagerBoundaryInterface) {
        this.mBoundaryInterface = webViewCookieManagerBoundaryInterface;
    }

    public List<String> getCookieInfo(String str) {
        return this.mBoundaryInterface.getCookieInfo(str);
    }
}
