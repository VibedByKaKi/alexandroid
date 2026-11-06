package com.amazon.alexa.sensor.api.metrics.events;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class CounterEvent extends Event {
    protected int value;

    public CounterEvent(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        super(str, str2, str3);
        setValue(0);
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int i) {
        this.value = i;
    }
}
