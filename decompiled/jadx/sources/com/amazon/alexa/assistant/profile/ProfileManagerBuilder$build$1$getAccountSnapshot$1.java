package com.amazon.alexa.assistant.profile;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.alexa.assistant.profile.ProfileManagerBuilder$build$1", f = "ProfileManagerBuilder.kt", i = {}, l = {47}, m = "getAccountSnapshot", n = {}, s = {})
/* loaded from: classes15.dex */
public final class ProfileManagerBuilder$build$1$getAccountSnapshot$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProfileManagerBuilder$build$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileManagerBuilder$build$1$getAccountSnapshot$1(ProfileManagerBuilder$build$1 profileManagerBuilder$build$1, Continuation<? super ProfileManagerBuilder$build$1$getAccountSnapshot$1> continuation) {
        super(continuation);
        this.this$0 = profileManagerBuilder$build$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAccountSnapshot(this);
    }
}
