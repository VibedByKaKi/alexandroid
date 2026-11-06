package com.google.android.datatransport;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class Encoding {
    private final String name;

    private Encoding(@NonNull String str) {
        if (str != null) {
            this.name = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("name is null");
            throw null;
        }
    }

    public static Encoding of(@NonNull String str) {
        return new Encoding(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Encoding) {
            return this.name.equals(((Encoding) obj).name);
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() ^ 1000003;
    }

    @NonNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("Encoding{name=\""), this.name, "\"}");
    }
}
