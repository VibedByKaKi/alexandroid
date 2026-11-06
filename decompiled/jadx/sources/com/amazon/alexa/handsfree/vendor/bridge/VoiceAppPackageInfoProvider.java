package com.amazon.alexa.handsfree.vendor.bridge;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.utils.security.SignatureVerifier;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VoiceAppPackageInfoProvider {
    private final Context mContext;
    private final SignatureVerifier mSignatureVerifier;

    @Inject
    public VoiceAppPackageInfoProvider(@NonNull Context context) {
        this(context, new SignatureVerifier(context));
    }

    @Nullable
    public VoiceAppPackageInfo getSupportedVoiceApp() {
        for (VoiceAppPackageInfo voiceAppPackageInfo : VoiceAppPackageInfo.values()) {
            if (voiceAppPackageInfo.isPackageOnDevice(this.mContext, this.mSignatureVerifier)) {
                return voiceAppPackageInfo;
            }
        }
        return null;
    }

    @VisibleForTesting
    public VoiceAppPackageInfoProvider(@NonNull Context context, @NonNull SignatureVerifier signatureVerifier) {
        this.mContext = context;
        this.mSignatureVerifier = signatureVerifier;
    }
}
