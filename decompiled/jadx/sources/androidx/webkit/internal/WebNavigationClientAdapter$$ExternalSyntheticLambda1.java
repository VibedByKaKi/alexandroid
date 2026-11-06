package androidx.webkit.internal;

import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class WebNavigationClientAdapter$$ExternalSyntheticLambda1 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ WebViewNavigationBoundaryInterface f$0;

    public /* synthetic */ WebNavigationClientAdapter$$ExternalSyntheticLambda1(WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface, int i) {
        this.$r8$classId = i;
        this.f$0 = webViewNavigationBoundaryInterface;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object lambda$onNavigationStarted$0;
        Object lambda$onNavigationRedirected$1;
        Object lambda$onNavigationCompleted$2;
        int i = this.$r8$classId;
        WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface = this.f$0;
        switch (i) {
            case 0:
                lambda$onNavigationStarted$0 = WebNavigationClientAdapter.lambda$onNavigationStarted$0(webViewNavigationBoundaryInterface);
                return lambda$onNavigationStarted$0;
            case 1:
                lambda$onNavigationRedirected$1 = WebNavigationClientAdapter.lambda$onNavigationRedirected$1(webViewNavigationBoundaryInterface);
                return lambda$onNavigationRedirected$1;
            default:
                lambda$onNavigationCompleted$2 = WebNavigationClientAdapter.lambda$onNavigationCompleted$2(webViewNavigationBoundaryInterface);
                return lambda$onNavigationCompleted$2;
        }
    }
}
