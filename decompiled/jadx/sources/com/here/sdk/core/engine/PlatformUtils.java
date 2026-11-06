package com.here.sdk.core.engine;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.NativeBase;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class PlatformUtils extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class PlatformInformation {

        @Nullable
        public String cachePath;

        @Nullable
        public String platformName;

        @Nullable
        public String platformVersion;

        @Nullable
        public String privateStoragePath;

        public PlatformInformation(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.platformName = str;
            this.platformVersion = str2;
            this.privateStoragePath = str3;
            this.cachePath = str4;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlatformInformation)) {
                return false;
            }
            PlatformInformation platformInformation = (PlatformInformation) obj;
            return Objects.equals(this.platformName, platformInformation.platformName) && Objects.equals(this.platformVersion, platformInformation.platformVersion) && Objects.equals(this.privateStoragePath, platformInformation.privateStoragePath) && Objects.equals(this.cachePath, platformInformation.cachePath);
        }

        public int hashCode() {
            String str = this.platformName;
            int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.platformVersion;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.privateStoragePath;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.cachePath;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    public PlatformUtils(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.core.engine.PlatformUtils.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                PlatformUtils.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @NonNull
    public static native Context getAndroidContext();

    @NonNull
    public static native AssetsLoader getAssetsLoader(@NonNull String str);

    @NonNull
    public static native CAresInitialiserBridge getCAresInitialiserBridge();

    @NonNull
    public static native ConnectivityStatusNotifier getConnectivityStatusNotifier();

    @NonNull
    public static native DeviceIdStorage getDeviceIdStorageImpl();

    @Nullable
    public static native DnsChangeNotifier getDnsChangeNotifier();

    @NonNull
    public static native OptionalModulesInitializer getOptionalModulesInitializer();

    @NonNull
    public static native PlatformInformation getPlatformInformation();

    @NonNull
    public static native ProcessKiller getProcessKiller();

    public static native void setAndroidContext(@NonNull Context context);

    public static native void setAssetsLoader(@NonNull String str, @NonNull AssetsLoader assetsLoader);

    public static native void setCAresInitialiserBridge(@NonNull CAresInitialiserBridge cAresInitialiserBridge);

    public static native void setConnectivityStatusNotifier(@NonNull ConnectivityStatusNotifier connectivityStatusNotifier);

    public static native void setDefaultAssetsLoader(@NonNull String str, @NonNull String str2);

    public static native void setDeviceIdStorageImpl(@NonNull DeviceIdStorage deviceIdStorage);

    public static native void setDnsChangeNotifier(@Nullable DnsChangeNotifier dnsChangeNotifier);

    public static native void setLocaleFactory(@NonNull LocaleFactory localeFactory);

    public static native void setOptionalModulesInitializer(@NonNull OptionalModulesInitializer optionalModulesInitializer);

    public static native void setPlatformInformation(@NonNull PlatformInformation platformInformation);

    public static native void setProcessKiller(@NonNull ProcessKiller processKiller);
}
