package com.amazon.alexa.assistant.foundation.audio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/AudioPlayableTaskBuilder;", "", "playbackTask", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlayableTask;", "audioItem", "Lcom/amazon/alexa/assistant/foundation/audio/AudioItem;", "(Lcom/amazon/alexa/assistant/foundation/audio/AudioItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamedPlaybackTask", "item", "Lcom/amazon/alexa/assistant/foundation/audio/StreamedAudioItem;", "(Lcom/amazon/alexa/assistant/foundation/audio/StreamedAudioItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface AudioPlayableTaskBuilder {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object streamedPlaybackTask(@NotNull AudioPlayableTaskBuilder audioPlayableTaskBuilder, @NotNull StreamedAudioItem streamedAudioItem, @NotNull Continuation<? super AudioPlayableTask> continuation) {
            throw new UnsupportedOperationException("streamedPlaybackTask is not implemented by this builder");
        }
    }

    @Nullable
    Object playbackTask(@NotNull AudioItem audioItem, @NotNull Continuation<? super AudioPlayableTask> continuation);

    @Nullable
    Object streamedPlaybackTask(@NotNull StreamedAudioItem streamedAudioItem, @NotNull Continuation<? super AudioPlayableTask> continuation);
}
