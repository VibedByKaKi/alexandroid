package com.amazon.alexa.smarthomecameras.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.amazon.alexa.smarthomecameras.constants.MobilyticsConstants;
import com.amazon.alexa.smarthomecameras.constants.ViewConstants;
import com.amazon.alexa.smarthomecameras.ptz.directives.PhysicalPtzDirectiveConstants;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.text.WordUtils$$ExternalSyntheticLambda2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DevicePayload implements Parcelable {
    public static final Parcelable.Creator<DevicePayload> CREATOR = new Parcelable.Creator<DevicePayload>() { // from class: com.amazon.alexa.smarthomecameras.model.DevicePayload.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DevicePayload createFromParcel(Parcel parcel) {
            return new DevicePayload(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DevicePayload[] newArray(int i) {
            return new DevicePayload[i];
        }
    };
    private static final String TAG = "DevicePayload";
    private AfiFeatureList afiFeatureList;
    private DeviceCapabilityList capabilityList;
    private String deviceType;
    private boolean disableScroll;
    private boolean fitVideoToWindow;
    private boolean hideFullscreenButton;
    private boolean hidePrivacyBanner;
    private String manufacturerName;

    public DevicePayload(Parcel parcel) {
        this.manufacturerName = parcel.readString();
        this.deviceType = parcel.readString();
        this.capabilityList = (DeviceCapabilityList) parcel.readValue(DeviceCapabilityList.class.getClassLoader());
        this.afiFeatureList = (AfiFeatureList) parcel.readValue(AfiFeatureList.class.getClassLoader());
        this.hidePrivacyBanner = parcel.readByte() != 0;
        this.fitVideoToWindow = parcel.readByte() != 0;
        this.hideFullscreenButton = parcel.readByte() != 0;
        this.disableScroll = parcel.readByte() != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$is1P$0(String str) {
        return str.equalsIgnoreCase(this.manufacturerName);
    }

    private boolean supportsPhysicalPTZ(List<String> list) {
        List<Capability> list2;
        AfiFeatureList afiFeatureList = this.afiFeatureList;
        if (afiFeatureList != null && afiFeatureList.getFeatures() != null) {
            for (AfiFeature afiFeature : this.afiFeatureList.getFeatures()) {
                if (afiFeature.isRange() && afiFeature.containsInstances(list)) {
                    return true;
                }
            }
        }
        DeviceCapabilityList deviceCapabilityList = this.capabilityList;
        if (deviceCapabilityList == null || (list2 = deviceCapabilityList.capabilities) == null) {
            return false;
        }
        for (Capability capability : list2) {
            if (capability.isRangeController() && capability.containsInstances(list)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AfiFeatureList getAfiFeatureList() {
        return this.afiFeatureList;
    }

    public DeviceCapabilityList getCapabilityList() {
        return this.capabilityList;
    }

    @Nullable
    public String getDeviceType() {
        return this.deviceType;
    }

    public String getManufacturerName() {
        return this.manufacturerName;
    }

    public boolean is1P() {
        return MobilyticsConstants.PROVIDERS_1P.stream().anyMatch(new WordUtils$$ExternalSyntheticLambda2(this, 11));
    }

    public boolean isNest() {
        return this.manufacturerName.equalsIgnoreCase(ViewConstants.SmartAlertsGoogleManufacturerName);
    }

    public boolean isNetatmo() {
        return this.manufacturerName.equalsIgnoreCase(MobilyticsConstants.PROVIDER_NETATMO);
    }

    public boolean isRtsp() {
        List<Capability> list;
        AfiFeatureList afiFeatureList = this.afiFeatureList;
        if (afiFeatureList != null && afiFeatureList.getFeatures() != null) {
            Iterator<AfiFeature> it2 = this.afiFeatureList.getFeatures().iterator();
            while (it2.hasNext()) {
                if (it2.next().isRtcSession()) {
                    return false;
                }
            }
        }
        DeviceCapabilityList deviceCapabilityList = this.capabilityList;
        if (deviceCapabilityList == null || (list = deviceCapabilityList.capabilities) == null) {
            return true;
        }
        Iterator<Capability> it3 = list.iterator();
        while (it3.hasNext()) {
            if (it3.next().isRtcSessionController()) {
                return false;
            }
        }
        return true;
    }

    public boolean isiRobot() {
        return this.manufacturerName.equalsIgnoreCase(MobilyticsConstants.PROVIDER_IROBOT);
    }

    public void setDisableScroll(boolean z) {
        this.disableScroll = z;
    }

    public void setFitVideoToWindow(boolean z) {
        this.fitVideoToWindow = z;
    }

    public void setHideFullscreenButton(boolean z) {
        this.hideFullscreenButton = z;
    }

    public void setHidePrivacyBanner(boolean z) {
        this.hidePrivacyBanner = z;
    }

    public boolean shouldDisableScroll() {
        return this.disableScroll;
    }

    public boolean shouldFitVideoToWindow() {
        return this.fitVideoToWindow;
    }

    public boolean shouldHideFullscreenButton() {
        return this.hideFullscreenButton;
    }

    public boolean shouldHidePrivacyBanner() {
        return this.hidePrivacyBanner;
    }

    public boolean supportsFullDuplexComms() {
        List<Capability> list;
        CapabilityConfiguration capabilityConfiguration;
        AfiFeatureList afiFeatureList = this.afiFeatureList;
        if (afiFeatureList != null && afiFeatureList.getFeatures() != null) {
            for (AfiFeature afiFeature : this.afiFeatureList.getFeatures()) {
                if (afiFeature.isRtcSession()) {
                    AfiFeatureConfiguration afiFeatureConfiguration = afiFeature.configuration;
                    if (afiFeatureConfiguration != null) {
                        return afiFeatureConfiguration.isFullDuplexAudioSupported;
                    }
                    return true;
                }
            }
        }
        DeviceCapabilityList deviceCapabilityList = this.capabilityList;
        if (deviceCapabilityList == null || (list = deviceCapabilityList.capabilities) == null) {
            return false;
        }
        for (Capability capability : list) {
            if (capability.isRtcSessionController() && (capabilityConfiguration = capability.configuration) != null && capabilityConfiguration.isFullDuplexAudioSupported) {
                return true;
            }
        }
        return false;
    }

    public boolean supportsOds() {
        List<Capability> list;
        AfiFeatureList afiFeatureList = this.afiFeatureList;
        if (afiFeatureList != null && afiFeatureList.getFeatures() != null) {
            Iterator<AfiFeature> it2 = this.afiFeatureList.getFeatures().iterator();
            while (it2.hasNext()) {
                if (it2.next().isObjectDetection()) {
                    return true;
                }
            }
        }
        DeviceCapabilityList deviceCapabilityList = this.capabilityList;
        if (deviceCapabilityList == null || (list = deviceCapabilityList.capabilities) == null) {
            return false;
        }
        Iterator<Capability> it3 = list.iterator();
        while (it3.hasNext()) {
            if (it3.next().hasObjectDetectionSensor()) {
                return true;
            }
        }
        return false;
    }

    public boolean supportsPhysicalPan() {
        return supportsPhysicalPTZ(PhysicalPtzDirectiveConstants.CAMERA_PAN_INSTANCE_LIST);
    }

    public boolean supportsPhysicalTilt() {
        return supportsPhysicalPTZ(PhysicalPtzDirectiveConstants.CAMERA_TILT_INSTANCE_LIST);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.manufacturerName);
        parcel.writeString(this.deviceType);
        parcel.writeValue(this.capabilityList);
        parcel.writeValue(this.afiFeatureList);
        parcel.writeByte(this.hidePrivacyBanner ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.fitVideoToWindow ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.hideFullscreenButton ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.disableScroll ? (byte) 1 : (byte) 0);
    }

    public DevicePayload(String str, @Nullable AfiFeatureList afiFeatureList, @Nullable String str2) {
        this.manufacturerName = str;
        this.afiFeatureList = afiFeatureList;
        this.deviceType = str2;
    }

    public DevicePayload(String str, @Nullable DeviceCapabilityList deviceCapabilityList, @Nullable String str2) {
        this.manufacturerName = str;
        this.capabilityList = deviceCapabilityList;
        this.deviceType = str2;
    }
}
