package com.amazon.alexa.assistant.capability.speechrecognizer.model.speechProvider;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/PlaybackLifecycleListener;", "", "onPlaybackStarted", "", "onPlaybackStopped", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PlaybackLifecycleListener {
    void onPlaybackStarted();

    void onPlaybackStopped();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onPlaybackStarted(@NotNull PlaybackLifecycleListener playbackLifecycleListener) {
        }

        public static void onPlaybackStopped(@NotNull PlaybackLifecycleListener playbackLifecycleListener) {
        }
    }
}
