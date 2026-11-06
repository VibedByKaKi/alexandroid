package kotlinx.coroutines.reactive;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a2\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0086H¢\u0006\u0002\u0010\u0006\u001a(\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nH\u0001\u001a(\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¨\u0006\f"}, d2 = {"collect", "", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/reactivestreams/Publisher;", "action", "Lkotlin/Function1;", "(Lorg/reactivestreams/Publisher;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toChannel", "Lkotlinx/coroutines/channels/ReceiveChannel;", MissingTokenPull.TRIGGER_REQUEST, "", "openSubscription", "kotlinx-coroutines-reactive"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channel.kt\nkotlinx/coroutines/reactive/ChannelKt\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,107:1\n160#2:108\n94#2,3:109\n161#2,2:112\n101#2:114\n97#2,3:115\n94#2,3:118\n161#2,2:121\n101#2:123\n97#2,3:124\n*S KotlinDebug\n*F\n+ 1 Channel.kt\nkotlinx/coroutines/reactive/ChannelKt\n*L\n15#1:108\n15#1:109,3\n15#1:112,2\n15#1:114\n15#1:115,3\n15#1:118,3\n15#1:121,2\n15#1:123\n15#1:124,3\n*E\n"})
/* loaded from: classes10.dex */
public final class ChannelKt {
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:15:0x0064, B:17:0x006c, B:33:0x0079), top: B:14:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079 A[Catch: all -> 0x0076, TRY_LEAVE, TryCatch #0 {all -> 0x0076, blocks: (B:15:0x0064, B:17:0x006c, B:33:0x0079), top: B:14:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0060 -> B:13:0x0038). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object collect(@org.jetbrains.annotations.NotNull org.reactivestreams.Publisher<T> r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.reactive.ChannelKt$collect$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.reactive.ChannelKt$collect$1 r0 = (kotlinx.coroutines.reactive.ChannelKt$collect$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.reactive.ChannelKt$collect$1 r0 = new kotlinx.coroutines.reactive.ChannelKt$collect$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3c
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L3a
            r5 = r0
            r0 = r7
            r7 = r2
        L38:
            r2 = r5
            goto L64
        L3a:
            r6 = move-exception
            goto L8e
        L3c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r6)
            return r4
        L42:
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = 0
            kotlinx.coroutines.channels.ReceiveChannel r6 = toChannel$default(r6, r8, r3, r4)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L8a
            r5 = r8
            r8 = r6
            r6 = r5
        L51:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L87
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L87
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L87
            r0.label = r3     // Catch: java.lang.Throwable -> L87
            java.lang.Object r2 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L87
            if (r2 != r1) goto L60
            return r1
        L60:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L38
        L64:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L76
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L76
            if (r8 == 0) goto L79
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L76
            r7.invoke(r8)     // Catch: java.lang.Throwable -> L76
            r8 = r0
            r0 = r2
            goto L51
        L76:
            r6 = move-exception
            r7 = r0
            goto L8e
        L79:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L76
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r4)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L87:
            r6 = move-exception
            r7 = r8
            goto L8e
        L8a:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L8e:
            throw r6     // Catch: java.lang.Throwable -> L8f
        L8f:
            r8 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.ChannelKt.collect(org.reactivestreams.Publisher, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final <T> Object collect$$forInline(Publisher<T> publisher, Function1<? super T, Unit> function1, Continuation<? super Unit> continuation) {
        ReceiveChannel channel$default = toChannel$default(publisher, 0, 1, null);
        try {
            ChannelIterator it2 = channel$default.iterator();
            while (true) {
                InlineMarker.mark(3);
                InlineMarker.mark(0);
                Object hasNext = it2.hasNext(null);
                InlineMarker.mark(1);
                if (!((Boolean) hasNext).booleanValue()) {
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                    ChannelsKt.cancelConsumed(channel$default, null);
                    InlineMarker.finallyEnd(1);
                    return Unit.INSTANCE;
                }
                function1.invoke((Object) it2.next());
            }
        } finally {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Transforming publisher to channel is deprecated, use asFlow() instead")
    public static final /* synthetic */ ReceiveChannel openSubscription(Publisher publisher, int i) {
        SubscriptionChannel subscriptionChannel = new SubscriptionChannel(i);
        publisher.subscribe(subscriptionChannel);
        return subscriptionChannel;
    }

    public static /* synthetic */ ReceiveChannel openSubscription$default(Publisher publisher, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return openSubscription(publisher, i);
    }

    @PublishedApi
    @NotNull
    public static final <T> ReceiveChannel<T> toChannel(@NotNull Publisher<T> publisher, int i) {
        SubscriptionChannel subscriptionChannel = new SubscriptionChannel(i);
        publisher.subscribe(subscriptionChannel);
        return subscriptionChannel;
    }

    public static /* synthetic */ ReceiveChannel toChannel$default(Publisher publisher, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return toChannel(publisher, i);
    }
}
