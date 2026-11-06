package com.amazon.coral.util.http.uri;

import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class CompositeMatch implements Match {
    private final Match[] match;

    public CompositeMatch(Match... matchArr) {
        if (matchArr == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        for (Match match : matchArr) {
            if (match == null) {
                Path$$ExternalSyntheticBUOutline0.m();
                throw null;
            }
        }
        this.match = matchArr;
    }

    @Override // com.amazon.coral.util.http.uri.Match
    public Iterable<CharSequence> getLabelValues(String str) {
        for (Match match : this.match) {
            Iterable<CharSequence> labelValues = match.getLabelValues(str);
            if (labelValues != null) {
                return labelValues;
            }
        }
        return null;
    }

    @Override // com.amazon.coral.util.http.uri.Match
    public boolean isPathLabel(String str) {
        for (Match match : this.match) {
            if (match.getLabelValues(str) != null) {
                return match.isPathLabel(str);
            }
        }
        return false;
    }
}
