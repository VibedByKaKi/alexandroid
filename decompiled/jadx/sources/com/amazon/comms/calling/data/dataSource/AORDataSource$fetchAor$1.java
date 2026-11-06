package com.amazon.comms.calling.data.dataSource;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.comms.calling.data.dataSource.AORDataSource", f = "AORDataSource.kt", i = {0}, l = {55}, m = "fetchAor", n = {"this"}, s = {"L$0"})
/* loaded from: classes20.dex */
public final class AORDataSource$fetchAor$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AORDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AORDataSource$fetchAor$1(AORDataSource aORDataSource, Continuation<? super AORDataSource$fetchAor$1> continuation) {
        super(continuation);
        this.this$0 = aORDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object fetchAor;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fetchAor = this.this$0.fetchAor(this);
        return fetchAor;
    }
}
