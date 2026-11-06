package androidx.webkit.internal;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(29)
/* loaded from: classes14.dex */
public class WebViewRenderProcessClientFrameworkAdapter extends WebViewRenderProcessClient {
    private final androidx.webkit.WebViewRenderProcessClient mWebViewRenderProcessClient;

    public WebViewRenderProcessClientFrameworkAdapter(androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient) {
        this.mWebViewRenderProcessClient = webViewRenderProcessClient;
    }

    public androidx.webkit.WebViewRenderProcessClient getFrameworkRenderProcessClient() {
        return this.mWebViewRenderProcessClient;
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.mWebViewRenderProcessClient.onRenderProcessResponsive(webView, WebViewRenderProcessImpl.forFrameworkObject(webViewRenderProcess));
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.mWebViewRenderProcessClient.onRenderProcessUnresponsive(webView, WebViewRenderProcessImpl.forFrameworkObject(webViewRenderProcess));
    }
}
