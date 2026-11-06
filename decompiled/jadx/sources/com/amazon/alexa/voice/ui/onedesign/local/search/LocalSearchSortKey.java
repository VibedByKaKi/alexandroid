package com.amazon.alexa.voice.ui.onedesign.local.search;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum LocalSearchSortKey {
    UNKNOWN("UNKNOWN"),
    DISTANCE("DISTANCE"),
    RELEVANCE("RELEVANCE");

    private final String sortKey;

    LocalSearchSortKey(String str) {
        this.sortKey = str;
    }

    public static LocalSearchSortKey from(String str) {
        for (LocalSearchSortKey localSearchSortKey : values()) {
            if (localSearchSortKey.toString().equals(str)) {
                return localSearchSortKey;
            }
        }
        return UNKNOWN;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.sortKey;
    }
}
