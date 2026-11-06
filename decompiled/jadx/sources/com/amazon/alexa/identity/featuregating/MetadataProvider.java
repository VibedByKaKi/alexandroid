package com.amazon.alexa.identity.featuregating;

import androidx.annotation.NonNull;
import com.amazon.alexa.protocols.environment.EnvironmentService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class MetadataProvider {
    public static final String UNKNOWN_APP_VERSION = "UNKNOWN_APP_VERSION";
    private final EnvironmentService environmentService;

    public MetadataProvider(@NonNull EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    @NonNull
    public String getAppVersion() {
        String versionName = this.environmentService.getVersionName();
        return versionName == null ? "UNKNOWN_APP_VERSION" : versionName;
    }
}
