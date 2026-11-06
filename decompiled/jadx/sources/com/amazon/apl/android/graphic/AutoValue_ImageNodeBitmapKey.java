package com.amazon.apl.android.graphic;

import android.graphics.Rect;
import androidx.annotation.Nullable;
import com.amazon.apl.android.image.filters.bitmap.Size;
import com.amazon.apl.android.sgcontent.filters.Filter;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_ImageNodeBitmapKey extends ImageNodeBitmapKey {
    private final Filter filter;
    private final Rect sourceRegion;
    private final Size targetSize;

    public AutoValue_ImageNodeBitmapKey(Filter filter, @Nullable Rect rect, @Nullable Size size) {
        if (filter == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null filter");
            throw null;
        }
        this.filter = filter;
        this.sourceRegion = rect;
        this.targetSize = size;
    }

    public boolean equals(Object obj) {
        Rect rect;
        Size size;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImageNodeBitmapKey) {
            ImageNodeBitmapKey imageNodeBitmapKey = (ImageNodeBitmapKey) obj;
            if (this.filter.equals(imageNodeBitmapKey.filter()) && ((rect = this.sourceRegion) != null ? rect.equals(imageNodeBitmapKey.sourceRegion()) : imageNodeBitmapKey.sourceRegion() == null) && ((size = this.targetSize) != null ? size.equals(imageNodeBitmapKey.targetSize()) : imageNodeBitmapKey.targetSize() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.apl.android.graphic.ImageNodeBitmapKey
    public Filter filter() {
        return this.filter;
    }

    public int hashCode() {
        int hashCode = (this.filter.hashCode() ^ 1000003) * 1000003;
        Rect rect = this.sourceRegion;
        int hashCode2 = (hashCode ^ (rect == null ? 0 : rect.hashCode())) * 1000003;
        Size size = this.targetSize;
        return hashCode2 ^ (size != null ? size.hashCode() : 0);
    }

    @Override // com.amazon.apl.android.graphic.ImageNodeBitmapKey
    @Nullable
    public Rect sourceRegion() {
        return this.sourceRegion;
    }

    @Override // com.amazon.apl.android.graphic.ImageNodeBitmapKey
    @Nullable
    public Size targetSize() {
        return this.targetSize;
    }

    public String toString() {
        return "ImageNodeBitmapKey{filter=" + this.filter + ", sourceRegion=" + this.sourceRegion + ", targetSize=" + this.targetSize + StringSubstitutor.DEFAULT_VAR_END;
    }
}
