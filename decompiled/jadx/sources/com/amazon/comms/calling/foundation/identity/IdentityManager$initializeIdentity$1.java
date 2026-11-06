package com.amazon.comms.calling.foundation.identity;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.comms.calling.foundation.identity.IdentityManager", f = "IdentityManager.kt", i = {0}, l = {27}, m = "initializeIdentity", n = {"this"}, s = {"L$0"})
/* loaded from: classes20.dex */
public final class IdentityManager$initializeIdentity$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ IdentityManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityManager$initializeIdentity$1(IdentityManager identityManager, Continuation<? super IdentityManager$initializeIdentity$1> continuation) {
        super(continuation);
        this.this$0 = identityManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.initializeIdentity(this);
    }
}
