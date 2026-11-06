package com.amazon.alexa.assistant.capability.externalmediaplayer;

import com.amazon.alexa.assistant.capability.externalmediaplayer.model.PlaybackControlAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/ExternalMediaPlayerControlActionListener;", "", "onPlayerControlAction", "", "action", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction;", "playerId", "", "(Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/PlaybackControlAction;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ExternalMediaPlayerControlActionListener {
    @Nullable
    Object onPlayerControlAction(@NotNull PlaybackControlAction playbackControlAction, @NotNull String str, @NotNull Continuation<? super Unit> continuation);
}
