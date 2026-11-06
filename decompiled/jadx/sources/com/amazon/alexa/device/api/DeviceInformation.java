package com.amazon.alexa.device.api;

import android.util.DisplayMetrics;
import com.amazon.alexa.accessorykit.ModelTransformer;
import java.util.Locale;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\u001d\u001a\u00020\u001eH&J\b\u0010>\u001a\u00020\tH&R\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\n\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0012\u0010\u000f\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0012\u0010\u0011\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0012\u0010\u0013\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\fR\u0012\u0010\u0019\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\fR\u0012\u0010\u001f\u001a\u00020 X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0012\u0010#\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\fR\u0012\u0010%\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\fR\u0012\u0010'\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\fR\u001c\u0010)\u001a\u0004\u0018\u00010\u00048&X§\u0004¢\u0006\f\u0012\u0004\b*\u0010+\u001a\u0004\b,\u0010\fR\u0012\u0010-\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\fR\u0012\u0010/\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u001aR\u0012\u00100\u001a\u00020 X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\"R\u0012\u00102\u001a\u000203X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0012\u00106\u001a\u000207X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0012\u0010:\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\fR\u0012\u0010<\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\f¨\u0006?"}, d2 = {"Lcom/amazon/alexa/device/api/DeviceInformation;", "", "staticDeviceProfileData", "", "", "getStaticDeviceProfileData", "()Ljava/util/Map;", "getDynamicDeviceProfileData", "refreshData", "", "manufacturer", "getManufacturer", "()Ljava/lang/String;", "id", "getId", "model", "getModel", "language", "getLanguage", "locale", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "serial", "getSerial", "isFireOS", "()Z", "fireOSVersion", "getFireOSVersion", "refreshDeviceInfoData", "", "versionSdkInt", "", "getVersionSdkInt", "()I", "brand", "getBrand", "versionRelease", "getVersionRelease", "platformType", "getPlatformType", ModelTransformer.KEY_FIRMWARE_VERSION_NAME, "getVersionName$annotations", "()V", "getVersionName", "androidId", "getAndroidId", "isPhoneFormFactor", "memoryClass", "getMemoryClass", "screenSize", "", "getScreenSize", "()D", "displayMetrics", "Landroid/util/DisplayMetrics;", "getDisplayMetrics", "()Landroid/util/DisplayMetrics;", "deviceSerialNumber", "getDeviceSerialNumber", "deviceType", "getDeviceType", "hasFOSLegacyAlexa", "AlexaMobileAndroidDeviceApi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface DeviceInformation {
    @NotNull
    String getAndroidId();

    @NotNull
    String getBrand();

    @NotNull
    String getDeviceSerialNumber() throws DeviceInformationException;

    @NotNull
    String getDeviceType() throws DeviceInformationException;

    @NotNull
    DisplayMetrics getDisplayMetrics();

    @NotNull
    Map<String, Object> getDynamicDeviceProfileData(boolean refreshData);

    @Nullable
    String getFireOSVersion();

    @NotNull
    String getId();

    @NotNull
    String getLanguage();

    @NotNull
    Locale getLocale();

    @NotNull
    String getManufacturer();

    int getMemoryClass();

    @NotNull
    String getModel();

    @NotNull
    String getPlatformType();

    double getScreenSize();

    @NotNull
    String getSerial();

    @NotNull
    Map<String, Object> getStaticDeviceProfileData();

    @Nullable
    String getVersionName();

    @NotNull
    String getVersionRelease();

    int getVersionSdkInt();

    boolean hasFOSLegacyAlexa();

    boolean isFireOS();

    boolean isPhoneFormFactor();

    void refreshDeviceInfoData();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated(message = "Doesn't belong in DeviceInformation. Should be requested using PackageInfo.")
        public static /* synthetic */ void getVersionName$annotations() {
        }
    }
}
