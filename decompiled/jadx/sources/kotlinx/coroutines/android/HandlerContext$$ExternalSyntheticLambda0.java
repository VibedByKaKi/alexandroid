package kotlinx.coroutines.android;

import androidx.datastore.core.MulticastFileObserver;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DisposableHandle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class HandlerContext$$ExternalSyntheticLambda0 implements DisposableHandle {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ HandlerContext$$ExternalSyntheticLambda0(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        switch (this.$r8$classId) {
            case 0:
                HandlerContext.invokeOnTimeout$lambda$3((HandlerContext) this.f$0, (Runnable) this.f$1);
                break;
            default:
                MulticastFileObserver.Companion.observe$lambda$4((String) this.f$0, (Function1) this.f$1);
                break;
        }
    }
}
