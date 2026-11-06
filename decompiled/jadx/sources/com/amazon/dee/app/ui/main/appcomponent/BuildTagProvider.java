package com.amazon.dee.app.ui.main.appcomponent;

import com.amazon.dee.app.services.security.CertificateReaderService;
import dagger.Lazy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class BuildTagProvider {
    private static final String PREVIEW_BUILD_FLAVOR = "preview";
    private static final String TAG = "BuildTagProvider";
    private Integer buildType = null;
    private final Lazy<CertificateReaderService> certificateReaderService;

    public BuildTagProvider(Lazy<CertificateReaderService> lazy) {
        this.certificateReaderService = lazy;
    }

    public int getBuildType() {
        if (this.buildType == null) {
            if (this.certificateReaderService.get().isDebugSigned()) {
                this.buildType = 0;
            } else {
                this.buildType = 2;
            }
        }
        return this.buildType.intValue();
    }
}
