package com.amazon.identity.auth.device.api;

import android.content.Context;
import android.os.Bundle;
import com.amazon.fireos.sdk.annotations.FireOsSdk;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface AppFeatureProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface PermissionFeatureProvider extends AppFeatureProvider {
        @FireOsSdk
        void requestForPermission(Context context, String str, Bundle bundle, Callback callback);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface WeblabFeatureProvider extends AppFeatureProvider {
        @FireOsSdk
        Map<String, String> getAllRegisteredWeblabs();

        @FireOsSdk
        String getTreatmentWithTrigger(String str, String str2);

        @FireOsSdk
        String getTreatmentWithoutTrigger(String str, String str2);
    }
}
