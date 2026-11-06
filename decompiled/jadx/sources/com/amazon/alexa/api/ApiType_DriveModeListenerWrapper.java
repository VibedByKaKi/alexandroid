package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_DriveModeListenerWrapper extends DriveModeListener implements AlexaDriveModeListener {
    private final AlexaDriveModeListener alexaDriveModeListener;

    public ApiType_DriveModeListenerWrapper(AlexaDriveModeListener alexaDriveModeListener) {
        this.alexaDriveModeListener = alexaDriveModeListener;
    }

    @Override // com.amazon.alexa.api.DriveModeListener, com.amazon.alexa.api.AlexaDriveModeListener
    public void onDriveModeEnabled(boolean z) {
        this.alexaDriveModeListener.onDriveModeEnabled(z);
    }

    @Override // com.amazon.alexa.api.DriveModeListener, com.amazon.alexa.api.AlexaDriveModeListener
    public void onDriveModeState(DriveModeState driveModeState) {
        this.alexaDriveModeListener.onDriveModeState(driveModeState);
    }

    @Override // com.amazon.alexa.api.DriveModeListener, com.amazon.alexa.api.AlexaDriveModeListener
    public void onDriveModeThemeChanged(boolean z) {
        this.alexaDriveModeListener.onDriveModeThemeChanged(z);
    }
}
