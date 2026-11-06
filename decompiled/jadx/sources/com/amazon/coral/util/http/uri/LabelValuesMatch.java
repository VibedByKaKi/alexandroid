package com.amazon.coral.util.http.uri;

import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class LabelValuesMatch implements Match {
    private final LabelValues labelValues;

    public LabelValuesMatch(LabelValues labelValues) {
        if (labelValues != null) {
            this.labelValues = labelValues;
        } else {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
    }

    @Override // com.amazon.coral.util.http.uri.Match
    public Iterable<CharSequence> getLabelValues(String str) {
        return this.labelValues.getLabelValues(str);
    }

    @Override // com.amazon.coral.util.http.uri.Match
    public boolean isPathLabel(String str) {
        return this.labelValues.isPathLabel();
    }
}
