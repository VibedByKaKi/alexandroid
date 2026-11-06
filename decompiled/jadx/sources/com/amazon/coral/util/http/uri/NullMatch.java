package com.amazon.coral.util.http.uri;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class NullMatch implements Match {
    @Override // com.amazon.coral.util.http.uri.Match
    public Iterable<CharSequence> getLabelValues(String str) {
        return null;
    }

    @Override // com.amazon.coral.util.http.uri.Match
    public boolean isPathLabel(String str) {
        return false;
    }
}
