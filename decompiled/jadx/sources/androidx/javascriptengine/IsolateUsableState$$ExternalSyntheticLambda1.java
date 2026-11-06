package androidx.javascriptengine;

import android.content.res.AssetFileDescriptor;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class IsolateUsableState$$ExternalSyntheticLambda1 implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ IsolateUsableState f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ IsolateUsableState$$ExternalSyntheticLambda1(IsolateUsableState isolateUsableState, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = isolateUsableState;
        this.f$1 = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object lambda$evaluateJavaScriptAsync$1;
        Object lambda$evaluateJavaScriptAsync$0;
        Object lambda$evaluateJavaScriptAsync$4;
        switch (this.$r8$classId) {
            case 0:
                lambda$evaluateJavaScriptAsync$1 = this.f$0.lambda$evaluateJavaScriptAsync$1((AssetFileDescriptor) this.f$1, completer);
                return lambda$evaluateJavaScriptAsync$1;
            case 1:
                lambda$evaluateJavaScriptAsync$0 = this.f$0.lambda$evaluateJavaScriptAsync$0((String) this.f$1, completer);
                return lambda$evaluateJavaScriptAsync$0;
            default:
                lambda$evaluateJavaScriptAsync$4 = this.f$0.lambda$evaluateJavaScriptAsync$4((byte[]) this.f$1, completer);
                return lambda$evaluateJavaScriptAsync$4;
        }
    }
}
