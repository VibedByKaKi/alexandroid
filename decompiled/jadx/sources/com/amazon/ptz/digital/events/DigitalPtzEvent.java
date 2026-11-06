package com.amazon.ptz.digital.events;

import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum DigitalPtzEvent {
    ZOOMED_IN_MAX("ZoomedInMax"),
    ZOOMED_OUT_MAX("ZoomedOutMax"),
    EXCEEDING_PAN_BOUNDS("ExceedingBounds");

    private final String name;

    DigitalPtzEvent(@Nonnull String str) {
        this.name = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
