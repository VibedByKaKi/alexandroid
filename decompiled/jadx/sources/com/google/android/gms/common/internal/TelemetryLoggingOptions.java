package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@KeepForSdk
/* loaded from: classes7.dex */
public class TelemetryLoggingOptions implements Api.ApiOptions.Optional {

    @NonNull
    public static final TelemetryLoggingOptions zaa = builder().build();

    @Nullable
    private final String zab;

    public /* synthetic */ TelemetryLoggingOptions(String str, zaad zaadVar) {
        this.zab = str;
    }

    @NonNull
    @KeepForSdk
    public static Builder builder() {
        return new Builder(null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TelemetryLoggingOptions) {
            return Objects.equal(this.zab, ((TelemetryLoggingOptions) obj).zab);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zab);
    }

    @NonNull
    public final Bundle zaa() {
        Bundle bundle = new Bundle();
        String str = this.zab;
        if (str != null) {
            bundle.putString(DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.API_QUERY_PARAM_KEY, str);
        }
        return bundle;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @KeepForSdk
    public static class Builder {

        @Nullable
        private String zaa;

        private Builder() {
        }

        @NonNull
        @KeepForSdk
        public TelemetryLoggingOptions build() {
            return new TelemetryLoggingOptions(this.zaa, null);
        }

        @NonNull
        @CanIgnoreReturnValue
        @KeepForSdk
        public Builder setApi(@Nullable String str) {
            this.zaa = str;
            return this;
        }

        public /* synthetic */ Builder(zaac zaacVar) {
        }
    }
}
