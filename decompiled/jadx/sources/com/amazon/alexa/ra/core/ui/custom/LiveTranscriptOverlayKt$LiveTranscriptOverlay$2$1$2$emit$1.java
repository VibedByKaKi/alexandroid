package com.amazon.alexa.ra.core.ui.custom;

import com.amazon.alexa.ra.core.ui.custom.LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.alexa.ra.core.ui.custom.LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1$2", f = "LiveTranscriptOverlay.kt", i = {0}, l = {211}, m = "emit", n = {"this"}, s = {"L$0"})
/* loaded from: classes18.dex */
public final class LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1$2$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1.AnonymousClass2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1$2$emit$1(LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1.AnonymousClass2<? super T> anonymousClass2, Continuation<? super LiveTranscriptOverlayKt$LiveTranscriptOverlay$2$1$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(0, this);
    }
}
