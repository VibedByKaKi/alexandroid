package com.amazon.photos.uploader.internal.workers;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.photos.uploader.internal.workers.BaseWorker", f = "BaseWorker.kt", i = {0}, l = {105}, m = "onNotificationUpdate$suspendImpl", n = {"$this"}, s = {"L$0"})
/* loaded from: classes5.dex */
public final class BaseWorker$onNotificationUpdate$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BaseWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWorker$onNotificationUpdate$1(BaseWorker baseWorker, Continuation<? super BaseWorker$onNotificationUpdate$1> continuation) {
        super(continuation);
        this.this$0 = baseWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BaseWorker.onNotificationUpdate$suspendImpl(this.this$0, 0, this);
    }
}
