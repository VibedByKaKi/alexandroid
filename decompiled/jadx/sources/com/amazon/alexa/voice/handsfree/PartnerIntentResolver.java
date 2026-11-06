package com.amazon.alexa.voice.handsfree;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfComponentsProvider;
import com.amazon.alexa.handsfree.vendor.bridge.VendorAPIWrapper;
import com.amazon.alexa.handsfree.vendor.bridge.VendorAPIWrapperProvider;
import com.amazon.alexa.handsfree.vendor.bridge.dependencies.FalcoVendorBridgeComponent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class PartnerIntentResolver {
    private final HandsFreePackageInfoResolver mHandsFreePackageInfoResolver;
    private final VendorAPIWrapperProvider mVendorAPIWrapperProvider;

    public PartnerIntentResolver(@NonNull Context context) {
        this(((FalcoVendorBridgeComponent) AhfComponentsProvider.getComponent(context, FalcoVendorBridgeComponent.class)).vendorAPIWrapperProvider(), new HandsFreePackageInfoResolver(context));
    }

    @Nullable
    public Intent getPartnerPermissionsIntent() {
        VendorAPIWrapper supportedAPIWrapper = this.mVendorAPIWrapperProvider.getSupportedAPIWrapper();
        return supportedAPIWrapper != null ? supportedAPIWrapper.getPermissionIntent() : this.mHandsFreePackageInfoResolver.getPermissionsIntent();
    }

    @VisibleForTesting
    public PartnerIntentResolver(@NonNull VendorAPIWrapperProvider vendorAPIWrapperProvider, @NonNull HandsFreePackageInfoResolver handsFreePackageInfoResolver) {
        this.mVendorAPIWrapperProvider = vendorAPIWrapperProvider;
        this.mHandsFreePackageInfoResolver = handsFreePackageInfoResolver;
    }
}
