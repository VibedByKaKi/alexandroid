package com.amazon.alexa.assistant.capability.speechrecognizer.voicechat;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.LivePreviewBundleKeys;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.DeterministicCommandMatcher", f = "DeterministicCommandMatcher.kt", i = {0, 0}, l = {31}, m = "match", n = {"this", LivePreviewBundleKeys.TRANSCRIPT}, s = {"L$0", "L$1"})
/* loaded from: classes15.dex */
public final class DeterministicCommandMatcher$match$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeterministicCommandMatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeterministicCommandMatcher$match$1(DeterministicCommandMatcher deterministicCommandMatcher, Continuation<? super DeterministicCommandMatcher$match$1> continuation) {
        super(continuation);
        this.this$0 = deterministicCommandMatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.match(null, this);
    }
}
