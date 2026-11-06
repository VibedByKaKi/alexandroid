package com.amazon.alexa.assistant.media;

import com.amazon.alexa.assistant.toolkit.lifecycle.LifecycleComponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/media/MediaPlaybackProviderCoordinator;", "Lcom/amazon/alexa/assistant/toolkit/lifecycle/LifecycleComponent;", "start", "", "stop", "registerDelegate", "delegate", "Lcom/amazon/alexa/assistant/media/MediaPlaybackDelegate;", "deregisterDelegate", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface MediaPlaybackProviderCoordinator extends LifecycleComponent {
    void deregisterDelegate(@NotNull MediaPlaybackDelegate delegate);

    void registerDelegate(@NotNull MediaPlaybackDelegate delegate);

    @Override // com.amazon.alexa.assistant.toolkit.lifecycle.Startable
    void start();

    void stop();
}
