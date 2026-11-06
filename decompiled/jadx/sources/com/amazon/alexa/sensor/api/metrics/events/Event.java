package com.amazon.alexa.sensor.api.metrics.events;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public abstract class Event {

    @NonNull
    public final String component;

    @NonNull
    public final String name;

    @NonNull
    public final String subComponent;

    public Event(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        this.name = str;
        this.component = str2;
        this.subComponent = str3;
    }
}
