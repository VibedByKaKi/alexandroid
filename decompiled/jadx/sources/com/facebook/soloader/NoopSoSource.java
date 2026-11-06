package com.facebook.soloader;

import android.os.StrictMode;
import java.io.File;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class NoopSoSource extends SoSource {
    @Override // com.facebook.soloader.SoSource
    public String getName() {
        return "NoopSoSource";
    }

    @Override // com.facebook.soloader.SoSource
    public int loadLibrary(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return 1;
    }

    @Override // com.facebook.soloader.SoSource
    public File unpackLibrary(String str) {
        throw new UnsupportedOperationException("unpacking not supported in test mode");
    }
}
