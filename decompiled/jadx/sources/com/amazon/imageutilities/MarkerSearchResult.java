package com.amazon.imageutilities;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MarkerSearchResult {
    private final int paddedLength;
    private final boolean skipForVisualDigest;

    public MarkerSearchResult(int i, boolean z) {
        this.paddedLength = i;
        this.skipForVisualDigest = z;
    }

    public int getPaddedLength() {
        return this.paddedLength;
    }

    public boolean isSkipForVisualDigest() {
        return this.skipForVisualDigest;
    }
}
