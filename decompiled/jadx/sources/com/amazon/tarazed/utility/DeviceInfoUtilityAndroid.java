package com.amazon.tarazed.utility;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.amazon.deecomms.common.Constants;
import com.amazon.tarazed.notification.client.model.NotificationPlatform;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 <2\u00020\u0001:\u0001<B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u00020;H\u0002R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0012\u0010\u0018\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0012\u0010\u001c\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0012\u0010\u001d\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001aR\u0012\u0010\u001e\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001aR\u0012\u0010\u001f\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001aR\u0014\u0010 \u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\fR\u0014\u0010\"\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\fR\u0012\u0010$\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\fR\u0012\u0010&\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\fR\u0014\u0010,\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\fR\u0012\u0010.\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\fR\u0012\u00100\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\fR\u0014\u00102\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\fR\u0014\u00104\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0015R\u0014\u00106\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0015¨\u0006="}, d2 = {"Lcom/amazon/tarazed/utility/DeviceInfoUtilityAndroid;", "Lcom/amazon/tarazed/utility/DeviceInfoUtility;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "apiLevel", "", "getApiLevel", "()I", "app", "", "getApp", "()Ljava/lang/String;", "appContext", "getAppContext$TarazedAndroidLibrary_release", "()Landroid/content/Context;", "deviceLanguage", "getDeviceLanguage", "freeMemoryMb", "", "getFreeMemoryMb", "()J", "freeStorageMb", "getFreeStorageMb", "is1PDevice", "", "()Z", "isAtLeastFos6", "isAtLeastFos7", "isFireTV", "isFireTVEdition", "isTouchableDevice", "manufacturer", "getManufacturer", "model", "getModel", "name", "getName", "notificationPlatform", "Lcom/amazon/tarazed/notification/client/model/NotificationPlatform;", "getNotificationPlatform", "()Lcom/amazon/tarazed/notification/client/model/NotificationPlatform;", "operatingSystemName", "getOperatingSystemName", "operatingSystemVersion", "getOperatingSystemVersion", Constants.BUNDLE_SERIAL_NUMBER, "getSerialNumber", "softwareVersion", "getSoftwareVersion", "tarazedVersion", "getTarazedVersion", "totalMemoryMb", "getTotalMemoryMb", "totalStorageMb", "getTotalStorageMb", "dataDirectoryStatFs", "Landroid/os/StatFs;", "readMemoryInfo", "Landroid/app/ActivityManager$MemoryInfo;", "Companion", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceInfoUtilityAndroid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoUtilityAndroid.kt\ncom/amazon/tarazed/utility/DeviceInfoUtilityAndroid\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
/* loaded from: classes19.dex */
public abstract class DeviceInfoUtilityAndroid implements DeviceInfoUtility {
    private static final long BYTES_PER_MB = 1048576;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String OPERATING_SYSTEM = "Android";

    @NotNull
    private final Context appContext;

    @NotNull
    private final String operatingSystemName;

    public DeviceInfoUtilityAndroid(@NotNull Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.appContext = applicationContext;
        this.operatingSystemName = "Android";
    }

    private final StatFs dataDirectoryStatFs() {
        return new StatFs(Environment.getDataDirectory().getPath());
    }

    private final ActivityManager.MemoryInfo readMemoryInfo() {
        Object systemService = this.appContext.getSystemService("activity");
        systemService.getClass();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    public final int getApiLevel() {
        return Build.VERSION.SDK_INT;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtility
    @NotNull
    public String getApp() {
        String packageName = this.appContext.getPackageName();
        packageName.getClass();
        return packageName;
    }

    @NotNull
    /* renamed from: getAppContext$TarazedAndroidLibrary_release, reason: from getter */
    public final Context getAppContext() {
        return this.appContext;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtility
    @NotNull
    public String getDeviceLanguage() {
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        return language;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtility
    public long getFreeMemoryMb() {
        return readMemoryInfo().availMem / 1048576;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtility
    public long getFreeStorageMb() {
        return dataDirectoryStatFs().getAvailableBytes() / 1048576;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtility
    @NotNull
    public String getManufacturer() {
        String str = Build.MANUFACTURER;
        str.getClass();
        return str;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtility
    @NotNull
    public String getModel() {
        String str = Build.MODEL;
        str.getClass();
        return str;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtility
    @NotNull
    public abstract String getName();

    @Override // com.amazon.tarazed.utility.DeviceInfoUtility
    @NotNull
    public abstract NotificationPlatform getNotificationPlatform();

    @Override // com.amazon.tarazed.utility.DeviceInfoUtility
    @NotNull
    public String getOperatingSystemName() {
        return this.operatingSystemName;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtility
    @NotNull
    public String getOperatingSystemVersion() {
        String str = Build.VERSION.RELEASE;
        str.getClass();
        return str;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtility
    @NotNull
    public abstract String getSerialNumber();

    @Override // com.amazon.tarazed.utility.DeviceInfoUtility
    @NotNull
    public abstract String getSoftwareVersion();

    @Override // com.amazon.tarazed.utility.DeviceInfoUtility
    @NotNull
    public String getTarazedVersion() {
        return "unknown";
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtility
    public long getTotalMemoryMb() {
        return readMemoryInfo().totalMem / 1048576;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtility
    public long getTotalStorageMb() {
        return dataDirectoryStatFs().getTotalBytes() / 1048576;
    }

    @Override // com.amazon.tarazed.utility.DeviceInfoUtility
    public abstract boolean is1PDevice();

    @Override // com.amazon.tarazed.utility.DeviceInfoUtility
    public abstract boolean isAtLeastFos6();

    @Override // com.amazon.tarazed.utility.DeviceInfoUtility
    public abstract boolean isAtLeastFos7();

    @Override // com.amazon.tarazed.utility.DeviceInfoUtility
    public abstract boolean isFireTV();

    public abstract boolean isFireTVEdition();

    @Override // com.amazon.tarazed.utility.DeviceInfoUtility
    public abstract boolean isTouchableDevice();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/amazon/tarazed/utility/DeviceInfoUtilityAndroid$Companion;", "", "()V", "BYTES_PER_MB", "", "OPERATING_SYSTEM", "", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
