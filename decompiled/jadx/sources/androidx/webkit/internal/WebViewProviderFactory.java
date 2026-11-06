package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewStartUpConfig;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public interface WebViewProviderFactory {
    WebViewProviderBoundaryInterface createWebView(WebView webView);

    DropDataContentProviderBoundaryInterface getDropDataProvider();

    ProfileStoreBoundaryInterface getProfileStore();

    ProxyControllerBoundaryInterface getProxyController();

    ServiceWorkerControllerBoundaryInterface getServiceWorkerController();

    StaticsBoundaryInterface getStatics();

    TracingControllerBoundaryInterface getTracingController();

    WebViewBuilderBoundaryInterface getWebViewBuilder();

    String[] getWebViewFeatures();

    WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter();

    void startUpWebView(WebViewStartUpConfig webViewStartUpConfig, WebViewCompat.WebViewStartUpCallback webViewStartUpCallback);
}
