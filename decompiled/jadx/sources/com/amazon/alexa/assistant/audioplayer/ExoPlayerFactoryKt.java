package com.amazon.alexa.assistant.audioplayer;

import androidx.annotation.OptIn;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.util.UnstableApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0001\u001a\b\u0010\u0002\u001a\u00020\u0001H\u0001¨\u0006\u0003"}, d2 = {"assistantAudioAttributes", "Landroidx/media3/common/AudioAttributes;", "voiceCommunicationAudioAttributes", "audioplayer_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ExoPlayerFactoryKt {
    @OptIn(markerClass = {UnstableApi.class})
    @NotNull
    public static final AudioAttributes assistantAudioAttributes() {
        AudioAttributes build = new AudioAttributes.Builder().setContentType(1).setUsage(16).build();
        build.getClass();
        return build;
    }

    @OptIn(markerClass = {UnstableApi.class})
    @NotNull
    public static final AudioAttributes voiceCommunicationAudioAttributes() {
        AudioAttributes build = new AudioAttributes.Builder().setContentType(1).setUsage(2).build();
        build.getClass();
        return build;
    }
}
