package kotlinx.coroutines.io.jvm.javaio;

import kotlin.Metadata;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u0094@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"kotlinx/coroutines/io/jvm/javaio/InputAdapter$loop$1", "Lkotlinx/coroutines/io/jvm/javaio/BlockingAdapter;", "loop", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-io"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes10.dex */
public final class InputAdapter$loop$1 extends BlockingAdapter {
    final /* synthetic */ Job $parent;
    final /* synthetic */ InputAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputAdapter$loop$1(InputAdapter inputAdapter, Job job, Job job2) {
        super(job2);
        this.this$0 = inputAdapter;
        this.$parent = job;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
    
        if (r2 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        java.util.concurrent.locks.LockSupport.unpark(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        if (r2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        if (r2 != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
    
        r2 = r10;
        r10 = r11;
        r11 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c0 -> B:15:0x00c1). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.io.jvm.javaio.BlockingAdapter
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loop(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.io.jvm.javaio.InputAdapter$loop$1.loop(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
