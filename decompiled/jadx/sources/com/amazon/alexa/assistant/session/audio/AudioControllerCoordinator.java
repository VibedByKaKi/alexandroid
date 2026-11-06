package com.amazon.alexa.assistant.session.audio;

import com.amazon.alexa.assistant.foundation.model.AudioControllerConfiguration;
import com.amazon.alexa.assistant.toolkit.lifecycle.LifecycleComponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0006H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/session/audio/AudioControllerCoordinator;", "Lcom/amazon/alexa/assistant/toolkit/lifecycle/LifecycleComponent;", "isExternalMediaPlaying", "", "()Z", "requestAudioFocus", "", "configuration", "Lcom/amazon/alexa/assistant/foundation/model/AudioControllerConfiguration;", "releaseAudioFocus", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface AudioControllerCoordinator extends LifecycleComponent {
    boolean isExternalMediaPlaying();

    void releaseAudioFocus();

    void requestAudioFocus(@NotNull AudioControllerConfiguration configuration);
}
