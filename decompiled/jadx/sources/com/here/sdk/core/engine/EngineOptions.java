package com.here.sdk.core.engine;

import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class EngineOptions {

    @Nullable
    public String customBaseUrl = null;

    @Nullable
    public AuthenticationMode customAuthenticationMode = null;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EngineOptions)) {
            return false;
        }
        EngineOptions engineOptions = (EngineOptions) obj;
        return Objects.equals(this.customBaseUrl, engineOptions.customBaseUrl) && Objects.equals(this.customAuthenticationMode, engineOptions.customAuthenticationMode);
    }

    public int hashCode() {
        String str = this.customBaseUrl;
        int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
        AuthenticationMode authenticationMode = this.customAuthenticationMode;
        return hashCode + (authenticationMode != null ? authenticationMode.hashCode() : 0);
    }
}
