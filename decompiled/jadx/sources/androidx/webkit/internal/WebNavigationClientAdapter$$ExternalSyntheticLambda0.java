package androidx.webkit.internal;

import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewPageBoundaryInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class WebNavigationClientAdapter$$ExternalSyntheticLambda0 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ WebViewPageBoundaryInterface f$0;

    public /* synthetic */ WebNavigationClientAdapter$$ExternalSyntheticLambda0(WebViewPageBoundaryInterface webViewPageBoundaryInterface, int i) {
        this.$r8$classId = i;
        this.f$0 = webViewPageBoundaryInterface;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object lambda$onFirstContentfulPaint$6;
        Object lambda$onPageDeleted$3;
        Object lambda$onPageLoadEventFired$4;
        Object lambda$onPageDOMContentLoadedEventFired$5;
        int i = this.$r8$classId;
        WebViewPageBoundaryInterface webViewPageBoundaryInterface = this.f$0;
        switch (i) {
            case 0:
                lambda$onFirstContentfulPaint$6 = WebNavigationClientAdapter.lambda$onFirstContentfulPaint$6(webViewPageBoundaryInterface);
                return lambda$onFirstContentfulPaint$6;
            case 1:
                lambda$onPageDeleted$3 = WebNavigationClientAdapter.lambda$onPageDeleted$3(webViewPageBoundaryInterface);
                return lambda$onPageDeleted$3;
            case 2:
                lambda$onPageLoadEventFired$4 = WebNavigationClientAdapter.lambda$onPageLoadEventFired$4(webViewPageBoundaryInterface);
                return lambda$onPageLoadEventFired$4;
            default:
                lambda$onPageDOMContentLoadedEventFired$5 = WebNavigationClientAdapter.lambda$onPageDOMContentLoadedEventFired$5(webViewPageBoundaryInterface);
                return lambda$onPageDOMContentLoadedEventFired$5;
        }
    }
}
