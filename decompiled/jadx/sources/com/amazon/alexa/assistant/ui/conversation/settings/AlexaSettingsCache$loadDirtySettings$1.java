package com.amazon.alexa.assistant.ui.conversation.settings;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.alexa.assistant.ui.conversation.settings.AlexaSettingsCache", f = "AlexaSettingsCache.kt", i = {}, l = {101}, m = "loadDirtySettings", n = {}, s = {})
/* loaded from: classes17.dex */
public final class AlexaSettingsCache$loadDirtySettings$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AlexaSettingsCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlexaSettingsCache$loadDirtySettings$1(AlexaSettingsCache alexaSettingsCache, Continuation<? super AlexaSettingsCache$loadDirtySettings$1> continuation) {
        super(continuation);
        this.this$0 = alexaSettingsCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadDirtySettings(this);
    }
}
