package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
abstract class NaturalTurnController {
    protected static final NaturalTurnControllerConfiguration DEFAULT_PARCELABLE_VALUE = null;
    protected static final NaturalTurnSessionState DEFAULT_STATE_VALUE = null;

    public abstract NaturalTurnControllerConfiguration getConfiguration();

    public abstract NaturalTurnSessionState getState();

    public abstract void muteSession(NaturalTurnSession naturalTurnSession);

    public abstract void onSessionDenied(NaturalTurnSessionDeniedReason naturalTurnSessionDeniedReason);

    public abstract void startSession(NaturalTurnSession naturalTurnSession);

    public abstract void stopSession(NaturalTurnSession naturalTurnSession);

    public abstract void unmuteSession(NaturalTurnSession naturalTurnSession);
}
