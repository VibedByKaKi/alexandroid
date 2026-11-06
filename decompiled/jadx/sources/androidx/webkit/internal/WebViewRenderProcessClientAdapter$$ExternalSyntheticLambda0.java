package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.webkit.WebViewRenderProcess;
import androidx.webkit.WebViewRenderProcessClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class WebViewRenderProcessClientAdapter$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ WebViewRenderProcessClient f$0;
    public final /* synthetic */ WebView f$1;
    public final /* synthetic */ WebViewRenderProcess f$2;

    public /* synthetic */ WebViewRenderProcessClientAdapter$$ExternalSyntheticLambda0(WebViewRenderProcessClient webViewRenderProcessClient, WebView webView, WebViewRenderProcessImpl webViewRenderProcessImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = webViewRenderProcessClient;
        this.f$1 = webView;
        this.f$2 = webViewRenderProcessImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.onRenderProcessResponsive(this.f$1, this.f$2);
                break;
            default:
                this.f$0.onRenderProcessUnresponsive(this.f$1, this.f$2);
                break;
        }
    }
}
