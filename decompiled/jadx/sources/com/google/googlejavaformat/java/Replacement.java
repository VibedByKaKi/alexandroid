package com.google.googlejavaformat.java;

import com.google.common.collect.Range;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class Replacement {
    private final Range<Integer> replaceRange;
    private final String replacementString;

    public Replacement(Range<Integer> range, String str) {
        if (range == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null replaceRange");
            throw null;
        }
        this.replaceRange = range;
        if (str != null) {
            this.replacementString = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null replacementString");
            throw null;
        }
    }

    public static Replacement create(int i, int i2, String str) {
        return new Replacement(Range.closedOpen(Integer.valueOf(i), Integer.valueOf(i2)), str);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Replacement) {
            Replacement replacement = (Replacement) obj;
            if (this.replaceRange.equals(replacement.getReplaceRange()) && this.replacementString.equals(replacement.getReplacementString())) {
                return true;
            }
        }
        return false;
    }

    public Range<Integer> getReplaceRange() {
        return this.replaceRange;
    }

    public String getReplacementString() {
        return this.replacementString;
    }

    public int hashCode() {
        return Objects.hash(this.replaceRange, this.replacementString);
    }

    public static Replacement create(Range<Integer> range, String str) {
        return new Replacement(range, str);
    }
}
