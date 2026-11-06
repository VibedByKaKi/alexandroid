package com.amazon.deecomms.util;

import android.os.Build;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class BuildVersionProviderImpl implements IBuildVersionProvider {
    @Inject
    public BuildVersionProviderImpl() {
    }

    @Override // com.amazon.deecomms.util.IBuildVersionProvider
    public int getCurrentBuildVersion() {
        return Build.VERSION.SDK_INT;
    }
}
