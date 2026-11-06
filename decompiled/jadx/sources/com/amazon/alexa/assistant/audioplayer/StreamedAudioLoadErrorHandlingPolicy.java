package com.amazon.alexa.assistant.audioplayer;

import androidx.annotation.OptIn;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@OptIn(markerClass = {UnstableApi.class})
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/audioplayer/StreamedAudioLoadErrorHandlingPolicy;", "Landroidx/media3/exoplayer/upstream/DefaultLoadErrorHandlingPolicy;", "<init>", "()V", "getRetryDelayMsFor", "", "loadErrorInfo", "Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy$LoadErrorInfo;", "audioplayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StreamedAudioLoadErrorHandlingPolicy extends DefaultLoadErrorHandlingPolicy {
    @Override // androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public long getRetryDelayMsFor(@NotNull LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        loadErrorInfo.getClass();
        return -9223372036854775807L;
    }
}
