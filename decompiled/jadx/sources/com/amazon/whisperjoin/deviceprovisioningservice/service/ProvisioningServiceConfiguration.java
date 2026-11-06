package com.amazon.whisperjoin.deviceprovisioningservice.service;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.whisperjoin.common.sharedtypes.devices.DeviceFilter;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.locale.LocaleConfiguration;
import com.amazon.whisperjoin.devicesetupserviceandroidclient.internal.retrofit.DSSServiceConfiguration;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ProvisioningServiceConfiguration implements Parcelable {
    private static final String CONFIGURATION_SAVED_KEY = "ProvisioningServiceConfiguration.ConfigurationSaved";
    private static final String DEBUG_ENABLED = "ProvisioningServiceConfiguration.DebugEnabled";
    private static final String PREFIX = "ProvisioningServiceConfiguration.";
    private static final String PROVISIONABLE_BEACON_TYPE = "ProvisioningServiceConfiguration.ProvisionableBeaconType";
    private static final String PROVISIONER_APP_NAME = "ProvisioningServiceConfiguration.ProvisionerAppName";
    private static final String PROVISIONER_DEVICE_GROUP = "ProvisioningServiceConfiguration.ProvisionerDeviceGroup";
    private static final String PROVISIONER_VERSION_NUM = "ProvisioningServiceConfiguration.ProvisionerAppVersionNumber";
    private final CBLGenerationConfiguration mCblGenerationConfiguration;
    private final DSSServiceConfiguration mDSSServiceConfiguration;
    private final boolean mDebugEnabled;
    private final LocaleConfiguration mLocaleConfiguration;
    private final DeviceFilter.BeaconType mProvisionableBeaconType;
    private final String mProvisionerApplicationName;
    private final String mProvisionerDeviceGroup;
    private final String mProvisionerVersionNumber;
    private static final DSSServiceConfiguration DEFAULT_DSS_CONFIG = DSSServiceConfiguration.prod();
    public static final Parcelable.Creator<ProvisioningServiceConfiguration> CREATOR = new Parcelable.Creator<ProvisioningServiceConfiguration>() { // from class: com.amazon.whisperjoin.deviceprovisioningservice.service.ProvisioningServiceConfiguration.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProvisioningServiceConfiguration createFromParcel(Parcel parcel) {
            if (parcel != null) {
                return ProvisioningServiceConfiguration.getFromBundle(parcel.readBundle(getClass().getClassLoader()));
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProvisioningServiceConfiguration[] newArray(int i) {
            if (i >= 0) {
                return new ProvisioningServiceConfiguration[i];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("size cannot be negative.");
            return null;
        }
    };

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private CBLGenerationConfiguration mCblGenerationConfiguration;
        private LocaleConfiguration mLocaleConfiguration;
        private String mProvisionerApplicationName;
        private String mProvisionerDeviceGroup;
        private String mProvisionerVersionNumber;
        private DSSServiceConfiguration mDssServiceConfiguration = ProvisioningServiceConfiguration.DEFAULT_DSS_CONFIG;
        private boolean mDebugEnabled = false;
        private DeviceFilter.BeaconType mProvisionableBeaconType = DeviceFilter.BeaconType.OOBE;

        public ProvisioningServiceConfiguration createProvisioningServiceConfiguration() {
            if (this.mDssServiceConfiguration == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("mDssServiceConfiguration can not be null");
                return null;
            }
            if (this.mLocaleConfiguration == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("mLocaleConfiguration can not be null");
                return null;
            }
            if (this.mProvisionerApplicationName == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("mProvisionerApplicationName can not be null");
                return null;
            }
            if (this.mProvisionerVersionNumber == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("mProvisionerVersionNumber can not be null");
                return null;
            }
            if (this.mProvisionerDeviceGroup == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("mProvisionerDeviceGroup can not be null");
                return null;
            }
            if (this.mCblGenerationConfiguration == null) {
                this.mCblGenerationConfiguration = CBLGenerationConfiguration.Default();
            }
            return new ProvisioningServiceConfiguration(this.mLocaleConfiguration, this.mDssServiceConfiguration, this.mCblGenerationConfiguration, this.mProvisionerApplicationName, this.mProvisionerVersionNumber, this.mProvisionerDeviceGroup, this.mProvisionableBeaconType, this.mDebugEnabled, 0);
        }

        public Builder setCblGenerationConfiguration(CBLGenerationConfiguration cBLGenerationConfiguration) {
            this.mCblGenerationConfiguration = cBLGenerationConfiguration;
            return this;
        }

        public Builder setDebugEnabled(boolean z) {
            this.mDebugEnabled = z;
            return this;
        }

        public Builder setDssServiceConfiguration(DSSServiceConfiguration dSSServiceConfiguration) {
            this.mDssServiceConfiguration = dSSServiceConfiguration;
            return this;
        }

        public Builder setLocaleConfiguration(LocaleConfiguration localeConfiguration) {
            this.mLocaleConfiguration = localeConfiguration;
            return this;
        }

        public Builder setProvisionableBeaconType(DeviceFilter.BeaconType beaconType) {
            this.mProvisionableBeaconType = beaconType;
            return this;
        }

        public Builder setProvisionerApplicationName(String str) {
            this.mProvisionerApplicationName = str;
            return this;
        }

        public Builder setProvisionerDeviceGroup(String str) {
            this.mProvisionerDeviceGroup = str;
            return this;
        }

        public Builder setProvisionerVersionNumber(String str) {
            this.mProvisionerVersionNumber = str;
            return this;
        }
    }

    @Deprecated
    public ProvisioningServiceConfiguration(LocaleConfiguration localeConfiguration, DSSServiceConfiguration dSSServiceConfiguration, String str, String str2, String str3) {
        this.mLocaleConfiguration = localeConfiguration;
        if (dSSServiceConfiguration == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("DSSServiceConfiguration can not be null");
            throw null;
        }
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("ProvisionerApplicationName cannot be null");
            throw null;
        }
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("ProvisionerVersionNumber cannot be null");
            throw null;
        }
        if (str3 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("ProvisionerDeviceGroup cannot be null");
            throw null;
        }
        this.mDSSServiceConfiguration = dSSServiceConfiguration;
        this.mCblGenerationConfiguration = CBLGenerationConfiguration.Default();
        this.mProvisionerApplicationName = str;
        this.mProvisionerVersionNumber = str2;
        this.mProvisionerDeviceGroup = str3;
        this.mProvisionableBeaconType = DeviceFilter.BeaconType.OOBE;
        this.mDebugEnabled = false;
    }

    public static ProvisioningServiceConfiguration getFromBundle(Bundle bundle) {
        if (bundle != null) {
            return new Builder().setLocaleConfiguration(LocaleConfiguration.getFromBundle(bundle)).setDssServiceConfiguration(DSSServiceConfiguration.fromBundle(bundle)).setCblGenerationConfiguration(CBLGenerationConfiguration.fromBundle(bundle)).setProvisionerApplicationName(bundle.getString(PROVISIONER_APP_NAME)).setProvisionerVersionNumber(bundle.getString(PROVISIONER_VERSION_NUM)).setProvisionerDeviceGroup(bundle.getString(PROVISIONER_DEVICE_GROUP)).setProvisionableBeaconType(DeviceFilter.BeaconType.fromInt(bundle.getInt(PROVISIONABLE_BEACON_TYPE))).setDebugEnabled(bundle.getBoolean(DEBUG_ENABLED)).createProvisioningServiceConfiguration();
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Bundle can not be null");
        return null;
    }

    public static ProvisioningServiceConfiguration getFromSharedPreferences(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("SharedPreferences can not be null");
            return null;
        }
        if (sharedPreferences.getBoolean(CONFIGURATION_SAVED_KEY, false)) {
            return new Builder().setLocaleConfiguration(LocaleConfiguration.fromSharedPreferences(sharedPreferences)).setDssServiceConfiguration(DSSServiceConfiguration.fromSharedPreferences(sharedPreferences)).setCblGenerationConfiguration(CBLGenerationConfiguration.fromSharedPreferences(sharedPreferences)).setProvisionerApplicationName(sharedPreferences.getString(PROVISIONER_APP_NAME, null)).setProvisionerVersionNumber(sharedPreferences.getString(PROVISIONER_VERSION_NUM, null)).setProvisionerDeviceGroup(sharedPreferences.getString(PROVISIONER_DEVICE_GROUP, null)).setProvisionableBeaconType(DeviceFilter.BeaconType.fromInt(sharedPreferences.getInt(PROVISIONABLE_BEACON_TYPE, 0))).setDebugEnabled(sharedPreferences.getBoolean(DEBUG_ENABLED, false)).createProvisioningServiceConfiguration();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ProvisioningServiceConfiguration provisioningServiceConfiguration = (ProvisioningServiceConfiguration) obj;
            if (this.mDebugEnabled == provisioningServiceConfiguration.mDebugEnabled && Objects.equal(this.mLocaleConfiguration, provisioningServiceConfiguration.mLocaleConfiguration) && Objects.equal(this.mDSSServiceConfiguration, provisioningServiceConfiguration.mDSSServiceConfiguration) && Objects.equal(this.mCblGenerationConfiguration, provisioningServiceConfiguration.mCblGenerationConfiguration) && Objects.equal(this.mProvisionerApplicationName, provisioningServiceConfiguration.mProvisionerApplicationName) && Objects.equal(this.mProvisionerVersionNumber, provisioningServiceConfiguration.mProvisionerVersionNumber) && Objects.equal(this.mProvisionerDeviceGroup, provisioningServiceConfiguration.mProvisionerDeviceGroup) && Objects.equal(this.mProvisionableBeaconType, provisioningServiceConfiguration.mProvisionableBeaconType)) {
                return true;
            }
        }
        return false;
    }

    public CBLGenerationConfiguration getCblGenerationConfiguration() {
        return this.mCblGenerationConfiguration;
    }

    public DSSServiceConfiguration getDSSServiceConfiguration() {
        return this.mDSSServiceConfiguration;
    }

    public LocaleConfiguration getLocaleConfiguration() {
        return this.mLocaleConfiguration;
    }

    public DeviceFilter.BeaconType getProvisionableBeaconType() {
        return this.mProvisionableBeaconType;
    }

    public String getProvisionerApplicationName() {
        return this.mProvisionerApplicationName;
    }

    public String getProvisionerDeviceGroup() {
        return this.mProvisionerDeviceGroup;
    }

    public String getProvisionerVersionNumber() {
        return this.mProvisionerVersionNumber;
    }

    public int hashCode() {
        return Objects.hashCode(this.mLocaleConfiguration, this.mDSSServiceConfiguration, this.mCblGenerationConfiguration, this.mProvisionerApplicationName, this.mProvisionerVersionNumber, this.mProvisionerDeviceGroup, this.mProvisionableBeaconType, Boolean.valueOf(this.mDebugEnabled));
    }

    public boolean isDebugEnabled() {
        return this.mDebugEnabled;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mLocaleConfiguration", this.mLocaleConfiguration).add("mDSSServiceConfiguration", this.mDSSServiceConfiguration).add("mCBLGenerationConfiguration", this.mCblGenerationConfiguration).add("mProvisionerApplicationName", this.mProvisionerApplicationName).add("mProvisionerVersionNumber", this.mProvisionerVersionNumber).add("mProvisionerDeviceGroup", this.mProvisionerDeviceGroup).add("mProvisionableBeaconType", this.mProvisionableBeaconType.toString()).add("mDebugEnabled", this.mDebugEnabled).toString();
    }

    public void writeToBundle(Bundle bundle) {
        if (bundle == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Bundle can not be null");
            return;
        }
        this.mLocaleConfiguration.writeToBundle(bundle);
        this.mDSSServiceConfiguration.writeToBundle(bundle);
        this.mCblGenerationConfiguration.writeToBundle(bundle);
        bundle.putString(PROVISIONER_APP_NAME, this.mProvisionerApplicationName);
        bundle.putString(PROVISIONER_VERSION_NUM, this.mProvisionerVersionNumber);
        bundle.putString(PROVISIONER_DEVICE_GROUP, this.mProvisionerDeviceGroup);
        bundle.putInt(PROVISIONABLE_BEACON_TYPE, this.mProvisionableBeaconType.toInt());
        bundle.putBoolean(DEBUG_ENABLED, this.mDebugEnabled);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("dest cannot be null.");
            return;
        }
        Bundle bundle = new Bundle();
        LocaleConfiguration localeConfiguration = this.mLocaleConfiguration;
        if (localeConfiguration != null) {
            localeConfiguration.writeToBundle(bundle);
        }
        DSSServiceConfiguration dSSServiceConfiguration = this.mDSSServiceConfiguration;
        if (dSSServiceConfiguration != null) {
            dSSServiceConfiguration.writeToBundle(bundle);
        }
        CBLGenerationConfiguration cBLGenerationConfiguration = this.mCblGenerationConfiguration;
        if (cBLGenerationConfiguration != null) {
            cBLGenerationConfiguration.writeToBundle(bundle);
        }
        String str = this.mProvisionerApplicationName;
        if (str != null) {
            bundle.putString(PROVISIONER_APP_NAME, str);
        }
        String str2 = this.mProvisionerVersionNumber;
        if (str2 != null) {
            bundle.putString(PROVISIONER_VERSION_NUM, str2);
        }
        String str3 = this.mProvisionerDeviceGroup;
        if (str3 != null) {
            bundle.putString(PROVISIONER_DEVICE_GROUP, str3);
        }
        DeviceFilter.BeaconType beaconType = this.mProvisionableBeaconType;
        if (beaconType != null) {
            bundle.putInt(PROVISIONABLE_BEACON_TYPE, beaconType.toInt());
        }
        bundle.putBoolean(DEBUG_ENABLED, this.mDebugEnabled);
        parcel.writeBundle(bundle);
    }

    public void writeToSharedPreferences(SharedPreferences.Editor editor) {
        if (editor == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("editor can not be null");
            return;
        }
        this.mLocaleConfiguration.writeToSharedPreferences(editor);
        this.mDSSServiceConfiguration.writeToSharedPreferences(editor);
        this.mCblGenerationConfiguration.writeToSharedPreferences(editor);
        editor.putBoolean(CONFIGURATION_SAVED_KEY, true);
        editor.putString(PROVISIONER_APP_NAME, this.mProvisionerApplicationName);
        editor.putString(PROVISIONER_VERSION_NUM, this.mProvisionerVersionNumber);
        editor.putString(PROVISIONER_DEVICE_GROUP, this.mProvisionerDeviceGroup);
        editor.putInt(PROVISIONABLE_BEACON_TYPE, this.mProvisionableBeaconType.toInt());
        editor.putBoolean(DEBUG_ENABLED, this.mDebugEnabled);
        editor.apply();
    }

    private ProvisioningServiceConfiguration(LocaleConfiguration localeConfiguration, DSSServiceConfiguration dSSServiceConfiguration, CBLGenerationConfiguration cBLGenerationConfiguration, String str, String str2, String str3, DeviceFilter.BeaconType beaconType, boolean z) {
        this.mLocaleConfiguration = localeConfiguration;
        this.mDSSServiceConfiguration = dSSServiceConfiguration;
        this.mCblGenerationConfiguration = cBLGenerationConfiguration;
        this.mProvisionerApplicationName = str;
        this.mProvisionerVersionNumber = str2;
        this.mProvisionerDeviceGroup = str3;
        this.mProvisionableBeaconType = beaconType;
        this.mDebugEnabled = z;
    }

    public /* synthetic */ ProvisioningServiceConfiguration(LocaleConfiguration localeConfiguration, DSSServiceConfiguration dSSServiceConfiguration, CBLGenerationConfiguration cBLGenerationConfiguration, String str, String str2, String str3, DeviceFilter.BeaconType beaconType, boolean z, int i) {
        this(localeConfiguration, dSSServiceConfiguration, cBLGenerationConfiguration, str, str2, str3, beaconType, z);
    }
}
