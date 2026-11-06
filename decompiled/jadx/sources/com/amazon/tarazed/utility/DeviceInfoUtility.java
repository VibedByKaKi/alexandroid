package com.amazon.tarazed.utility;

import com.amazon.deecomms.common.Constants;
import com.amazon.tarazed.notification.client.model.NotificationPlatform;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0013\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0012\u0010\u0012\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0012\u0010\u0013\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u0012\u0010\u0014\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0012\u0010\u0015\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0005R\u0012\u0010\u0017\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0005R\u0012\u0010\u0019\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0005R\u0012\u0010\u001b\u001a\u00020\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0012\u0010\u001f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0005R\u0012\u0010!\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0005R\u0012\u0010#\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0010R\u0012\u0010%\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0005R\u0014\u0010'\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0005R\u0012\u0010)\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0005R\u0012\u0010+\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u000bR\u0012\u0010-\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u000b¨\u0006/"}, d2 = {"Lcom/amazon/tarazed/utility/DeviceInfoUtility;", "", "app", "", "getApp", "()Ljava/lang/String;", "deviceLanguage", "getDeviceLanguage", "freeMemoryMb", "", "getFreeMemoryMb", "()J", "freeStorageMb", "getFreeStorageMb", "is1PDevice", "", "()Z", "isAtLeastFos6", "isAtLeastFos7", "isFireTV", "isTouchableDevice", "manufacturer", "getManufacturer", "model", "getModel", "name", "getName", "notificationPlatform", "Lcom/amazon/tarazed/notification/client/model/NotificationPlatform;", "getNotificationPlatform", "()Lcom/amazon/tarazed/notification/client/model/NotificationPlatform;", "operatingSystemName", "getOperatingSystemName", "operatingSystemVersion", "getOperatingSystemVersion", "requiresVideoOrientationScalingHack", "getRequiresVideoOrientationScalingHack", Constants.BUNDLE_SERIAL_NUMBER, "getSerialNumber", "softwareVersion", "getSoftwareVersion", "tarazedVersion", "getTarazedVersion", "totalMemoryMb", "getTotalMemoryMb", "totalStorageMb", "getTotalStorageMb", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public interface DeviceInfoUtility {
    @NotNull
    String getApp();

    @NotNull
    String getDeviceLanguage();

    long getFreeMemoryMb();

    long getFreeStorageMb();

    @NotNull
    String getManufacturer();

    @NotNull
    String getModel();

    @NotNull
    String getName();

    @NotNull
    NotificationPlatform getNotificationPlatform();

    @NotNull
    String getOperatingSystemName();

    @NotNull
    String getOperatingSystemVersion();

    boolean getRequiresVideoOrientationScalingHack();

    @NotNull
    String getSerialNumber();

    @Nullable
    String getSoftwareVersion();

    @NotNull
    String getTarazedVersion();

    long getTotalMemoryMb();

    long getTotalStorageMb();

    boolean is1PDevice();

    boolean isAtLeastFos6();

    boolean isAtLeastFos7();

    boolean isFireTV();

    boolean isTouchableDevice();
}
