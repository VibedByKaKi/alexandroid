package androidx.datastore.core.okio;

import com.facebook.imageutils.JfifUtil;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.okio.OkioWriteScope", f = "OkioStorage.kt", i = {0, 0, 0}, l = {JfifUtil.MARKER_SOI}, m = "writeData", n = {"$this$use$iv", "handle", "$this$use$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes13.dex */
public final class OkioWriteScope$writeData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OkioWriteScope<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioWriteScope$writeData$1(OkioWriteScope<T> okioWriteScope, Continuation<? super OkioWriteScope$writeData$1> continuation) {
        super(continuation);
        this.this$0 = okioWriteScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.writeData(null, this);
    }
}
