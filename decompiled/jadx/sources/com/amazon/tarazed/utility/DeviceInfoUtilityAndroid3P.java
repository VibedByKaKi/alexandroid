package com.amazon.tarazed.utility;

import android.content.Context;
import android.content.pm.PackageManager;
import com.amazon.alexa.smarthomecameras.constants.MobilyticsConstants;
import com.amazon.deecomms.common.Constants;
import com.amazon.tarazed.notification.client.model.NotificationPlatform;
import com.amazon.tarazed.registry.TarazedComponentRegistry;
import com.amazon.tarazed.registry.component.AccountMetadataProvider;
import com.amazon.tarazed.type.Account;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0017\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/amazon/tarazed/utility/DeviceInfoUtilityAndroid3P;", "Lcom/amazon/tarazed/utility/DeviceInfoUtilityAndroid;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "is1PDevice", "", "()Z", "isAtLeastFos6", "isAtLeastFos7", "isFireTV", "isFireTVEdition", "isTouchableDevice", "name", "", "getName", "()Ljava/lang/String;", "notificationPlatform", "Lcom/amazon/tarazed/notification/client/model/NotificationPlatform;", "getNotificationPlatform", "()Lcom/amazon/tarazed/notification/client/model/NotificationPlatform;", "requiresVideoOrientationScalingHack", "getRequiresVideoOrientationScalingHack", Constants.BUNDLE_SERIAL_NUMBER, "getSerialNumber", "softwareVersion", "getSoftwareVersion", "Companion", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class DeviceInfoUtilityAndroid3P extends DeviceInfoUtilityAndroid {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String DEFAULT_VALUE_UNKNOWN = "Unknown";
    private final boolean is1PDevice;
    private final boolean isAtLeastFos6;
    private final boolean isAtLeastFos7;
    private final boolean isFireTV;
    private final boolean isFireTVEdition;
    private final boolean isTouchableDevice;

    @NotNull
    private final String name;

    @NotNull
    private final NotificationPlatform notificationPlatform;
    private final boolean requiresVideoOrientationScalingHack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceInfoUtilityAndroid3P(@NotNull Context context) {
        super(context);
        context.getClass();
        this.name = MobilyticsConstants.PROVIDER_3P_SUFFIX;
        this.notificationPlatform = NotificationPlatform.FCM;
        this.isTouchableDevice = true;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtilityAndroid, com.amazon.tarazed.utility.DeviceInfoUtility
    @NotNull
    public String getName() {
        return this.name;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtilityAndroid, com.amazon.tarazed.utility.DeviceInfoUtility
    @NotNull
    public NotificationPlatform getNotificationPlatform() {
        return this.notificationPlatform;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtility
    public boolean getRequiresVideoOrientationScalingHack() {
        return this.requiresVideoOrientationScalingHack;
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
    /* renamed from: isAtLeastFos6, reason: from getter */
    public boolean getIsAtLeastFos6() {
        return this.isAtLeastFos6;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtilityAndroid, com.amazon.tarazed.utility.DeviceInfoUtility
    /* renamed from: isAtLeastFos7, reason: from getter */
    public boolean getIsAtLeastFos7() {
        return this.isAtLeastFos7;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtilityAndroid, com.amazon.tarazed.utility.DeviceInfoUtility
    /* renamed from: isFireTV, reason: from getter */
    public boolean getIsFireTV() {
        return this.isFireTV;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtilityAndroid
    /* renamed from: isFireTVEdition, reason: from getter */
    public boolean getIsFireTVEdition() {
        return this.isFireTVEdition;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtilityAndroid, com.amazon.tarazed.utility.DeviceInfoUtility
    /* renamed from: isTouchableDevice, reason: from getter */
    public boolean getIsTouchableDevice() {
        return this.isTouchableDevice;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/amazon/tarazed/utility/DeviceInfoUtilityAndroid3P$Companion;", "", "()V", "DEFAULT_VALUE_UNKNOWN", "", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
