package com.amazon.alexa.growthcore.service.metadata;

import androidx.annotation.NonNull;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import dagger.Lazy;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class MetadataProvider {
    public static final String UNKNOWN_APP_VERSION = "UNKNOWN_APP_VERSION";
    private final Lazy<EnvironmentService> environmentService;

    @Inject
    public MetadataProvider(@NonNull Lazy<EnvironmentService> lazy) {
        this.environmentService = lazy;
    }

    @NonNull
    public String getAppVersion() {
        String versionName = this.environmentService.get().getVersionName();
        return versionName == null ? "UNKNOWN_APP_VERSION" : versionName;
    }
}
