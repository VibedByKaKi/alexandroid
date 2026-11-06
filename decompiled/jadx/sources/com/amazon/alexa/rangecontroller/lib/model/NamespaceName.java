package com.amazon.alexa.rangecontroller.lib.model;

import edu.umd.cs.findbugs.annotations.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public enum NamespaceName {
    RANGE_CONTROLLER("Alexa.RangeController"),
    ALEXA("Alexa"),
    ALEXA_SAFETY("Alexa.Safety");

    private final String name;

    NamespaceName(@NonNull String str) {
        this.name = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
