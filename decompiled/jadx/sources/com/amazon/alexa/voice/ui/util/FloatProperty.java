package com.amazon.alexa.voice.ui.util;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class FloatProperty extends BaseProperty {
    private volatile boolean hasValue;
    private volatile float value;

    public FloatProperty(float f) {
        this.value = f;
        this.hasValue = true;
    }

    public void clear() {
        this.hasValue = false;
        notifyChanged();
    }

    public float get() {
        if (this.hasValue) {
            return this.value;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Property does not hold any value");
        return 0.0f;
    }

    public boolean hasValue() {
        return this.hasValue;
    }

    public void set(float f) {
        if (this.hasValue && this.value == f) {
            return;
        }
        this.value = f;
        this.hasValue = true;
        notifyChanged();
    }

    public FloatProperty() {
    }

    public float get(float f) {
        return this.hasValue ? this.value : f;
    }
}
