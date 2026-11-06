package com.here.sdk.core.engine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.SDKLibraryLoader;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class SDKOptions {
    static final SDKLibraryLoader LIBRARY_LOADER = new SDKLibraryLoader("SDK");

    @NonNull
    @Deprecated
    public String accessKeyId;

    @NonNull
    @Deprecated
    public String accessKeySecret;

    @NonNull
    public ActionOnCacheLock actionOnCacheLock;

    @NonNull
    public AuthenticationMode authenticationMode;
    public boolean autoUpdateOfOnlineCache;

    @Nullable
    public String billingTag;

    @NonNull
    public String cachePath;
    public long cacheSizeInBytes;

    @NonNull
    public List<CatalogConfiguration> catalogConfigurations;

    @NonNull
    @Deprecated
    public Map<EngineBaseURL, String> customEngineBaseUrls;

    @NonNull
    public Map<EngineBaseURL, EngineOptions> customEngineOptions;

    @NonNull
    public String dataPath;

    @NonNull
    public LayerConfiguration layerConfiguration;

    @NonNull
    public NetworkSettings networkSettings;
    public boolean offlineMode;

    @NonNull
    public String persistentMapStoragePath;

    @NonNull
    public String politicalView;

    @NonNull
    public String scope;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ActionOnCacheLock {
        NO_ACTION(0),
        WAIT_LOCKING_APP_FINISH(1),
        KILL_LOCKING_APP(2);

        public final int value;

        ActionOnCacheLock(int i) {
            this.value = i;
        }
    }

    public SDKOptions(@NonNull AuthenticationMode authenticationMode) {
        SDKOptions make = make(authenticationMode);
        this.accessKeyId = make.accessKeyId;
        this.accessKeySecret = make.accessKeySecret;
        this.scope = make.scope;
        this.cachePath = make.cachePath;
        this.cacheSizeInBytes = make.cacheSizeInBytes;
        this.dataPath = make.dataPath;
        this.persistentMapStoragePath = make.persistentMapStoragePath;
        this.politicalView = make.politicalView;
        this.offlineMode = make.offlineMode;
        this.layerConfiguration = make.layerConfiguration;
        this.catalogConfigurations = make.catalogConfigurations;
        this.autoUpdateOfOnlineCache = make.autoUpdateOfOnlineCache;
        this.customEngineBaseUrls = make.customEngineBaseUrls;
        this.customEngineOptions = make.customEngineOptions;
        this.actionOnCacheLock = make.actionOnCacheLock;
        this.authenticationMode = make.authenticationMode;
        this.networkSettings = make.networkSettings;
        this.billingTag = make.billingTag;
    }

    private static native SDKOptions make(@NonNull AuthenticationMode authenticationMode);

    private static native SDKOptions make(@NonNull String str);

    private static native SDKOptions make(@NonNull String str, @NonNull String str2);

    private static native SDKOptions make(@NonNull String str, @NonNull String str2, @NonNull String str3);

    private static native SDKOptions make(@NonNull String str, @NonNull String str2, @NonNull String str3, long j);

    private static native SDKOptions make(@NonNull String str, @NonNull String str2, @NonNull String str3, long j, @NonNull String str4);

    private static native SDKOptions make(@NonNull String str, @NonNull String str2, @NonNull String str3, long j, @NonNull String str4, @NonNull String str5);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SDKOptions)) {
            return false;
        }
        SDKOptions sDKOptions = (SDKOptions) obj;
        return Objects.equals(this.accessKeyId, sDKOptions.accessKeyId) && Objects.equals(this.accessKeySecret, sDKOptions.accessKeySecret) && Objects.equals(this.scope, sDKOptions.scope) && Objects.equals(this.cachePath, sDKOptions.cachePath) && this.cacheSizeInBytes == sDKOptions.cacheSizeInBytes && Objects.equals(this.dataPath, sDKOptions.dataPath) && Objects.equals(this.persistentMapStoragePath, sDKOptions.persistentMapStoragePath) && Objects.equals(this.politicalView, sDKOptions.politicalView) && this.offlineMode == sDKOptions.offlineMode && Objects.equals(this.layerConfiguration, sDKOptions.layerConfiguration) && Objects.equals(this.catalogConfigurations, sDKOptions.catalogConfigurations) && this.autoUpdateOfOnlineCache == sDKOptions.autoUpdateOfOnlineCache && Objects.equals(this.customEngineBaseUrls, sDKOptions.customEngineBaseUrls) && Objects.equals(this.customEngineOptions, sDKOptions.customEngineOptions) && Objects.equals(this.actionOnCacheLock, sDKOptions.actionOnCacheLock) && Objects.equals(this.authenticationMode, sDKOptions.authenticationMode) && Objects.equals(this.networkSettings, sDKOptions.networkSettings) && Objects.equals(this.billingTag, sDKOptions.billingTag);
    }

    public int hashCode() {
        String str = this.accessKeyId;
        int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.accessKeySecret;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.scope;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.cachePath;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        long j = this.cacheSizeInBytes;
        int i = (((hashCode3 + hashCode4) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str5 = this.dataPath;
        int hashCode5 = (i + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.persistentMapStoragePath;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.politicalView;
        int hashCode7 = (((hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31) + (this.offlineMode ? 79 : 97)) * 31;
        LayerConfiguration layerConfiguration = this.layerConfiguration;
        int hashCode8 = (hashCode7 + (layerConfiguration != null ? layerConfiguration.hashCode() : 0)) * 31;
        List<CatalogConfiguration> list = this.catalogConfigurations;
        int hashCode9 = (((hashCode8 + (list != null ? list.hashCode() : 0)) * 31) + (this.autoUpdateOfOnlineCache ? 79 : 97)) * 31;
        Map<EngineBaseURL, String> map = this.customEngineBaseUrls;
        int hashCode10 = (hashCode9 + (map != null ? map.hashCode() : 0)) * 31;
        Map<EngineBaseURL, EngineOptions> map2 = this.customEngineOptions;
        int hashCode11 = (hashCode10 + (map2 != null ? map2.hashCode() : 0)) * 31;
        ActionOnCacheLock actionOnCacheLock = this.actionOnCacheLock;
        int hashCode12 = (hashCode11 + (actionOnCacheLock != null ? actionOnCacheLock.hashCode() : 0)) * 31;
        AuthenticationMode authenticationMode = this.authenticationMode;
        int hashCode13 = (hashCode12 + (authenticationMode != null ? authenticationMode.hashCode() : 0)) * 31;
        NetworkSettings networkSettings = this.networkSettings;
        int hashCode14 = (hashCode13 + (networkSettings != null ? networkSettings.hashCode() : 0)) * 31;
        String str8 = this.billingTag;
        return hashCode14 + (str8 != null ? str8.hashCode() : 0);
    }

    @Deprecated
    public SDKOptions(@NonNull String str) {
        SDKOptions make = make(str);
        this.accessKeyId = make.accessKeyId;
        this.accessKeySecret = make.accessKeySecret;
        this.scope = make.scope;
        this.cachePath = make.cachePath;
        this.cacheSizeInBytes = make.cacheSizeInBytes;
        this.dataPath = make.dataPath;
        this.persistentMapStoragePath = make.persistentMapStoragePath;
        this.politicalView = make.politicalView;
        this.offlineMode = make.offlineMode;
        this.layerConfiguration = make.layerConfiguration;
        this.catalogConfigurations = make.catalogConfigurations;
        this.autoUpdateOfOnlineCache = make.autoUpdateOfOnlineCache;
        this.customEngineBaseUrls = make.customEngineBaseUrls;
        this.customEngineOptions = make.customEngineOptions;
        this.actionOnCacheLock = make.actionOnCacheLock;
        this.authenticationMode = make.authenticationMode;
        this.networkSettings = make.networkSettings;
        this.billingTag = make.billingTag;
    }

    @Deprecated
    public SDKOptions(@NonNull String str, @NonNull String str2) {
        SDKOptions make = make(str, str2);
        this.accessKeyId = make.accessKeyId;
        this.accessKeySecret = make.accessKeySecret;
        this.scope = make.scope;
        this.cachePath = make.cachePath;
        this.cacheSizeInBytes = make.cacheSizeInBytes;
        this.dataPath = make.dataPath;
        this.persistentMapStoragePath = make.persistentMapStoragePath;
        this.politicalView = make.politicalView;
        this.offlineMode = make.offlineMode;
        this.layerConfiguration = make.layerConfiguration;
        this.catalogConfigurations = make.catalogConfigurations;
        this.autoUpdateOfOnlineCache = make.autoUpdateOfOnlineCache;
        this.customEngineBaseUrls = make.customEngineBaseUrls;
        this.customEngineOptions = make.customEngineOptions;
        this.actionOnCacheLock = make.actionOnCacheLock;
        this.authenticationMode = make.authenticationMode;
        this.networkSettings = make.networkSettings;
        this.billingTag = make.billingTag;
    }

    @Deprecated
    public SDKOptions(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        SDKOptions make = make(str, str2, str3);
        this.accessKeyId = make.accessKeyId;
        this.accessKeySecret = make.accessKeySecret;
        this.scope = make.scope;
        this.cachePath = make.cachePath;
        this.cacheSizeInBytes = make.cacheSizeInBytes;
        this.dataPath = make.dataPath;
        this.persistentMapStoragePath = make.persistentMapStoragePath;
        this.politicalView = make.politicalView;
        this.offlineMode = make.offlineMode;
        this.layerConfiguration = make.layerConfiguration;
        this.catalogConfigurations = make.catalogConfigurations;
        this.autoUpdateOfOnlineCache = make.autoUpdateOfOnlineCache;
        this.customEngineBaseUrls = make.customEngineBaseUrls;
        this.customEngineOptions = make.customEngineOptions;
        this.actionOnCacheLock = make.actionOnCacheLock;
        this.authenticationMode = make.authenticationMode;
        this.networkSettings = make.networkSettings;
        this.billingTag = make.billingTag;
    }

    @Deprecated
    public SDKOptions(@NonNull String str, @NonNull String str2, @NonNull String str3, long j) {
        SDKOptions make = make(str, str2, str3, j);
        this.accessKeyId = make.accessKeyId;
        this.accessKeySecret = make.accessKeySecret;
        this.scope = make.scope;
        this.cachePath = make.cachePath;
        this.cacheSizeInBytes = make.cacheSizeInBytes;
        this.dataPath = make.dataPath;
        this.persistentMapStoragePath = make.persistentMapStoragePath;
        this.politicalView = make.politicalView;
        this.offlineMode = make.offlineMode;
        this.layerConfiguration = make.layerConfiguration;
        this.catalogConfigurations = make.catalogConfigurations;
        this.autoUpdateOfOnlineCache = make.autoUpdateOfOnlineCache;
        this.customEngineBaseUrls = make.customEngineBaseUrls;
        this.customEngineOptions = make.customEngineOptions;
        this.actionOnCacheLock = make.actionOnCacheLock;
        this.authenticationMode = make.authenticationMode;
        this.networkSettings = make.networkSettings;
        this.billingTag = make.billingTag;
    }

    @Deprecated
    public SDKOptions(@NonNull String str, @NonNull String str2, @NonNull String str3, long j, @NonNull String str4) {
        SDKOptions make = make(str, str2, str3, j, str4);
        this.accessKeyId = make.accessKeyId;
        this.accessKeySecret = make.accessKeySecret;
        this.scope = make.scope;
        this.cachePath = make.cachePath;
        this.cacheSizeInBytes = make.cacheSizeInBytes;
        this.dataPath = make.dataPath;
        this.persistentMapStoragePath = make.persistentMapStoragePath;
        this.politicalView = make.politicalView;
        this.offlineMode = make.offlineMode;
        this.layerConfiguration = make.layerConfiguration;
        this.catalogConfigurations = make.catalogConfigurations;
        this.autoUpdateOfOnlineCache = make.autoUpdateOfOnlineCache;
        this.customEngineBaseUrls = make.customEngineBaseUrls;
        this.customEngineOptions = make.customEngineOptions;
        this.actionOnCacheLock = make.actionOnCacheLock;
        this.authenticationMode = make.authenticationMode;
        this.networkSettings = make.networkSettings;
        this.billingTag = make.billingTag;
    }

    @Deprecated
    public SDKOptions(@NonNull String str, @NonNull String str2, @NonNull String str3, long j, @NonNull String str4, @NonNull String str5) {
        SDKOptions make = make(str, str2, str3, j, str4, str5);
        this.accessKeyId = make.accessKeyId;
        this.accessKeySecret = make.accessKeySecret;
        this.scope = make.scope;
        this.cachePath = make.cachePath;
        this.cacheSizeInBytes = make.cacheSizeInBytes;
        this.dataPath = make.dataPath;
        this.persistentMapStoragePath = make.persistentMapStoragePath;
        this.politicalView = make.politicalView;
        this.offlineMode = make.offlineMode;
        this.layerConfiguration = make.layerConfiguration;
        this.catalogConfigurations = make.catalogConfigurations;
        this.autoUpdateOfOnlineCache = make.autoUpdateOfOnlineCache;
        this.customEngineBaseUrls = make.customEngineBaseUrls;
        this.customEngineOptions = make.customEngineOptions;
        this.actionOnCacheLock = make.actionOnCacheLock;
        this.authenticationMode = make.authenticationMode;
        this.networkSettings = make.networkSettings;
        this.billingTag = make.billingTag;
    }
}
