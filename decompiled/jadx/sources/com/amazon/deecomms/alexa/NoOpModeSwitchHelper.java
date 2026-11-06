package com.amazon.deecomms.alexa;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class NoOpModeSwitchHelper implements ModeSwitchHelper {
    @Override // com.amazon.deecomms.alexa.ModeSwitchHelper
    public boolean isMultiModalMode() {
        return false;
    }

    @Override // com.amazon.deecomms.alexa.ModeSwitchHelper
    public boolean isTabletMode() {
        return true;
    }

    @Override // com.amazon.deecomms.alexa.ModeSwitchHelper
    public void detectAndReactToBackgroundModeSwitch() {
    }

    @Override // com.amazon.deecomms.alexa.ModeSwitchHelper
    public void transitionToMultiModalMode(String str) {
    }

    @Override // com.amazon.deecomms.alexa.ModeSwitchHelper
    public void transitionToTabletMode(String str) {
    }
}
