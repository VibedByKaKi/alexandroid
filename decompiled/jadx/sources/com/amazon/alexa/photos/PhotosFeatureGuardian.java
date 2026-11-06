package com.amazon.alexa.photos;

import com.amazon.alexa.device.api.DeviceInformation;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.featureservice.data.registry.NativeFeatureRegistry;
import com.amazon.alexa.protocols.service.api.LazyComponent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class PhotosFeatureGuardian {
    private static final String TAG = "PhotosFeatureGuardian";
    private final LazyComponent<DeviceInformation> deviceInformationLazy;
    private final LazyComponent<FeatureServiceV2> featureServiceV2Lazy;

    public PhotosFeatureGuardian(LazyComponent<FeatureServiceV2> lazyComponent, LazyComponent<DeviceInformation> lazyComponent2) {
        this.featureServiceV2Lazy = lazyComponent;
        this.deviceInformationLazy = lazyComponent2;
    }

    private boolean shouldDisableFeaturesForCurrentPlatform() {
        DeviceInformation deviceInformation = this.deviceInformationLazy.get();
        return deviceInformation == null || deviceInformation.isFireOS();
    }

    public boolean isAutosaveFeatureAvailable() {
        FeatureServiceV2 featureServiceV2 = this.featureServiceV2Lazy.get();
        return (shouldDisableFeaturesForCurrentPlatform() || featureServiceV2 == null || !featureServiceV2.hasAccess("AMAZON_PHOTOS_ALEXA_APP_AUTO_SAVE_ANDROID", false)) ? false : true;
    }

    public boolean isManualUploadFeatureAvailable() {
        FeatureServiceV2 featureServiceV2 = this.featureServiceV2Lazy.get();
        return (shouldDisableFeaturesForCurrentPlatform() || featureServiceV2 == null || (!featureServiceV2.hasAccess("AMAZON_PHOTOS_ALEXA_APP_MANUAL_UPLOAD_ANDROID", false) && !featureServiceV2.hasAccess("AMAZON_PHOTOS_ALEXA_APP_AUTO_SAVE_ANDROID", false))) ? false : true;
    }

    public boolean isUnlimitedQuotaCheckFeatureAvailable() {
        FeatureServiceV2 featureServiceV2 = this.featureServiceV2Lazy.get();
        return (shouldDisableFeaturesForCurrentPlatform() || featureServiceV2 == null || !featureServiceV2.hasAccess(NativeFeatureRegistry.ALEXA_PHOTOS_AOSP_UPLOADS_PRIME, false)) ? false : true;
    }

    public boolean isUploaderV2Available() {
        return isManualUploadFeatureAvailable();
    }
}
