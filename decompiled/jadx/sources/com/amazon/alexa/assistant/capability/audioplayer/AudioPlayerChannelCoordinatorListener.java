package com.amazon.alexa.assistant.capability.audioplayer;

import com.amazon.alexa.assistant.foundation.audio.AudioPlayableTask;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J(\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\u0011\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerChannelCoordinatorListener;", "", "progressReportDelayElapsed", "", "task", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlayableTask;", "offsetInMilliseconds", "", "progressReportIntervalElapsed", "elapsedTimeInMilliseconds", "progressReportIntervalUpdated", "playbackTaskDidStart", "playbackTaskDidFinish", "nextTaskAvailable", "", "playbackDidStop", "playbackDidFail", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "playbackDidPause", "playbackDidStutter", "playableTaskIsNearlyFinished", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface AudioPlayerChannelCoordinatorListener {
    void playableTaskIsNearlyFinished(@NotNull AudioPlayableTask task, long offsetInMilliseconds);

    void playbackDidFail(@NotNull AudioPlayableTask task, long offsetInMilliseconds, @Nullable Exception error);

    void playbackDidPause(@NotNull AudioPlayableTask task);

    void playbackDidStop(@NotNull AudioPlayableTask task, long offsetInMilliseconds);

    void playbackDidStutter(@NotNull AudioPlayableTask task);

    void playbackTaskDidFinish(@NotNull AudioPlayableTask task, boolean nextTaskAvailable);

    void playbackTaskDidStart(@NotNull AudioPlayableTask task);

    void progressReportDelayElapsed(@NotNull AudioPlayableTask task, long offsetInMilliseconds);

    void progressReportIntervalElapsed(@NotNull AudioPlayableTask task, long elapsedTimeInMilliseconds);

    void progressReportIntervalUpdated(@NotNull AudioPlayableTask task, long offsetInMilliseconds);
}
