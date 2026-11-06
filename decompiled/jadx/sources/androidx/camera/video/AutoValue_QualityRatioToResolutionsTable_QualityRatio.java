package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.camera.video.QualityRatioToResolutionsTable;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_QualityRatioToResolutionsTable_QualityRatio extends QualityRatioToResolutionsTable.QualityRatio {
    private final int aspectRatio;
    private final Quality quality;

    public AutoValue_QualityRatioToResolutionsTable_QualityRatio(Quality quality, int i) {
        if (quality == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null quality");
            throw null;
        }
        this.quality = quality;
        this.aspectRatio = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof QualityRatioToResolutionsTable.QualityRatio) {
            QualityRatioToResolutionsTable.QualityRatio qualityRatio = (QualityRatioToResolutionsTable.QualityRatio) obj;
            if (this.quality.equals(qualityRatio.getQuality()) && this.aspectRatio == qualityRatio.getAspectRatio()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio
    public int getAspectRatio() {
        return this.aspectRatio;
    }

    @Override // androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio
    @NonNull
    public Quality getQuality() {
        return this.quality;
    }

    public int hashCode() {
        return this.aspectRatio ^ ((this.quality.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("QualityRatio{quality=");
        sb.append(this.quality);
        sb.append(", aspectRatio=");
        return a$$ExternalSyntheticOutline0.m(sb, this.aspectRatio, StringSubstitutor.DEFAULT_VAR_END);
    }
}
