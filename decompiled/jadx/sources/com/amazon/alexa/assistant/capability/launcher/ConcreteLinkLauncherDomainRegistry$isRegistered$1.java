package com.amazon.alexa.assistant.capability.launcher;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry", f = "LinkLauncherDomainRegistry.kt", i = {0, 0, 0}, l = {102}, m = "isRegistered", n = {"this", "domain", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes15.dex */
public final class ConcreteLinkLauncherDomainRegistry$isRegistered$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConcreteLinkLauncherDomainRegistry this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConcreteLinkLauncherDomainRegistry$isRegistered$1(ConcreteLinkLauncherDomainRegistry concreteLinkLauncherDomainRegistry, Continuation<? super ConcreteLinkLauncherDomainRegistry$isRegistered$1> continuation) {
        super(continuation);
        this.this$0 = concreteLinkLauncherDomainRegistry;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.isRegistered(null, this);
    }
}
