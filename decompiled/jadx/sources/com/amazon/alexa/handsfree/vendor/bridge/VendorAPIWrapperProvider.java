package com.amazon.alexa.handsfree.vendor.bridge;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.devices.AMPDInformationProvider;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfComponentsProvider;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfScope;
import com.amazon.alexa.handsfree.vendor.bridge.dependencies.FalcoVendorBridgeComponent;
import com.amazon.alexa.utils.security.SignatureVerifier;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AhfScope
/* loaded from: classes17.dex */
public class VendorAPIWrapperProvider {
    private static VendorAPIWrapperProvider mVendorAPIWrapperProvider;
    private final AMPDInformationProvider mAMPDInformationProvider;
    private final Context mContext;
    private final SignatureVerifier mSignatureVerifier;

    @Inject
    public VendorAPIWrapperProvider(@NonNull Context context) {
        this(context, new SignatureVerifier(context), AMPDInformationProvider.getInstance(context));
    }

    @NonNull
    public static synchronized VendorAPIWrapperProvider getInstance(Context context) {
        VendorAPIWrapperProvider vendorAPIWrapperProvider;
        synchronized (VendorAPIWrapperProvider.class) {
            vendorAPIWrapperProvider = ((FalcoVendorBridgeComponent) AhfComponentsProvider.getComponent(context, FalcoVendorBridgeComponent.class)).vendorAPIWrapperProvider();
        }
        return vendorAPIWrapperProvider;
    }

    @Nullable
    public VendorAPIWrapper getSupportedAPIWrapper() {
        for (VoiceAppPackageInfo voiceAppPackageInfo : VoiceAppPackageInfo.values()) {
            if (voiceAppPackageInfo.isPackageOnDevice(this.mContext, this.mSignatureVerifier) && voiceAppPackageInfo.getPackageName().equals(this.mAMPDInformationProvider.getVoiceAppPackageName())) {
                return voiceAppPackageInfo.getVendorAPIWrapper();
            }
        }
        return null;
    }

    @VisibleForTesting
    public VendorAPIWrapperProvider(@NonNull Context context, @NonNull SignatureVerifier signatureVerifier, @NonNull AMPDInformationProvider aMPDInformationProvider) {
        this.mContext = context;
        this.mSignatureVerifier = signatureVerifier;
        this.mAMPDInformationProvider = aMPDInformationProvider;
    }

    @Nullable
    public VendorAPIWrapper getSupportedAPIWrapper(@NonNull VoiceAppPackageInfo voiceAppPackageInfo) {
        return voiceAppPackageInfo.getVendorAPIWrapper();
    }
}
