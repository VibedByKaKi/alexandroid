package com.amazon.comms.calling.domain.usecase;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.comms.calling.domain.usecase.RegisterSipUseCase", f = "RegisterSipUseCase.kt", i = {}, l = {22}, m = "execute", n = {}, s = {})
/* loaded from: classes20.dex */
public final class RegisterSipUseCase$execute$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RegisterSipUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterSipUseCase$execute$1(RegisterSipUseCase registerSipUseCase, Continuation<? super RegisterSipUseCase$execute$1> continuation) {
        super(continuation);
        this.this$0 = registerSipUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute((RegisterSipParams) null, (Continuation<? super Unit>) this);
    }
}
