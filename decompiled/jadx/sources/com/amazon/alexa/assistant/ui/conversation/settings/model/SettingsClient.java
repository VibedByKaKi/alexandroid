package com.amazon.alexa.assistant.ui.conversation.settings.model;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\bJ\u000e\u0010\u000b\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\bJ\u000e\u0010\r\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0006H&¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/settings/model/SettingsClient;", "", "fetchFollowUpMode", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateFollowUpMode", "", "enabled", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchBriefMode", "updateBriefMode", "fetchWhisperMode", "updateWhisperMode", "fetchAdaptiveVolume", "updateAdaptiveVolume", "reset", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface SettingsClient {
    @Nullable
    Object fetchAdaptiveVolume(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object fetchBriefMode(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object fetchFollowUpMode(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object fetchWhisperMode(@NotNull Continuation<? super Boolean> continuation);

    void reset();

    @Nullable
    Object updateAdaptiveVolume(boolean z, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object updateBriefMode(boolean z, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object updateFollowUpMode(boolean z, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object updateWhisperMode(boolean z, @NotNull Continuation<? super Unit> continuation);
}
