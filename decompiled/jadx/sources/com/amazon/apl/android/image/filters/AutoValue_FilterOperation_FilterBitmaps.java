package com.amazon.apl.android.image.filters;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.amazon.apl.android.image.filters.FilterOperation;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_FilterOperation_FilterBitmaps extends FilterOperation.FilterBitmaps {
    private final Bitmap destination;
    private final Bitmap result;
    private final Bitmap source;

    public AutoValue_FilterOperation_FilterBitmaps(@Nullable Bitmap bitmap, @Nullable Bitmap bitmap2, @Nullable Bitmap bitmap3) {
        this.source = bitmap;
        this.destination = bitmap2;
        this.result = bitmap3;
    }

    @Override // com.amazon.apl.android.image.filters.FilterOperation.FilterBitmaps
    @Nullable
    public Bitmap destination() {
        return this.destination;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FilterOperation.FilterBitmaps) {
            FilterOperation.FilterBitmaps filterBitmaps = (FilterOperation.FilterBitmaps) obj;
            Bitmap bitmap = this.source;
            if (bitmap != null ? bitmap.equals(filterBitmaps.source()) : filterBitmaps.source() == null) {
                Bitmap bitmap2 = this.destination;
                if (bitmap2 != null ? bitmap2.equals(filterBitmaps.destination()) : filterBitmaps.destination() == null) {
                    Bitmap bitmap3 = this.result;
                    if (bitmap3 != null ? bitmap3.equals(filterBitmaps.result()) : filterBitmaps.result() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Bitmap bitmap = this.source;
        int hashCode = ((bitmap == null ? 0 : bitmap.hashCode()) ^ 1000003) * 1000003;
        Bitmap bitmap2 = this.destination;
        int hashCode2 = (hashCode ^ (bitmap2 == null ? 0 : bitmap2.hashCode())) * 1000003;
        Bitmap bitmap3 = this.result;
        return hashCode2 ^ (bitmap3 != null ? bitmap3.hashCode() : 0);
    }

    @Override // com.amazon.apl.android.image.filters.FilterOperation.FilterBitmaps
    @Nullable
    public Bitmap result() {
        return this.result;
    }

    @Override // com.amazon.apl.android.image.filters.FilterOperation.FilterBitmaps
    @Nullable
    public Bitmap source() {
        return this.source;
    }

    public String toString() {
        return "FilterBitmaps{source=" + this.source + ", destination=" + this.destination + ", result=" + this.result + StringSubstitutor.DEFAULT_VAR_END;
    }
}
