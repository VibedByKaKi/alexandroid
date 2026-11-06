package com.amazon.alexa.voice.ui.util;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class BooleanProperty extends BaseProperty {
    private volatile boolean hasValue;
    private volatile boolean value;

    public BooleanProperty(boolean z) {
        this.value = z;
        this.hasValue = true;
    }

    public void clear() {
        this.hasValue = false;
        notifyChanged();
    }

    public boolean get() {
        if (this.hasValue) {
            return this.value;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Property does not hold any value");
        return false;
    }

    public boolean hasValue() {
        return this.hasValue;
    }

    public void set(boolean z) {
        if (this.hasValue && this.value == z) {
            return;
        }
        this.value = z;
        this.hasValue = true;
        notifyChanged();
    }

    public BooleanProperty() {
    }

    public boolean get(boolean z) {
        return this.hasValue ? this.value : z;
    }
}
