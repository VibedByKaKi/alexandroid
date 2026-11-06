package com.facebook.soloader.recovery;

import com.facebook.soloader.AsyncInitSoSource;
import com.facebook.soloader.LogUtil;
import com.facebook.soloader.SoLoader;
import com.facebook.soloader.SoSource;
import com.facebook.soloader.UnpackingSoSource;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class WaitForAsyncInit implements RecoveryStrategy {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.soloader.recovery.RecoveryStrategy
    public boolean recover(UnsatisfiedLinkError unsatisfiedLinkError, SoSource[] soSourceArr) {
        for (UnpackingSoSource unpackingSoSource : soSourceArr) {
            if (unpackingSoSource instanceof AsyncInitSoSource) {
                LogUtil.e(SoLoader.TAG, "Waiting on SoSource " + unpackingSoSource.getName());
                unpackingSoSource.waitUntilInitCompleted();
            }
        }
        return true;
    }
}
