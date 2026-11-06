package androidx.camera.core.processing.util;

import android.opengl.EGLSurface;
import androidx.annotation.NonNull;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_OutputSurface extends OutputSurface {
    private final EGLSurface eglSurface;
    private final int height;
    private final int width;

    public AutoValue_OutputSurface(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null eglSurface");
            throw null;
        }
        this.eglSurface = eGLSurface;
        this.width = i;
        this.height = i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OutputSurface) {
            OutputSurface outputSurface = (OutputSurface) obj;
            if (this.eglSurface.equals(outputSurface.getEglSurface()) && this.width == outputSurface.getWidth() && this.height == outputSurface.getHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.processing.util.OutputSurface
    @NonNull
    public EGLSurface getEglSurface() {
        return this.eglSurface;
    }

    @Override // androidx.camera.core.processing.util.OutputSurface
    public int getHeight() {
        return this.height;
    }

    @Override // androidx.camera.core.processing.util.OutputSurface
    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return this.height ^ ((((this.eglSurface.hashCode() ^ 1000003) * 1000003) ^ this.width) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.eglSurface);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        return a$$ExternalSyntheticOutline0.m(sb, this.height, StringSubstitutor.DEFAULT_VAR_END);
    }
}
