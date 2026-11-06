package com.amazon.alexa.hho.navigation.transit.location;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.alexa.hho.navigation.transit.location.LocationTrackingManagerV2", f = "LocationTrackingManagerV2.kt", i = {0, 0}, l = {117}, m = "subscribeWithRetry", n = {"this", "index"}, s = {"L$0", "I$1"})
/* loaded from: classes13.dex */
public final class LocationTrackingManagerV2$subscribeWithRetry$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LocationTrackingManagerV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationTrackingManagerV2$subscribeWithRetry$1(LocationTrackingManagerV2 locationTrackingManagerV2, Continuation<? super LocationTrackingManagerV2$subscribeWithRetry$1> continuation) {
        super(continuation);
        this.this$0 = locationTrackingManagerV2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object subscribeWithRetry;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        subscribeWithRetry = this.this$0.subscribeWithRetry(this);
        return subscribeWithRetry;
    }
}
