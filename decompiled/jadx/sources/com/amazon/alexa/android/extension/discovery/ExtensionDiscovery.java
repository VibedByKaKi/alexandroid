package com.amazon.alexa.android.extension.discovery;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.LauncherApps;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class ExtensionDiscovery {
    private static final boolean DEBUG = false;
    private static final String EXTENSION_ACTION = "com.amazon.alexa.extensions.ACTION";
    private static final String EXTENSION_BASE = "com.amazon.alexa.extensions.";
    private static final String EXTENSION_DEFINITION = "com.amazon.alexa.extensions.DEFINITION";
    private static final String EXTENSION_METADATA_ALIAS = "com.amazon.alexa.extensions.ALIAS";
    private static final String EXTENSION_METADATA_APP = "com.amazon.alexa.extensions.EXTENSION";
    private static final String TAG = "ExtensionDiscovery";
    private static ExtensionDiscovery sInstance;
    private final Map<String, ComponentInfo> mComponents = new ConcurrentHashMap();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ComponentInfo {
        private final ComponentName mComponentName;
        private final String mExtensionDefinition;

        public ComponentInfo(@NonNull ServiceInfo serviceInfo, @Nullable String str) {
            this.mComponentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
            this.mExtensionDefinition = str;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ExtensionPresence {
        PRESENT,
        DEFERRED,
        NOT_PRESENT
    }

    private ExtensionDiscovery(@NonNull Context context) {
        initialize(context.getApplicationContext());
    }

    public static Intent createExtensionIntent() {
        return new Intent(EXTENSION_ACTION);
    }

    @Nullable
    private List<ResolveInfo> findPackage(@NonNull PackageManager packageManager, @NonNull String str) {
        Intent createExtensionIntent = createExtensionIntent();
        createExtensionIntent.setPackage(str);
        return packageManager.queryIntentServices(createExtensionIntent, 128);
    }

    private String[] getDefinitions(@NonNull PackageManager packageManager, @NonNull ServiceInfo serviceInfo) {
        return getStringArrayFromMetadataObject(packageManager, serviceInfo, EXTENSION_DEFINITION, serviceInfo.packageName);
    }

    public static synchronized ExtensionDiscovery getInstance(@NonNull Context context) {
        ExtensionDiscovery extensionDiscovery;
        synchronized (ExtensionDiscovery.class) {
            try {
                if (sInstance == null) {
                    sInstance = new ExtensionDiscovery(context);
                }
                extensionDiscovery = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return extensionDiscovery;
    }

    @Nullable
    private String[] getStringArrayFromMetadataObject(@NonNull PackageManager packageManager, @NonNull ServiceInfo serviceInfo, @NonNull String str, @NonNull String str2) {
        Object obj;
        Bundle bundle = serviceInfo.metaData;
        if (bundle == null || bundle.isEmpty() || (obj = bundle.get(str)) == null) {
            return null;
        }
        if (obj instanceof String) {
            return new String[]{(String) obj};
        }
        if (obj instanceof Integer) {
            try {
                return packageManager.getResourcesForApplication(str2).getStringArray(((Integer) obj).intValue());
            } catch (PackageManager.NameNotFoundException e) {
                Log.e(TAG, "The extension package resources are missing: " + str2, e);
            } catch (Resources.NotFoundException e2) {
                Log.e(TAG, "The extension resource is missing: " + str, e2);
            }
        }
        return null;
    }

    private String[] getUris(@NonNull PackageManager packageManager, @NonNull ServiceInfo serviceInfo) {
        String[] stringArrayFromMetadataObject = getStringArrayFromMetadataObject(packageManager, serviceInfo, EXTENSION_METADATA_APP, serviceInfo.packageName);
        return stringArrayFromMetadataObject != null ? stringArrayFromMetadataObject : getStringArrayFromMetadataObject(packageManager, serviceInfo, EXTENSION_METADATA_ALIAS, serviceInfo.packageName);
    }

    private synchronized void initialize(@NonNull Context context) {
        final PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return;
        }
        registerComponentInfo(packageManager, packageManager.queryIntentServices(createExtensionIntent(), 128));
        LauncherApps launcherApps = (LauncherApps) context.getSystemService("launcherapps");
        if (Looper.myLooper() != null) {
            launcherApps.registerCallback(new LauncherApps.Callback() { // from class: com.amazon.alexa.android.extension.discovery.ExtensionDiscovery.1
                @Override // android.content.pm.LauncherApps.Callback
                public void onPackageAdded(String str, UserHandle userHandle) {
                    ExtensionDiscovery.this.addPackage(packageManager, str);
                }

                @Override // android.content.pm.LauncherApps.Callback
                public void onPackageChanged(String str, UserHandle userHandle) {
                    ExtensionDiscovery.this.updatePackage(packageManager, str);
                }

                @Override // android.content.pm.LauncherApps.Callback
                public void onPackageRemoved(String str, UserHandle userHandle) {
                    ExtensionDiscovery.this.removePackage(str);
                }

                @Override // android.content.pm.LauncherApps.Callback
                public void onPackagesAvailable(String[] strArr, UserHandle userHandle, boolean z) {
                }

                @Override // android.content.pm.LauncherApps.Callback
                public void onPackagesUnavailable(String[] strArr, UserHandle userHandle, boolean z) {
                }
            });
        }
    }

    private void registerComponentInfo(@NonNull PackageManager packageManager, @NonNull List<ResolveInfo> list) {
        ServiceInfo serviceInfo;
        String[] uris;
        Iterator<ResolveInfo> it2 = list.iterator();
        while (it2.hasNext() && (serviceInfo = it2.next().serviceInfo) != null && (uris = getUris(packageManager, serviceInfo)) != null && uris.length != 0) {
            String[] definitions = getDefinitions(packageManager, serviceInfo);
            int i = 0;
            while (i < uris.length) {
                this.mComponents.put(uris[i], new ComponentInfo(serviceInfo, (definitions == null || definitions.length <= i) ? null : definitions[i]));
                i++;
            }
        }
    }

    private synchronized void removeComponent(@NonNull String str) {
        Iterator<ComponentInfo> it2 = this.mComponents.values().iterator();
        while (it2.hasNext()) {
            if (it2.next().mComponentName.getPackageName().equals(str)) {
                it2.remove();
            }
        }
    }

    @VisibleForTesting
    public synchronized void addPackage(@NonNull PackageManager packageManager, @NonNull String str) {
        List<ResolveInfo> findPackage = findPackage(packageManager, str);
        if (findPackage != null) {
            registerComponentInfo(packageManager, findPackage);
        }
    }

    @VisibleForTesting
    public void clearCache() {
        this.mComponents.clear();
        sInstance = null;
    }

    @VisibleForTesting
    public synchronized int getComponentCount() {
        return this.mComponents.size();
    }

    @Nullable
    public synchronized ComponentName getComponentName(@NonNull String str) {
        ComponentInfo componentInfo = this.mComponents.get(str);
        if (componentInfo == null) {
            return null;
        }
        return componentInfo.mComponentName;
    }

    @Nullable
    public synchronized String getExtensionDefinition(@NonNull String str) {
        ComponentInfo componentInfo = this.mComponents.get(str);
        if (componentInfo == null) {
            return null;
        }
        return componentInfo.mExtensionDefinition;
    }

    public synchronized ExtensionPresence hasExtension(@NonNull String str) {
        ComponentInfo componentInfo = this.mComponents.get(str);
        if (componentInfo == null) {
            return ExtensionPresence.NOT_PRESENT;
        }
        if (TextUtils.isEmpty(componentInfo.mExtensionDefinition)) {
            return ExtensionPresence.PRESENT;
        }
        return ExtensionPresence.DEFERRED;
    }

    @VisibleForTesting
    public synchronized boolean isDiscovered(String str) {
        return this.mComponents.containsKey(str);
    }

    @VisibleForTesting
    public synchronized void removePackage(@NonNull String str) {
        removeComponent(str);
    }

    @VisibleForTesting
    public synchronized void updatePackage(PackageManager packageManager, String str) {
        List<ResolveInfo> findPackage = findPackage(packageManager, str);
        if (findPackage != null) {
            removePackage(str);
            registerComponentInfo(packageManager, findPackage);
        }
    }
}
