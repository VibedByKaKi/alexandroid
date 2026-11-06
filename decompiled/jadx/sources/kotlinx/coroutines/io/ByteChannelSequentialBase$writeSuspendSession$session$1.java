package kotlinx.coroutines.io;

import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.amazon.alexa.presence.service.PresenceJobService;
import com.amazon.mobile.heremapsexplore.Constants.ReactProperties;
import kotlin.Metadata;
import kotlinx.io.core.IoBuffer;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0019\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"kotlinx/coroutines/io/ByteChannelSequentialBase$writeSuspendSession$session$1", "Lkotlinx/coroutines/io/WriterSuspendSession;", PresenceJobService.ACTION_REFRESH_FLUSH_KEY, "", MissingTokenPull.TRIGGER_REQUEST, "Lkotlinx/io/core/IoBuffer;", ReactProperties.GEOFENCE_MINIMUM_RANGE, "", "tryAwait", "n", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "written", "kotlinx-coroutines-io"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes10.dex */
public final class ByteChannelSequentialBase$writeSuspendSession$session$1 implements WriterSuspendSession {
    final /* synthetic */ ByteChannelSequentialBase this$0;

    public ByteChannelSequentialBase$writeSuspendSession$session$1(ByteChannelSequentialBase byteChannelSequentialBase) {
        this.this$0 = byteChannelSequentialBase;
    }

    @Override // kotlinx.coroutines.io.WriterSession
    public void flush() {
        this.this$0.flush();
    }

    @Override // kotlinx.coroutines.io.WriterSession
    @Nullable
    public IoBuffer request(int min) {
        if (this.this$0.getAvailableForWrite() == 0) {
            return null;
        }
        return this.this$0.getWritable().prepareWriteHead(min);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.io.WriterSuspendSession
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object tryAwait(int r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.io.ByteChannelSequentialBase$writeSuspendSession$session$1$tryAwait$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.io.ByteChannelSequentialBase$writeSuspendSession$session$1$tryAwait$1 r0 = (kotlinx.coroutines.io.ByteChannelSequentialBase$writeSuspendSession$session$1$tryAwait$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.io.ByteChannelSequentialBase$writeSuspendSession$session$1$tryAwait$1 r0 = new kotlinx.coroutines.io.ByteChannelSequentialBase$writeSuspendSession$session$1$tryAwait$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 != r4) goto L39
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.io.Condition r5 = (kotlinx.coroutines.io.Condition) r5
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.io.ByteChannelSequentialBase$writeSuspendSession$session$1 r5 = (kotlinx.coroutines.io.ByteChannelSequentialBase$writeSuspendSession$session$1) r5
            boolean r5 = r7 instanceof kotlin.Result.Failure
            if (r5 != 0) goto L34
            goto Lb9
        L34:
            kotlin.Result$Failure r7 = (kotlin.Result.Failure) r7
            java.lang.Throwable r5 = r7.exception
            throw r5
        L39:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r5)
            return r3
        L3f:
            boolean r2 = r7 instanceof kotlin.Result.Failure
            if (r2 != 0) goto Lbc
            kotlinx.coroutines.io.ByteChannelSequentialBase r7 = r5.this$0
            int r7 = r7.getAvailableForWrite()
            if (r7 >= r6) goto Lb9
            kotlinx.coroutines.io.ByteChannelSequentialBase r7 = r5.this$0
            kotlinx.coroutines.io.ByteChannelSequentialBase.access$setWaitingForSize$p(r7, r6)
            kotlinx.coroutines.io.ByteChannelSequentialBase r7 = r5.this$0
            kotlinx.coroutines.io.Condition r7 = kotlinx.coroutines.io.ByteChannelSequentialBase.access$getAtLeastNBytesAvailableForWrite$p(r7)
            kotlin.jvm.functions.Function0 r2 = r7.getPredicate()
            java.lang.Object r2 = r2.invoke()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L69
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            goto Lb9
        L69:
            r0.L$0 = r5
            r0.I$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.io.Condition.access$getUpdater$cp()
        L75:
            boolean r6 = r5.compareAndSet(r7, r3, r0)
            if (r6 == 0) goto Lae
            kotlin.jvm.functions.Function0 r5 = r7.getPredicate()
            java.lang.Object r5 = r5.invoke()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L9e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.io.Condition.access$getUpdater$cp()
        L8f:
            boolean r6 = r5.compareAndSet(r7, r0, r3)
            if (r6 == 0) goto L98
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            goto La2
        L98:
            java.lang.Object r6 = r5.get(r7)
            if (r6 == r0) goto L8f
        L9e:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
        La2:
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r5 != r6) goto Lab
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        Lab:
            if (r5 != r1) goto Lb9
            return r1
        Lae:
            java.lang.Object r6 = r5.get(r7)
            if (r6 != 0) goto Lb5
            goto L75
        Lb5:
            com.here.time.Duration$$ExternalSyntheticBUOutline0.m$1()
            return r3
        Lb9:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        Lbc:
            kotlin.Result$Failure r7 = (kotlin.Result.Failure) r7
            java.lang.Throwable r5 = r7.exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.io.ByteChannelSequentialBase$writeSuspendSession$session$1.tryAwait(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.io.WriterSession
    public void written(int n) {
        this.this$0.getWritable().afterHeadWrite();
        this.this$0.afterWrite();
    }
}
