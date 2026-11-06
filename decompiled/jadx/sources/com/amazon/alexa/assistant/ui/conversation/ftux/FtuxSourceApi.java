package com.amazon.alexa.assistant.ui.conversation.ftux;

import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\n\u0010\r\u001a\u0004\u0018\u00010\bH&J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0010\u0010\u0006J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0012\u0010\u0006J\b\u0010\u0013\u001a\u00020\nH&J\u000e\u0010\u0014\u001a\u00020\nH¦@¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxSourceApi;", "", "hasCompletedLocally", "", "profileId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolvePath", "Lcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxPath;", "warm", "", "requiredFtuxExperience", "Lcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxExperience;", "resolvedPath", "setFtuxCompleted", "Lkotlin/Result;", "setFtuxCompleted-gIAlu-s", "markCompletedLocally", "markCompletedLocally-gIAlu-s", "resetInMemory", MetricsConstants.Method.CACHE_CLEAR, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface FtuxSourceApi {
    @Nullable
    Object clear(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object hasCompletedLocally(@NotNull String str, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    /* renamed from: markCompletedLocally-gIAlu-s, reason: not valid java name */
    Object mo15153markCompletedLocallygIAlus(@NotNull String str, @NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    Object requiredFtuxExperience(@NotNull String str, @NotNull Continuation<? super FtuxExperience> continuation);

    void resetInMemory();

    @Nullable
    Object resolvePath(@NotNull String str, @NotNull Continuation<? super FtuxPath> continuation);

    @Nullable
    FtuxPath resolvedPath();

    @Nullable
    /* renamed from: setFtuxCompleted-gIAlu-s, reason: not valid java name */
    Object mo15154setFtuxCompletedgIAlus(@NotNull String str, @NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    Object warm(@NotNull String str, @NotNull Continuation<? super Unit> continuation);
}
