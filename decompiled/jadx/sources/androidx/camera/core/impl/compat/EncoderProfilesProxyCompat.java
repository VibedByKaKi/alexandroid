package androidx.camera.core.impl.compat;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class EncoderProfilesProxyCompat {
    private static final String TAG = "EncoderProfilesProxyCompat";

    private EncoderProfilesProxyCompat() {
    }

    @NonNull
    public static EncoderProfilesProxy from(@NonNull CamcorderProfile camcorderProfile) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            Logger.w(TAG, "Should use from(EncoderProfiles) on API " + i + "instead. CamcorderProfile is deprecated on API 31.");
        }
        return EncoderProfilesProxyCompatBaseImpl.from(camcorderProfile);
    }

    @NonNull
    @RequiresApi(31)
    public static EncoderProfilesProxy from(@NonNull EncoderProfiles encoderProfiles) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return EncoderProfilesProxyCompatApi33Impl.from(encoderProfiles);
        }
        if (i >= 31) {
            return EncoderProfilesProxyCompatApi31Impl.from(encoderProfiles);
        }
        Single$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m(i, "Unable to call from(EncoderProfiles) on API ", ". Version 31 or higher required."));
        return null;
    }
}
