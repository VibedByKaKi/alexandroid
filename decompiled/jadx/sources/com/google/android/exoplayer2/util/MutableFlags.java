package com.google.android.exoplayer2.util;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class MutableFlags {
    private final SparseBooleanArray flags = new SparseBooleanArray();

    public void add(int i) {
        this.flags.append(i, true);
    }

    public void clear() {
        this.flags.clear();
    }

    public boolean contains(int i) {
        return this.flags.get(i);
    }

    public boolean containsAny(int... iArr) {
        for (int i : iArr) {
            if (contains(i)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MutableFlags) {
            return this.flags.equals(((MutableFlags) obj).flags);
        }
        return false;
    }

    public int get(int i) {
        Assertions.checkArgument(i >= 0 && i < size());
        return this.flags.keyAt(i);
    }

    public int hashCode() {
        return this.flags.hashCode();
    }

    public int size() {
        return this.flags.size();
    }
}
