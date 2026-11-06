package com.amazon.alexa.accessory.repositories.device.v2;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class Key {
    private final String value;

    private Key(String str) {
        Preconditions.notNull(str, "value");
        this.value = str;
    }

    public static Key from(String str) {
        return new Key(str);
    }

    public static Key random() {
        return new Key(UUID.randomUUID().toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Key.class != obj.getClass()) {
            return false;
        }
        return this.value.equals(((Key) obj).value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return this.value;
    }
}
