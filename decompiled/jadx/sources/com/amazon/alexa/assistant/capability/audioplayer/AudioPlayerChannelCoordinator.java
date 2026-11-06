package com.amazon.alexa.assistant.capability.audioplayer;

import com.amazon.alexa.assistant.capability.audioactivitytracker.model.AudioActivityTrackable;
import com.amazon.alexa.assistant.foundation.audio.AudioItem;
import com.amazon.alexa.assistant.toolkit.lifecycle.LifecycleComponent;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\nH&J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0016\u001a\u00020\nH&R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerChannelCoordinator;", "Lcom/amazon/alexa/assistant/toolkit/lifecycle/LifecycleComponent;", "Lcom/amazon/alexa/assistant/capability/audioactivitytracker/model/AudioActivityTrackable;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerChannelCoordinatorListener;", "getListener", "()Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerChannelCoordinatorListener;", "setListener", "(Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerChannelCoordinatorListener;)V", "start", "", "stop", "clearAll", "clearEnqueued", "updateProgressReportInterval", "offsetInMillis", "", "enqueueItem", "audioItem", "Lcom/amazon/alexa/assistant/foundation/audio/AudioItem;", "replaceAllWithItem", "replaceEnqueuedWithItem", "stopItem", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface AudioPlayerChannelCoordinator extends LifecycleComponent, AudioActivityTrackable {
    void clearAll();

    void clearEnqueued();

    void enqueueItem(@NotNull AudioItem audioItem);

    @Nullable
    AudioPlayerChannelCoordinatorListener getListener();

    void replaceAllWithItem(@NotNull AudioItem audioItem);

    void replaceEnqueuedWithItem(@NotNull AudioItem audioItem);

    void setListener(@Nullable AudioPlayerChannelCoordinatorListener audioPlayerChannelCoordinatorListener);

    @Override // com.amazon.alexa.assistant.toolkit.lifecycle.Startable
    void start();

    @Override // com.amazon.alexa.assistant.toolkit.lifecycle.Stoppable
    void stop();

    void stopItem();

    void updateProgressReportInterval(int offsetInMillis);
}
