package com.amazon.tarazed.utility;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.amazon.deecomms.common.Constants;
import com.amazon.tarazed.notification.client.model.NotificationPlatform;
import com.amazon.tarazed.registry.TarazedComponentRegistry;
import com.amazon.tarazed.registry.component.AccountMetadataProvider;
import com.amazon.tarazed.type.Account;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u0014\u0010\f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\bR\u0014\u0010\u0019\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000bR\u0014\u0010\u001b\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\bR\u0014\u0010\u001d\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\b¨\u0006 "}, d2 = {"Lcom/amazon/tarazed/utility/DeviceInfoUtilityAndroid1P;", "Lcom/amazon/tarazed/utility/DeviceInfoUtilityAndroid;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "app", "", "getApp", "()Ljava/lang/String;", "is1PDevice", "", "()Z", "isAtLeastFos6", "isAtLeastFos7", "isFireTV", "isFireTVEdition", "isTouchableDevice", "name", "getName", "notificationPlatform", "Lcom/amazon/tarazed/notification/client/model/NotificationPlatform;", "getNotificationPlatform", "()Lcom/amazon/tarazed/notification/client/model/NotificationPlatform;", "operatingSystemName", "getOperatingSystemName", "requiresVideoOrientationScalingHack", "getRequiresVideoOrientationScalingHack", Constants.BUNDLE_SERIAL_NUMBER, "getSerialNumber", "softwareVersion", "getSoftwareVersion", "Companion", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class DeviceInfoUtilityAndroid1P extends DeviceInfoUtilityAndroid {

    @NotNull
    private static final String AMAZON_FEATURE_TV_SCREEN = "com.amazon.hardware.tv_screen";

    @NotNull
    private static final String ANDROID_FEATURE_TOUCHSCREEN = "android.hardware.touchscreen";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String DEFAULT_VALUE_UNKNOWN = "Unknown";

    @NotNull
    private static final String OPERATING_SYSTEM = "FireOS";
    private final boolean is1PDevice;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceInfoUtilityAndroid1P(@NotNull Context context) {
        super(context);
        context.getClass();
        this.is1PDevice = true;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtilityAndroid, com.amazon.tarazed.utility.DeviceInfoUtility
    @NotNull
    public String getApp() {
        String packageName = getAppContext().getPackageName();
        packageName.getClass();
        return packageName;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtilityAndroid, com.amazon.tarazed.utility.DeviceInfoUtility
    @NotNull
    public String getName() {
        String str = Build.DEVICE;
        str.getClass();
        return str;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtilityAndroid, com.amazon.tarazed.utility.DeviceInfoUtility
    @NotNull
    public NotificationPlatform getNotificationPlatform() {
        return NotificationPlatform.ADM;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtilityAndroid, com.amazon.tarazed.utility.DeviceInfoUtility
    @NotNull
    public String getOperatingSystemName() {
        return "FireOS";
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtility
    public boolean getRequiresVideoOrientationScalingHack() {
        String str = Build.DEVICE;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -874833281:
                return str.equals("thebes");
            case -146017416:
                return str.equals("hoya_ftv");
            case 3208783:
                return str.equals("hoya");
            case 93081855:
                return str.equals("ariel");
            case 93122529:
                return str.equals("aston");
            case 949301367:
                return str.equals("memphis");
            default:
                return false;
        }
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtilityAndroid, com.amazon.tarazed.utility.DeviceInfoUtility
    @NotNull
    public String getSerialNumber() {
        Account accountMetadata;
        AccountMetadataProvider accountMetadataProvider = (AccountMetadataProvider) TarazedComponentRegistry.INSTANCE.getComponent(AccountMetadataProvider.class);
        String deviceSerialNumber = (accountMetadataProvider == null || (accountMetadata = accountMetadataProvider.getAccountMetadata()) == null) ? null : accountMetadata.getDeviceSerialNumber();
        return (deviceSerialNumber == null || deviceSerialNumber.length() == 0) ? "Unknown" : deviceSerialNumber;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtilityAndroid, com.amazon.tarazed.utility.DeviceInfoUtility
    @NotNull
    public String getSoftwareVersion() {
        try {
            String str = getAppContext().getPackageManager().getPackageInfo(getAppContext().getPackageName(), 0).versionName;
            str.getClass();
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "Unknown";
        }
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtilityAndroid, com.amazon.tarazed.utility.DeviceInfoUtility
    /* renamed from: is1PDevice, reason: from getter */
    public boolean getIs1PDevice() {
        return this.is1PDevice;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtilityAndroid, com.amazon.tarazed.utility.DeviceInfoUtility
    public boolean isAtLeastFos6() {
        return true;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtilityAndroid, com.amazon.tarazed.utility.DeviceInfoUtility
    public boolean isAtLeastFos7() {
        return true;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtilityAndroid, com.amazon.tarazed.utility.DeviceInfoUtility
    public boolean isFireTV() {
        return !isTouchableDevice();
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtilityAndroid
    public boolean isFireTVEdition() {
        return getAppContext().getPackageManager().hasSystemFeature(AMAZON_FEATURE_TV_SCREEN);
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtilityAndroid, com.amazon.tarazed.utility.DeviceInfoUtility
    public boolean isTouchableDevice() {
        return getAppContext().getPackageManager().hasSystemFeature(ANDROID_FEATURE_TOUCHSCREEN);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/tarazed/utility/DeviceInfoUtilityAndroid1P$Companion;", "", "()V", "AMAZON_FEATURE_TV_SCREEN", "", "ANDROID_FEATURE_TOUCHSCREEN", "DEFAULT_VALUE_UNKNOWN", "OPERATING_SYSTEM", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
