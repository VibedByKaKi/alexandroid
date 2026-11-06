package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_OutputSurface extends OutputSurface {
    private final int imageFormat;
    private final Size size;
    private final Surface surface;

    public AutoValue_OutputSurface(Surface surface, Size size, int i) {
        if (surface == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null surface");
            throw null;
        }
        this.surface = surface;
        if (size == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null size");
            throw null;
        }
        this.size = size;
        this.imageFormat = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OutputSurface) {
            OutputSurface outputSurface = (OutputSurface) obj;
            if (this.surface.equals(outputSurface.getSurface()) && this.size.equals(outputSurface.getSize()) && this.imageFormat == outputSurface.getImageFormat()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    public int getImageFormat() {
        return this.imageFormat;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    @NonNull
    public Size getSize() {
        return this.size;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    @NonNull
    public Surface getSurface() {
        return this.surface;
    }

    public int hashCode() {
        return this.imageFormat ^ ((((this.surface.hashCode() ^ 1000003) * 1000003) ^ this.size.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{surface=");
        sb.append(this.surface);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", imageFormat=");
        return a$$ExternalSyntheticOutline0.m(sb, this.imageFormat, StringSubstitutor.DEFAULT_VAR_END);
    }
}
