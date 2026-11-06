package com.amazon.alexa.handsfree.devices;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.devices.constants.Carrier;
import com.amazon.alexa.handsfree.devices.constants.Manufacturer;
import com.amazon.alexa.handsfree.devices.constants.VoiceApp;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfComponentsProvider;
import com.amazon.alexa.handsfree.protocols.dependencies.FalcoProtocolComponent;
import com.amazon.alexa.handsfree.protocols.features.HandsFreeComponent;
import com.amazon.alexa.handsfree.protocols.features.HandsFreeUserIdentity;
import com.amazon.alexa.handsfree.protocols.features.HandsFreeUserIdentityProvider;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.enrollmenttype.EnrollmentStatus;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.enrollmenttype.EnrollmentStatusManager;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.protocols.utils.VoiceAppStatusProvider;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AMPDInformationProvider {
    public static final String DEVICE_CARRIER_KEY = "carrier";
    public static final String DEVICE_KEY = "device";
    public static final String DEVICE_MANUFACTURER_KEY = "manufacturer";
    public static final String DEVICE_MODEL_KEY = "model";
    public static final String DEVICE_PRODUCT_KEY = "product";
    public static final String DEVICE_TYPE_KEY = "type";
    private static final int MINIMUM_SUPPORTED_ANDROID_VERSION = 26;

    @VisibleForTesting
    static final String NULL_STRING = "null";

    @VisibleForTesting
    static final int QVA_TRUE_TURN_KEY_MIN_VERSION_CODE = 301001;

    @VisibleForTesting
    static final int QVA_TRUE_TURN_KEY_STUB_VERSION_CODE = 301000;
    private static final String TAG = "AMPDInformationProvider";

    @VisibleForTesting
    static final String VESPER_PACKAGE = "com.verizon.mips.services";
    private static AMPDInformationProvider mInstance;
    private final AHFSunsetWeblabStateProvider mAHFSunsetWeblabStateProvider;
    private final Context mContext;
    private DeviceInformation mDeviceInformation;
    private final Map<String, String> mDeviceInformationMap;

    @VisibleForTesting
    HandsFreeUserIdentityProvider mHandsFreeUserProvider = null;

    @VisibleForTesting
    Boolean mIsDeviceWeblabEnabled = null;
    private final PackageManager mPackageManager;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class AHFSdkSupporter implements VoiceAppStatusProvider {
        public AHFSdkSupporter() {
        }

        @Override // com.amazon.alexa.handsfree.protocols.utils.VoiceAppStatusProvider
        public boolean isAHFSdkSupported() {
            if (AMPDInformationProvider.this.mDeviceInformation == null) {
                return false;
            }
            VoiceApp voiceApp = AMPDInformationProvider.this.mDeviceInformation.getVoiceApp();
            PackageInfo packageInfoIfEnabled = AMPDInformationProvider.this.getPackageInfoIfEnabled(voiceApp.getPackageName());
            if (packageInfoIfEnabled == null) {
                return false;
            }
            return AMPDInformationProvider.this.isHandsFreeCapable() && (packageInfoIfEnabled.versionCode >= voiceApp.getAHFSdkSupportedMinVersion());
        }
    }

    @VisibleForTesting
    public AMPDInformationProvider(@NonNull Context context, @NonNull DeviceTypeInformationProvider deviceTypeInformationProvider, @NonNull Map<String, String> map, @NonNull AHFSunsetWeblabStateProvider aHFSunsetWeblabStateProvider) {
        this.mDeviceInformation = deviceTypeInformationProvider.getSupportedDeviceInformation(context);
        this.mDeviceInformationMap = map;
        this.mPackageManager = context.getPackageManager();
        this.mContext = context;
        this.mAHFSunsetWeblabStateProvider = aHFSunsetWeblabStateProvider;
    }

    public static synchronized AMPDInformationProvider getInstance(@NonNull Context context) {
        AMPDInformationProvider aMPDInformationProvider;
        synchronized (AMPDInformationProvider.class) {
            try {
                if (mInstance == null) {
                    mInstance = new AMPDInformationProvider(context, DeviceTypeInformationProvider.getInstance(context), new HashMap(), AHFSunsetWeblabStateProvider.getInstance(context));
                }
                aMPDInformationProvider = mInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aMPDInformationProvider;
    }

    private boolean hasAmokVoiceApp() {
        PackageInfo packageInfoIfEnabled = getPackageInfoIfEnabled(VoiceApp.QUEBEC.getPackageName());
        return (packageInfoIfEnabled != null && packageInfoIfEnabled.versionCode < QVA_TRUE_TURN_KEY_MIN_VERSION_CODE) || (getPackageInfoIfEnabled(VoiceApp.MIKE.getPackageName()) != null);
    }

    private boolean isEnrollmentComplete() {
        try {
            return getEnrollmentStatusManager().getEnrollmentStatus() != EnrollmentStatus.SETUP_NOT_SET;
        } catch (Exception e) {
            Log.e(TAG, "isEnrollmentComplete: " + e);
            return false;
        }
    }

    private boolean isRootedBinaryOnDevice() {
        String[] strArr = {"/system/app/Superuser.apk", "/system/bin/failsafe/su", "/system/bin/su", "/system/xbin/su", "/system/xbin/which su", "/system/bin/which su", "/system/usr/we-need-root/su-backup"};
        for (int i = 0; i < 7; i++) {
            if (new File(strArr[i]).exists()) {
                return true;
            }
        }
        return false;
    }

    private boolean isVendorRootedDevice() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    @NonNull
    public Map<String, String> getDeviceInformation() {
        if (this.mDeviceInformation != null && this.mDeviceInformationMap.isEmpty()) {
            this.mDeviceInformationMap.put("type", this.mDeviceInformation.getType());
            this.mDeviceInformationMap.put("model", this.mDeviceInformation.getModel());
            this.mDeviceInformationMap.put("manufacturer", this.mDeviceInformation.getManufacturer());
            this.mDeviceInformationMap.put(DEVICE_PRODUCT_KEY, this.mDeviceInformation.getProduct());
            this.mDeviceInformationMap.put("device", this.mDeviceInformation.getDevice());
            this.mDeviceInformationMap.put(DEVICE_CARRIER_KEY, this.mDeviceInformation.getCarrier());
        }
        return this.mDeviceInformationMap;
    }

    public boolean getDeviceRootStatus() {
        return isRootedBinaryOnDevice() || isVendorRootedDevice();
    }

    public EnrollmentStatusManager getEnrollmentStatusManager() {
        return EnrollmentStatusManager.getInstance(this.mContext);
    }

    @Nullable
    public PackageInfo getPackageInfoIfEnabled(@NonNull String str) {
        try {
            if (this.mPackageManager.getApplicationInfo(str, 0).enabled) {
                return this.mPackageManager.getPackageInfo(str, 0);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public String getSettingsComponent() {
        return null;
    }

    public String getSetupComponent() {
        return null;
    }

    @Nullable
    public String getVoiceAppPackageName() {
        DeviceInformation deviceInformation = this.mDeviceInformation;
        if (deviceInformation == null) {
            return null;
        }
        return deviceInformation.getVoiceApp().getPackageName();
    }

    @NonNull
    public String getVoiceAppPackageNameString() {
        DeviceInformation deviceInformation = this.mDeviceInformation;
        return deviceInformation == null ? "null" : deviceInformation.getVoiceApp().getPackageName();
    }

    @Nullable
    public Integer getVoiceAppVersion() {
        PackageInfo packageInfoIfEnabled;
        DeviceInformation deviceInformation = this.mDeviceInformation;
        if (deviceInformation == null || (packageInfoIfEnabled = getPackageInfoIfEnabled(deviceInformation.getVoiceApp().getPackageName())) == null) {
            return null;
        }
        return Integer.valueOf(packageInfoIfEnabled.versionCode);
    }

    @NonNull
    public String getVoiceAppVersionName() {
        PackageInfo packageInfoIfEnabled;
        DeviceInformation deviceInformation = this.mDeviceInformation;
        return (deviceInformation == null || (packageInfoIfEnabled = getPackageInfoIfEnabled(deviceInformation.getVoiceApp().getPackageName())) == null) ? "null" : packageInfoIfEnabled.versionName;
    }

    @NonNull
    public String getVoiceAppVersionString() {
        Integer voiceAppVersion = getVoiceAppVersion();
        return voiceAppVersion == null ? "null" : Integer.toString(voiceAppVersion.intValue());
    }

    @VisibleForTesting
    public boolean hasSupportedVoiceApp() {
        PackageInfo packageInfoIfEnabled = getPackageInfoIfEnabled(this.mDeviceInformation.getVoiceApp().getPackageName());
        if (packageInfoIfEnabled == null) {
            return false;
        }
        Integer supportedVoiceAppVersion = this.mDeviceInformation.getSupportedVoiceAppVersion();
        return supportedVoiceAppVersion == null || packageInfoIfEnabled.versionCode >= supportedVoiceAppVersion.intValue();
    }

    public boolean isAMPDDevice() {
        return isPTAOrWidgetPreload() || isPTTDevice() || isHandsFreeCapable();
    }

    public boolean isAhfSunsetWeblabEnabled(@NonNull HandsFreeComponent handsFreeComponent) {
        try {
            if (this.mHandsFreeUserProvider == null) {
                this.mHandsFreeUserProvider = ((FalcoProtocolComponent) AhfComponentsProvider.getComponent(this.mContext, FalcoProtocolComponent.class)).handsFreeUserIdentityProvider();
            }
            HandsFreeUserIdentity handsFreeUserIdentity = this.mHandsFreeUserProvider.getHandsFreeUserIdentity();
            if (handsFreeUserIdentity != null) {
                if (handsFreeUserIdentity.hasComponent(handsFreeComponent)) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e) {
            Log.e(TAG, "AhfComponentsProvider is not set up.", e, new Object[0]);
            return false;
        }
    }

    @VisibleForTesting
    public boolean isAlexaAvailable(Context context) {
        return FireTabletUtils.isAlexaAvailable(this.mContext);
    }

    public boolean isAmok() {
        return hasAmokVoiceApp() && isHandsFreeCapable();
    }

    @Deprecated
    public boolean isBSR() {
        return false;
    }

    @VisibleForTesting
    public boolean isDeviceWeblabEnabled() {
        Boolean bool = this.mIsDeviceWeblabEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.mHandsFreeUserProvider == null) {
            try {
                this.mHandsFreeUserProvider = ((FalcoProtocolComponent) AhfComponentsProvider.getComponent(this.mContext, FalcoProtocolComponent.class)).handsFreeUserIdentityProvider();
            } catch (RuntimeException e) {
                Log.e(TAG, "AhfComponentsProvider is not set up.", e, new Object[0]);
                this.mIsDeviceWeblabEnabled = Boolean.TRUE;
                return true;
            }
        }
        HandsFreeUserIdentityProvider handsFreeUserIdentityProvider = this.mHandsFreeUserProvider;
        if (handsFreeUserIdentityProvider != null && handsFreeUserIdentityProvider.getHandsFreeUserIdentity() != null && this.mHandsFreeUserProvider.getHandsFreeAppSwitcher() != null) {
            String weblab = this.mHandsFreeUserProvider.getHandsFreeAppSwitcher().getWeblab();
            if (weblab != null) {
                HandsFreeUserIdentity handsFreeUserIdentity = this.mHandsFreeUserProvider.getHandsFreeUserIdentity();
                boolean isFeatureCheckerReady = handsFreeUserIdentity.isFeatureCheckerReady();
                if (!handsFreeUserIdentity.isWeblabEnabled(weblab)) {
                    this.mIsDeviceWeblabEnabled = isFeatureCheckerReady ? Boolean.FALSE : null;
                    return false;
                }
                this.mIsDeviceWeblabEnabled = isFeatureCheckerReady ? Boolean.TRUE : null;
            } else {
                this.mIsDeviceWeblabEnabled = Boolean.TRUE;
            }
        }
        return true;
    }

    public boolean isEdgeSV() {
        DeviceInformation deviceInformation = this.mDeviceInformation;
        if (deviceInformation == null) {
            return false;
        }
        VoiceApp voiceApp = deviceInformation.getVoiceApp();
        PackageInfo packageInfoIfEnabled = getPackageInfoIfEnabled(voiceApp.getPackageName());
        if (packageInfoIfEnabled == null) {
            return false;
        }
        return isHandsFreeCapable() && this.mDeviceInformation.isEdgeSV() && (packageInfoIfEnabled.versionCode >= voiceApp.getMinVersion1PSV());
    }

    public boolean isHandsFreeCapable() {
        boolean z = false;
        if (this.mDeviceInformation == null) {
            return false;
        }
        if (!hasSupportedVoiceApp() && !this.mDeviceInformation.getVoiceApp().equals(VoiceApp.MIKE)) {
            return false;
        }
        if (this.mDeviceInformation.getVersionComparator() != null && !this.mDeviceInformation.getVersionComparator().hasMinimumVersion()) {
            return false;
        }
        if (this.mAHFSunsetWeblabStateProvider.getAHFSunsetWeblabState(HandsFreeComponent.REMOVE_AHF_FOR_ALL_CUSTOMERS)) {
            Log.i(TAG, "AHF sunset makes device hands-free incapable for all users");
            return false;
        }
        if (this.mDeviceInformation.isIncompatibleAndroidSOrGreater()) {
            Log.i(TAG, "AHF sunset makes device hands-free incapable for incompatible OS");
            return false;
        }
        if (!hasSupportedVoiceApp() || !this.mDeviceInformation.getVoiceApp().equals(VoiceApp.FOXTROT)) {
            if (isEnrollmentComplete()) {
                return isDeviceWeblabEnabled();
            }
            Log.i(TAG, "AHF sunset makes device hands-free incapable for new users");
            return false;
        }
        boolean isVoiceAppSupported = FireTabletUtils.isVoiceAppSupported(this.mContext);
        boolean isAlexaAvailable = isAlexaAvailable(this.mContext);
        String str = TAG;
        Log.d(str, "isVoiceAppSupported? " + isVoiceAppSupported + ", isAlexaAvailable: " + isAlexaAvailable);
        if (isVoiceAppSupported && isAlexaAvailable) {
            z = true;
        }
        Log.i(str, "Enable hands free on fire tablets? " + z);
        return z;
    }

    public boolean isHandsFreeMike() {
        return isHandsFreeCapable() && VoiceApp.MIKE.equals(this.mDeviceInformation.getVoiceApp());
    }

    public boolean isHandsFreeXray() {
        return isHandsFreeCapable() && Manufacturer.XRAY.getManufacturer().equals(this.mDeviceInformation.getManufacturer());
    }

    public boolean isPTAOrWidgetPreload() {
        return false;
    }

    public boolean isPTTDevice() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isTrueTurnKey() {
        /*
            r7 = this;
            com.amazon.alexa.handsfree.devices.constants.VoiceApp[] r0 = com.amazon.alexa.handsfree.devices.constants.VoiceApp.values()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L7:
            r4 = 1
            if (r3 >= r1) goto L33
            r5 = r0[r3]
            com.amazon.alexa.handsfree.devices.constants.VoiceApp r6 = com.amazon.alexa.handsfree.devices.constants.VoiceApp.MIKE
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L15
            goto L1f
        L15:
            java.lang.String r6 = r5.getPackageName()
            android.content.pm.PackageInfo r6 = r7.getPackageInfoIfEnabled(r6)
            if (r6 != 0) goto L22
        L1f:
            int r3 = r3 + 1
            goto L7
        L22:
            com.amazon.alexa.handsfree.devices.constants.VoiceApp r0 = com.amazon.alexa.handsfree.devices.constants.VoiceApp.QUEBEC
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L31
            int r0 = r6.versionCode
            r1 = 301001(0x497c9, float:4.21792E-40)
            if (r0 < r1) goto L33
        L31:
            r0 = r4
            goto L34
        L33:
            r0 = r2
        L34:
            boolean r7 = r7.isHandsFreeCapable()
            if (r7 == 0) goto L3d
            if (r0 == 0) goto L3d
            return r4
        L3d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.handsfree.devices.AMPDInformationProvider.isTrueTurnKey():boolean");
    }

    public boolean isTrueTurnKeyCapable() {
        PackageInfo packageInfoIfEnabled;
        if (this.mDeviceInformation == null) {
            return false;
        }
        if (!hasSupportedVoiceApp() && !this.mDeviceInformation.getVoiceApp().equals(VoiceApp.MIKE)) {
            return false;
        }
        if (this.mDeviceInformation.getVersionComparator() != null && !this.mDeviceInformation.getVersionComparator().hasMinimumVersion()) {
            return false;
        }
        VoiceApp[] values = VoiceApp.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            VoiceApp voiceApp = values[i];
            if (voiceApp.equals(VoiceApp.MIKE) || (packageInfoIfEnabled = getPackageInfoIfEnabled(voiceApp.getPackageName())) == null) {
                i++;
            } else if ((!voiceApp.equals(VoiceApp.QUEBEC) || packageInfoIfEnabled.versionCode >= QVA_TRUE_TURN_KEY_MIN_VERSION_CODE) && isDeviceWeblabEnabled()) {
                return true;
            }
        }
        return false;
    }

    public boolean isTrueTurnkeyQVAStub() {
        PackageInfo packageInfoIfEnabled = getPackageInfoIfEnabled(VoiceApp.QUEBEC.getPackageName());
        return packageInfoIfEnabled != null && packageInfoIfEnabled.versionCode == QVA_TRUE_TURN_KEY_STUB_VERSION_CODE;
    }

    public boolean isVesper() {
        return isHandsFreeCapable() && Carrier.VESPER.getCarrier().equals(this.mDeviceInformation.getCarrier()) && isVesperAppPresent();
    }

    public boolean isVesperAppPresent() {
        return getPackageInfoIfEnabled(VESPER_PACKAGE) != null;
    }
}
