package androidx.webkit.internal;

import android.webkit.ValueCallback;
import androidx.webkit.PrerenderOperationCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class WebViewProviderAdapter$$ExternalSyntheticLambda0 implements ValueCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PrerenderOperationCallback f$0;

    public /* synthetic */ WebViewProviderAdapter$$ExternalSyntheticLambda0(PrerenderOperationCallback prerenderOperationCallback, int i) {
        this.$r8$classId = i;
        this.f$0 = prerenderOperationCallback;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i = this.$r8$classId;
        PrerenderOperationCallback prerenderOperationCallback = this.f$0;
        switch (i) {
            case 0:
                prerenderOperationCallback.onPrerenderActivated();
                break;
            case 1:
                WebViewProviderAdapter.lambda$prerenderUrlAsync$3(prerenderOperationCallback, (Throwable) obj);
                break;
            case 2:
                prerenderOperationCallback.onPrerenderActivated();
                break;
            default:
                WebViewProviderAdapter.lambda$prerenderUrlAsync$1(prerenderOperationCallback, (Throwable) obj);
                break;
        }
    }
}
