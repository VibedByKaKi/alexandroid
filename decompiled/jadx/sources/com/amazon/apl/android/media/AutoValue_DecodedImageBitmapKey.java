package com.amazon.apl.android.media;

import android.graphics.Rect;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_DecodedImageBitmapKey extends DecodedImageBitmapKey {
    private final Rect decodeRegion;
    private final int sampleSize;
    private final String sourceUrl;

    public AutoValue_DecodedImageBitmapKey(String str, Rect rect, int i) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null sourceUrl");
            throw null;
        }
        this.sourceUrl = str;
        if (rect == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null decodeRegion");
            throw null;
        }
        this.decodeRegion = rect;
        this.sampleSize = i;
    }

    @Override // com.amazon.apl.android.media.DecodedImageBitmapKey
    public Rect decodeRegion() {
        return this.decodeRegion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DecodedImageBitmapKey) {
            DecodedImageBitmapKey decodedImageBitmapKey = (DecodedImageBitmapKey) obj;
            if (this.sourceUrl.equals(decodedImageBitmapKey.sourceUrl()) && this.decodeRegion.equals(decodedImageBitmapKey.decodeRegion()) && this.sampleSize == decodedImageBitmapKey.sampleSize()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.sampleSize ^ ((((this.sourceUrl.hashCode() ^ 1000003) * 1000003) ^ this.decodeRegion.hashCode()) * 1000003);
    }

    @Override // com.amazon.apl.android.media.DecodedImageBitmapKey
    public int sampleSize() {
        return this.sampleSize;
    }

    @Override // com.amazon.apl.android.media.DecodedImageBitmapKey
    public String sourceUrl() {
        return this.sourceUrl;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DecodedImageBitmapKey{sourceUrl=");
        sb.append(this.sourceUrl);
        sb.append(", decodeRegion=");
        sb.append(this.decodeRegion);
        sb.append(", sampleSize=");
        return a$$ExternalSyntheticOutline0.m(sb, this.sampleSize, StringSubstitutor.DEFAULT_VAR_END);
    }
}
