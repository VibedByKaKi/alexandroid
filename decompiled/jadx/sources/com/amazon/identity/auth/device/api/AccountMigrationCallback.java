package com.amazon.identity.auth.device.api;

import android.os.Bundle;
import com.amazon.fireos.sdk.annotations.FireOsSdk;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface AccountMigrationCallback {
    @FireOsSdk
    void onAccountAdded(String str, Bundle bundle);

    @FireOsSdk
    void onError(Bundle bundle);

    @FireOsSdk
    void onPostAuthFlowFinished(Bundle bundle);
}
