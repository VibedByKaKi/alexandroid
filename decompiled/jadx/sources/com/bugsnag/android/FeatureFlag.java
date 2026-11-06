package com.bugsnag.android;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final class FeatureFlag implements Map.Entry<String, String> {
    private final String name;
    private final String variant;

    public FeatureFlag(@NonNull String str, @Nullable String str2) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("FeatureFlags cannot have null name");
            throw null;
        }
        this.name = str;
        this.variant = str2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return getKey().equals(entry.getKey()) && (getValue() != null ? getValue().equals(entry.getValue()) : entry.getValue() == null);
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    @Nullable
    public String getVariant() {
        return this.variant;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return (getValue() == null ? 0 : getValue().hashCode()) ^ getKey().hashCode();
    }

    @Override // java.util.Map.Entry
    @Nullable
    public String setValue(@Nullable String str) {
        throw new UnsupportedOperationException("FeatureFlag is immutable");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FeatureFlag{name='");
        sb.append(this.name);
        sb.append("', variant='");
        return a$$ExternalSyntheticOutline0.m(sb, this.variant, "'}");
    }

    @Override // java.util.Map.Entry
    @NonNull
    public String getKey() {
        return this.name;
    }

    @Override // java.util.Map.Entry
    @Nullable
    public String getValue() {
        return this.variant;
    }

    public FeatureFlag(@NonNull String str) {
        this(str, null);
    }

    public FeatureFlag(@NonNull Map.Entry<String, String> entry) {
        this(entry.getKey(), entry.getValue());
    }
}
