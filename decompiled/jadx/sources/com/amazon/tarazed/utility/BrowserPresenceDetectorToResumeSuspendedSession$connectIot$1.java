package com.amazon.tarazed.utility;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.tarazed.utility.BrowserPresenceDetectorToResumeSuspendedSession", f = "BrowserPresenceDetectorToResumeSuspendedSession.kt", i = {0, 1}, l = {80, 82}, m = "connectIot$TarazedAndroidLibrary_release", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes19.dex */
public final class BrowserPresenceDetectorToResumeSuspendedSession$connectIot$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BrowserPresenceDetectorToResumeSuspendedSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserPresenceDetectorToResumeSuspendedSession$connectIot$1(BrowserPresenceDetectorToResumeSuspendedSession browserPresenceDetectorToResumeSuspendedSession, Continuation<? super BrowserPresenceDetectorToResumeSuspendedSession$connectIot$1> continuation) {
        super(continuation);
        this.this$0 = browserPresenceDetectorToResumeSuspendedSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.connectIot$TarazedAndroidLibrary_release(this);
    }
}
