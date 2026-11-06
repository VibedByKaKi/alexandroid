package com.amazon.alexa.client.alexaservice.features.iocomponent.stateproviders;

import com.amazon.alexa.client.alexaservice.features.iocomponent.SessionState;
import java.util.List;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface TrustedStatesProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum UnlockMethod {
        SECURE_UNKNOWN,
        SECURE_FACE,
        SECURE_PIN,
        SECURE_GESTURE,
        SECURE_THUMBPRINT,
        SECURE_IRIS,
        NONE
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum UnlockState {
        NEVER_UNLOCKED,
        LOCKED,
        UNLOCKED
    }

    @Nullable
    String getLastTimeInUnlockedState();

    List<SessionState> getSessionStates();

    @Nullable
    UnlockMethod getUnlockMethod();

    UnlockState getUnlockState();
}
