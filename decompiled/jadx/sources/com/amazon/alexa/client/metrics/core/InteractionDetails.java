package com.amazon.alexa.client.metrics.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class InteractionDetails {
    private final String refMarker;

    public InteractionDetails(@Nullable String str) {
        this.refMarker = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            InteractionDetails interactionDetails = (InteractionDetails) obj;
            if (getRefMarker() != null && getRefMarker().equals(interactionDetails.getRefMarker())) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public String getRefMarker() {
        return this.refMarker;
    }

    @NonNull
    public String toString() {
        return "RefMarker = " + this.refMarker;
    }
}
