package com.amazon.alexa.accessory.repositories.device;

import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class SubFeature {
    private final int id;

    public SubFeature(int i) {
        this.id = i;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        return Integer.valueOf(this.id).equals(Integer.valueOf(((SubFeature) obj).id));
    }

    public int getId() {
        return this.id;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.id));
    }
}
