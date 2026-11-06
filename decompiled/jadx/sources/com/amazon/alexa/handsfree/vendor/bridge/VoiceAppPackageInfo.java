package com.amazon.alexa.handsfree.vendor.bridge;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.vendor.bridge.wrappers.FoxtrotAPIWrapper;
import com.amazon.alexa.utils.security.SignatureVerifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum VoiceAppPackageInfo {
    FOXTROT_ASSISTANT("com.amazon.tablet.voiceassistant", 1, 2100000000, new FoxtrotAPIWrapper());

    private static final String TAG = "VoiceAppPackageInfo";
    private final int mMaxSupportedVersion;
    private final int mMinSupportedVersion;
    private final String mPackageName;
    private final VendorAPIWrapper mVendorAPIWrapper;

    VoiceAppPackageInfo(@NonNull String str, int i, int i2, @NonNull VendorAPIWrapper vendorAPIWrapper) {
        this.mPackageName = str;
        this.mMinSupportedVersion = i;
        this.mMaxSupportedVersion = i2;
        this.mVendorAPIWrapper = vendorAPIWrapper;
    }

    private boolean hasPermission(String str, String str2, Context context) {
        return context.getPackageManager().checkPermission(str, str2) == 0;
    }

    @VisibleForTesting
    public int getMaxSupportedVersion() {
        return this.mMaxSupportedVersion;
    }

    @VisibleForTesting
    public int getMinSupportedVersion() {
        return this.mMinSupportedVersion;
    }

    @NonNull
    public String getPackageName() {
        return this.mPackageName;
    }

    @NonNull
    public VendorAPIWrapper getVendorAPIWrapper() {
        return this.mVendorAPIWrapper;
    }

    public boolean hasRecordAudioPermissions(Context context) {
        return hasPermission("android.permission.RECORD_AUDIO", this.mPackageName, context);
    }

    public boolean isPackageOnDevice(@NonNull Context context, @NonNull SignatureVerifier signatureVerifier) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(this.mPackageName, 0);
            if (!signatureVerifier.verify(this.mPackageName)) {
                Log.d(TAG, "unable to verify authenticity of voice APK");
                return false;
            }
            int i = packageInfo.versionCode;
            if (i < this.mMinSupportedVersion) {
                Log.d(TAG, "version too old: " + this.mPackageName);
                return false;
            }
            if (i > this.mMaxSupportedVersion) {
                Log.d(TAG, "version too new: " + this.mPackageName);
                return false;
            }
            if (context.getPackageManager().getApplicationInfo(this.mPackageName, 0).enabled) {
                Log.d(TAG, "package found");
                return true;
            }
            Log.d(TAG, "package is disabled");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.d(TAG, "package not found: " + this.mPackageName);
            return false;
        }
    }
}
