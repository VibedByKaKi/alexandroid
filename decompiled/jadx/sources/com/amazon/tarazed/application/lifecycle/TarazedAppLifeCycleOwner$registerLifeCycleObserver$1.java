package com.amazon.tarazed.application.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleOwner", f = "TarazedAppLifeCycleOwner.kt", i = {0}, l = {40}, m = "registerLifeCycleObserver$TarazedAndroidLibrary_release", n = {"this"}, s = {"L$0"})
/* loaded from: classes17.dex */
public final class TarazedAppLifeCycleOwner$registerLifeCycleObserver$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TarazedAppLifeCycleOwner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TarazedAppLifeCycleOwner$registerLifeCycleObserver$1(TarazedAppLifeCycleOwner tarazedAppLifeCycleOwner, Continuation<? super TarazedAppLifeCycleOwner$registerLifeCycleObserver$1> continuation) {
        super(continuation);
        this.this$0 = tarazedAppLifeCycleOwner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.registerLifeCycleObserver$TarazedAndroidLibrary_release(this);
    }
}
