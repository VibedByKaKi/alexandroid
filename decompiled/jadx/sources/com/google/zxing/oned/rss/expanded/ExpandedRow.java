package com.google.zxing.oned.rss.expanded;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class ExpandedRow {
    private final List<ExpandedPair> pairs;
    private final int rowNumber;

    public ExpandedRow(List<ExpandedPair> list, int i) {
        this.pairs = new ArrayList(list);
        this.rowNumber = i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ExpandedRow) {
            return this.pairs.equals(((ExpandedRow) obj).pairs);
        }
        return false;
    }

    public List<ExpandedPair> getPairs() {
        return this.pairs;
    }

    public int getRowNumber() {
        return this.rowNumber;
    }

    public int hashCode() {
        return this.pairs.hashCode();
    }

    public boolean isEquivalent(List<ExpandedPair> list) {
        return this.pairs.equals(list);
    }

    public String toString() {
        return ErrorUtils$$ExternalSyntheticOutline0.m(" }", this.pairs, new StringBuilder("{ "));
    }
}
