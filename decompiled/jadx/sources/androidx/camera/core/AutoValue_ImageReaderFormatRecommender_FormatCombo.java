package androidx.camera.core;

import androidx.camera.core.ImageReaderFormatRecommender;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_ImageReaderFormatRecommender_FormatCombo extends ImageReaderFormatRecommender.FormatCombo {
    private final int imageAnalysisFormat;
    private final int imageCaptureFormat;

    public AutoValue_ImageReaderFormatRecommender_FormatCombo(int i, int i2) {
        this.imageCaptureFormat = i;
        this.imageAnalysisFormat = i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImageReaderFormatRecommender.FormatCombo) {
            ImageReaderFormatRecommender.FormatCombo formatCombo = (ImageReaderFormatRecommender.FormatCombo) obj;
            if (this.imageCaptureFormat == formatCombo.imageCaptureFormat() && this.imageAnalysisFormat == formatCombo.imageAnalysisFormat()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.imageAnalysisFormat ^ ((this.imageCaptureFormat ^ 1000003) * 1000003);
    }

    @Override // androidx.camera.core.ImageReaderFormatRecommender.FormatCombo
    public int imageAnalysisFormat() {
        return this.imageAnalysisFormat;
    }

    @Override // androidx.camera.core.ImageReaderFormatRecommender.FormatCombo
    public int imageCaptureFormat() {
        return this.imageCaptureFormat;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FormatCombo{imageCaptureFormat=");
        sb.append(this.imageCaptureFormat);
        sb.append(", imageAnalysisFormat=");
        return a$$ExternalSyntheticOutline0.m(sb, this.imageAnalysisFormat, StringSubstitutor.DEFAULT_VAR_END);
    }
}
