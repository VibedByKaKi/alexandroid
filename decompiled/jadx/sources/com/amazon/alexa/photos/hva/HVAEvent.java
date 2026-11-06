package com.amazon.alexa.photos.hva;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public enum HVAEvent {
    STARTED_OUT_BOUND("highValueActivity::started"),
    ENDED_OUT_BOUND("highValueActivity::ended");

    private final String value;

    HVAEvent(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
