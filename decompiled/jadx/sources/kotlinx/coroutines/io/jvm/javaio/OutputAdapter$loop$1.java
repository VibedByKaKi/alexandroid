package kotlinx.coroutines.io.jvm.javaio;

import kotlin.Metadata;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u0094@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"kotlinx/coroutines/io/jvm/javaio/OutputAdapter$loop$1", "Lkotlinx/coroutines/io/jvm/javaio/BlockingAdapter;", "loop", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-io"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes10.dex */
public final class OutputAdapter$loop$1 extends BlockingAdapter {
    final /* synthetic */ Job $parent;
    final /* synthetic */ OutputAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutputAdapter$loop$1(OutputAdapter outputAdapter, Job job, Job job2) {
        super(job2);
        this.this$0 = outputAdapter;
        this.$parent = job;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0102, code lost:
    
        if (r2.writeFully((byte[]) r10, r6, r7, r0) == r1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0082, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x002c, B:16:0x0057, B:17:0x0062, B:19:0x0068, B:20:0x007a, B:21:0x007c, B:31:0x008f, B:32:0x0092, B:34:0x009c, B:39:0x00a2, B:48:0x00c5, B:50:0x00cb, B:53:0x00e2, B:54:0x00e3, B:56:0x00e7, B:23:0x0084, B:63:0x0070, B:65:0x0076, B:67:0x0105, B:68:0x010c, B:69:0x0031, B:70:0x0035, B:74:0x0048, B:77:0x004d, B:78:0x0051), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x002c, B:16:0x0057, B:17:0x0062, B:19:0x0068, B:20:0x007a, B:21:0x007c, B:31:0x008f, B:32:0x0092, B:34:0x009c, B:39:0x00a2, B:48:0x00c5, B:50:0x00cb, B:53:0x00e2, B:54:0x00e3, B:56:0x00e7, B:23:0x0084, B:63:0x0070, B:65:0x0076, B:67:0x0105, B:68:0x010c, B:69:0x0031, B:70:0x0035, B:74:0x0048, B:77:0x004d, B:78:0x0051), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x002c, B:16:0x0057, B:17:0x0062, B:19:0x0068, B:20:0x007a, B:21:0x007c, B:31:0x008f, B:32:0x0092, B:34:0x009c, B:39:0x00a2, B:48:0x00c5, B:50:0x00cb, B:53:0x00e2, B:54:0x00e3, B:56:0x00e7, B:23:0x0084, B:63:0x0070, B:65:0x0076, B:67:0x0105, B:68:0x010c, B:69:0x0031, B:70:0x0035, B:74:0x0048, B:77:0x004d, B:78:0x0051), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x002c, B:16:0x0057, B:17:0x0062, B:19:0x0068, B:20:0x007a, B:21:0x007c, B:31:0x008f, B:32:0x0092, B:34:0x009c, B:39:0x00a2, B:48:0x00c5, B:50:0x00cb, B:53:0x00e2, B:54:0x00e3, B:56:0x00e7, B:23:0x0084, B:63:0x0070, B:65:0x0076, B:67:0x0105, B:68:0x010c, B:69:0x0031, B:70:0x0035, B:74:0x0048, B:77:0x004d, B:78:0x0051), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x002c, B:16:0x0057, B:17:0x0062, B:19:0x0068, B:20:0x007a, B:21:0x007c, B:31:0x008f, B:32:0x0092, B:34:0x009c, B:39:0x00a2, B:48:0x00c5, B:50:0x00cb, B:53:0x00e2, B:54:0x00e3, B:56:0x00e7, B:23:0x0084, B:63:0x0070, B:65:0x0076, B:67:0x0105, B:68:0x010c, B:69:0x0031, B:70:0x0035, B:74:0x0048, B:77:0x004d, B:78:0x0051), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0082 A[EDGE_INSN: B:60:0x0082->B:61:0x0082 BREAK  A[LOOP:1: B:21:0x007c->B:59:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0070 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x002c, B:16:0x0057, B:17:0x0062, B:19:0x0068, B:20:0x007a, B:21:0x007c, B:31:0x008f, B:32:0x0092, B:34:0x009c, B:39:0x00a2, B:48:0x00c5, B:50:0x00cb, B:53:0x00e2, B:54:0x00e3, B:56:0x00e7, B:23:0x0084, B:63:0x0070, B:65:0x0076, B:67:0x0105, B:68:0x010c, B:69:0x0031, B:70:0x0035, B:74:0x0048, B:77:0x004d, B:78:0x0051), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00e0 -> B:15:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00e5 -> B:15:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0102 -> B:15:0x0056). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.io.jvm.javaio.BlockingAdapter
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loop(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.io.jvm.javaio.OutputAdapter$loop$1.loop(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
