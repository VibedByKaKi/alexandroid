package com.mapbox.maps.renderer;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/mapbox/maps/renderer/RendererError;", "", "eglErrorCode", "", "(I)V", "getEglErrorCode", "()I", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class RendererError {

    @JvmField
    @NotNull
    public static final RendererError NO_VALID_EGL_CONFIG_FOUND = new RendererError(0);

    @JvmField
    @NotNull
    public static final RendererError OUT_OF_MEMORY = new RendererError(12291);
    private final int eglErrorCode;

    public RendererError(int i) {
        this.eglErrorCode = i;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof RendererError) && this.eglErrorCode == ((RendererError) other).eglErrorCode;
    }

    public final int getEglErrorCode() {
        return this.eglErrorCode;
    }

    public int hashCode() {
        return Integer.hashCode(this.eglErrorCode);
    }

    @NotNull
    public String toString() {
        return this.eglErrorCode == 0 ? "RendererError(NO_VALID_EGL_CONFIG_FOUND)" : ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder("RendererError(EGL_ERROR_CODE="), this.eglErrorCode, ')');
    }
}
