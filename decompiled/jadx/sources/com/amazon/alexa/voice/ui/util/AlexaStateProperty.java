package com.amazon.alexa.voice.ui.util;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AlexaStateProperty extends BaseProperty {
    private volatile boolean hasValue;
    private volatile AlexaState value;

    public AlexaStateProperty(AlexaState alexaState) {
        this.value = alexaState;
        this.hasValue = true;
    }

    public void clear() {
        this.hasValue = false;
        notifyChanged();
    }

    public AlexaState get() {
        if (this.hasValue) {
            return this.value;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Property does not hold any value");
        return null;
    }

    public boolean hasValue() {
        return this.hasValue;
    }

    public void set(AlexaState alexaState) {
        if (this.hasValue && this.value == alexaState) {
            return;
        }
        this.value = alexaState;
        this.hasValue = true;
        notifyChanged();
    }

    public AlexaStateProperty() {
    }

    public AlexaState get(AlexaState alexaState) {
        return this.hasValue ? this.value : alexaState;
    }
}
