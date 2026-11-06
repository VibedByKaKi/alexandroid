package com.amazon.alexa.client.alexaservice.base.application.configuration;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import javax.inject.Inject;
import javax.inject.Singleton;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class ApplicationMetadata {
    private static final String MANIFEST_METADATA_KEY_DEVICE_TYPE = "MAPDeviceType";
    private static final String TAG = "ApplicationMetadata";
    private final Bundle metadata;

    @Inject
    public ApplicationMetadata(Context context, PackageManager packageManager) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                Single$$ExternalSyntheticBUOutline0.m("Got null applicationInfo from package manager.");
                throw null;
            }
            this.metadata = bundle;
        } catch (PackageManager.NameNotFoundException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Unable to retrieve metadata from manifest", e);
            throw null;
        }
    }

    public String getDeviceType() {
        Object obj = this.metadata.get(MANIFEST_METADATA_KEY_DEVICE_TYPE);
        if (obj != null && !(obj instanceof String)) {
            Single$$ExternalSyntheticBUOutline0.m("MAP device type is not a string in the manifest");
            return null;
        }
        if (obj == null) {
            Log.i(TAG, "MAP device type is not in the manifest");
        }
        return (String) obj;
    }
}
