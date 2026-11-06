package androidx.webkit;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.webkit.internal.ApiHelperForP;
import androidx.webkit.internal.WebViewFeatureInternal;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class ProcessGlobalConfig {
    String mCacheDirectoryBasePath;
    String mDataDirectoryBasePath;
    String mDataDirectorySuffix;
    Boolean mPartitionedCookiesEnabled;
    private static final AtomicReference<HashMap<String, Object>> sProcessGlobalConfig = new AtomicReference<>();
    private static final Object sLock = new Object();

    @GuardedBy("sLock")
    private static boolean sApplyCalled = false;

    public static void apply(ProcessGlobalConfig processGlobalConfig) {
        synchronized (sLock) {
            if (sApplyCalled) {
                throw new IllegalStateException("ProcessGlobalConfig#apply was called more than once, which is an illegal operation. The configuration settings provided by ProcessGlobalConfig take effect only once, when WebView is first loaded into the current process. Every process should only ever create a single instance of ProcessGlobalConfig and apply it once, before any calls to android.webkit APIs, such as during early app startup.");
            }
            sApplyCalled = true;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        if (webViewCurrentlyLoaded()) {
            Single$$ExternalSyntheticBUOutline0.m$2("WebView has already been loaded in the current process, so any attempt to apply the settings in ProcessGlobalConfig will have no effect. ProcessGlobalConfig#apply needs to be called before any calls to android.webkit APIs, such as during early app startup.");
            return;
        }
        if (processGlobalConfig.mDataDirectorySuffix != null) {
            boolean isSupportedByFramework = WebViewFeatureInternal.STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX.isSupportedByFramework();
            String str = processGlobalConfig.mDataDirectorySuffix;
            if (isSupportedByFramework) {
                ApiHelperForP.setDataDirectorySuffix(str);
            } else {
                hashMap.put(ProcessGlobalConfigConstants.DATA_DIRECTORY_SUFFIX, str);
            }
        }
        String str2 = processGlobalConfig.mDataDirectoryBasePath;
        if (str2 != null) {
            hashMap.put(ProcessGlobalConfigConstants.DATA_DIRECTORY_BASE_PATH, str2);
        }
        String str3 = processGlobalConfig.mCacheDirectoryBasePath;
        if (str3 != null) {
            hashMap.put(ProcessGlobalConfigConstants.CACHE_DIRECTORY_BASE_PATH, str3);
        }
        Boolean bool = processGlobalConfig.mPartitionedCookiesEnabled;
        if (bool != null) {
            hashMap.put(ProcessGlobalConfigConstants.CONFIGURE_PARTITIONED_COOKIES, bool);
        }
        AtomicReference<HashMap<String, Object>> atomicReference = sProcessGlobalConfig;
        while (!atomicReference.compareAndSet(null, hashMap)) {
            if (atomicReference.get() != null) {
                Single$$ExternalSyntheticBUOutline0.m("Attempting to set ProcessGlobalConfig#sProcessGlobalConfig when it was already set");
                return;
            }
        }
    }

    private static boolean webViewCurrentlyLoaded() {
        Field declaredField;
        try {
            declaredField = Class.forName("android.webkit.WebViewFactory").getDeclaredField("sProviderInstance");
            declaredField.setAccessible(true);
        } catch (Exception unused) {
        }
        return declaredField.get(null) != null;
    }

    public ProcessGlobalConfig setDataDirectorySuffix(Context context, String str) {
        if (!WebViewFeatureInternal.STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX.isSupported(context)) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        if (str.equals("")) {
            Single$$ExternalSyntheticBUOutline0.m$3("Suffix cannot be an empty string");
            return null;
        }
        if (str.indexOf(File.separatorChar) < 0) {
            this.mDataDirectorySuffix = str;
            return this;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Suffix ", str, " contains a path separator"));
        return null;
    }

    public ProcessGlobalConfig setDirectoryBasePaths(Context context, File file, File file2) {
        if (!WebViewFeatureInternal.STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH.isSupported(context)) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        if (!file.isAbsolute()) {
            Single$$ExternalSyntheticBUOutline0.m$3("dataDirectoryBasePath must be a non-empty absolute path");
            return null;
        }
        if (!file2.isAbsolute()) {
            Single$$ExternalSyntheticBUOutline0.m$3("cacheDirectoryBasePath must be a non-empty absolute path");
            return null;
        }
        this.mDataDirectoryBasePath = file.getAbsolutePath();
        this.mCacheDirectoryBasePath = file2.getAbsolutePath();
        return this;
    }

    public ProcessGlobalConfig setPartitionedCookiesEnabled(Context context, boolean z) {
        if (!WebViewFeatureInternal.STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES.isSupported(context)) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        this.mPartitionedCookiesEnabled = Boolean.valueOf(z);
        return this;
    }
}
