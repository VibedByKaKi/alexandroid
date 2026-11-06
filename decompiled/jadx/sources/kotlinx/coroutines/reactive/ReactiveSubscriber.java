package kotlinx.coroutines.reactive;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.alexa.mobilytics.event.metadata.EventMetadataType;
import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0086@¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\u0012\u0010\u0017\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\rH\u0016J\u0006\u0010\u001c\u001a\u00020\u0013J\u0006\u0010\u001d\u001a\u00020\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/reactive/ReactiveSubscriber;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lorg/reactivestreams/Subscriber;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "requestSize", "", "<init>", "(ILkotlinx/coroutines/channels/BufferOverflow;J)V", EventMetadataType.SUBSCRIPTION, "Lorg/reactivestreams/Subscription;", "channel", "Lkotlinx/coroutines/channels/Channel;", "takeNextOrNull", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onNext", "", "value", "(Ljava/lang/Object;)V", "onComplete", "onError", "t", "", "onSubscribe", CmcdData.Factory.STREAMING_FORMAT_SS, "makeRequest", "cancel", "kotlinx-coroutines-reactive"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactiveFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactiveFlow.kt\nkotlinx/coroutines/reactive/ReactiveSubscriber\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,269:1\n1#2:270\n516#3:271\n*S KotlinDebug\n*F\n+ 1 ReactiveFlow.kt\nkotlinx/coroutines/reactive/ReactiveSubscriber\n*L\n127#1:271\n*E\n"})
/* loaded from: classes10.dex */
final class ReactiveSubscriber<T> implements Subscriber<T> {

    @NotNull
    private final Channel<T> channel;
    private final long requestSize;
    private Subscription subscription;

    public ReactiveSubscriber(int i, @NotNull BufferOverflow bufferOverflow, long j) {
        this.requestSize = j;
        this.channel = kotlinx.coroutines.channels.ChannelKt.Channel$default(i == 0 ? 1 : i, bufferOverflow, null, 4, null);
    }

    public final void cancel() {
        Subscription subscription = this.subscription;
        if (subscription == null) {
            Intrinsics.throwUninitializedPropertyAccessException(EventMetadataType.SUBSCRIPTION);
            subscription = null;
        }
        subscription.cancel();
    }

    public final void makeRequest() {
        Subscription subscription = this.subscription;
        if (subscription == null) {
            Intrinsics.throwUninitializedPropertyAccessException(EventMetadataType.SUBSCRIPTION);
            subscription = null;
        }
        subscription.request(this.requestSize);
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        SendChannel.DefaultImpls.close$default(this.channel, null, 1, null);
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(@Nullable Throwable t) {
        this.channel.close(t);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(@NotNull T value) {
        if (ChannelResult.m26833isSuccessimpl(this.channel.mo8097trySendJP2dKIU(value))) {
            return;
        }
        StringBuilder sb = new StringBuilder("Element ");
        sb.append(value);
        CodecsKt$$ExternalSyntheticBUOutline0.m((Object) " was not added to channel because it was full, ", (Object) this.channel, sb);
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(@NotNull Subscription s) {
        this.subscription = s;
        makeRequest();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object takeNextOrNull(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1 r0 = (kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1 r0 = new kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            kotlin.ResultKt.throwOnFailure(r5)
            kotlinx.coroutines.channels.ChannelResult r5 = (kotlinx.coroutines.channels.ChannelResult) r5
            java.lang.Object r4 = r5.getHolder()
            goto L44
        L2f:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r4)
        L34:
            r4 = 0
            return r4
        L36:
            kotlin.ResultKt.throwOnFailure(r5)
            kotlinx.coroutines.channels.Channel<T> r4 = r4.channel
            r0.label = r3
            java.lang.Object r4 = r4.mo26817receiveCatchingJP2dKIU(r0)
            if (r4 != r1) goto L44
            return r1
        L44:
            java.lang.Throwable r5 = kotlinx.coroutines.channels.ChannelResult.m26827exceptionOrNullimpl(r4)
            if (r5 != 0) goto L53
            boolean r5 = r4 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r5 == 0) goto L52
            kotlinx.coroutines.channels.ChannelResult.m26827exceptionOrNullimpl(r4)
            goto L34
        L52:
            return r4
        L53:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.ReactiveSubscriber.takeNextOrNull(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
