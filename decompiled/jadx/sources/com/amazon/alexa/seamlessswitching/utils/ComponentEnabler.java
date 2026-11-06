package com.amazon.alexa.seamlessswitching.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class ComponentEnabler {
    private static final String TAG = "ComponentEnabler";

    private ComponentEnabler() {
        throw new UnsupportedOperationException();
    }

    public static boolean checkIfComponentExists(Context context, Class<?> cls) {
        return checkIfComponentExists(context.getPackageManager(), new ComponentName(context, cls));
    }

    public static boolean checkIfComponentIsEnabled(Context context, Class<?> cls) {
        return checkIfComponentIsEnabled(context.getPackageManager(), new ComponentName(context, cls));
    }

    public static boolean checkIfServiceExists(Context context, Class<?> cls) {
        return checkIfServiceExists(context.getPackageManager(), new ComponentName(context, cls));
    }

    public static boolean checkIfServiceIsEnabled(Context context, Class<?> cls) {
        return checkIfServiceIsEnabled(context.getPackageManager(), new ComponentName(context, cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ActualEnabledResult getActualEnabledStateForComponent(PackageManager packageManager, ComponentName componentName, ManifestEnabledResult manifestEnabledResult) {
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (manifestEnabledResult.wasFound()) {
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
            return new ActualEnabledResult(true, componentEnabledSetting != 1 ? (componentEnabledSetting == 2 || componentEnabledSetting == 3 || componentEnabledSetting == 4) ? false : manifestEnabledResult.isEnabled() : true, objArr == true ? 1 : 0);
        }
        componentName.flattenToString();
        return new ActualEnabledResult(z, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ManifestEnabledResult getManifestEnabledStateForActivity(PackageManager packageManager, ComponentName componentName) {
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 512);
            if (activityInfo != null) {
                return new ManifestEnabledResult(true, activityInfo.isEnabled(), i);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(TAG, "Name not found exception: " + componentName.getClassName());
        } catch (Exception e) {
            Log.e(TAG, "Exception while checking components within: " + componentName.getPackageName(), e);
        }
        return new ManifestEnabledResult(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ManifestEnabledResult getManifestEnabledStateForComponent(PackageManager packageManager, ComponentName componentName) {
        ManifestEnabledResult manifestEnabledStateForService = getManifestEnabledStateForService(packageManager, componentName);
        if (manifestEnabledStateForService.wasFound()) {
            return manifestEnabledStateForService;
        }
        ManifestEnabledResult manifestEnabledStateForActivity = getManifestEnabledStateForActivity(packageManager, componentName);
        if (manifestEnabledStateForActivity.wasFound()) {
            return manifestEnabledStateForActivity;
        }
        ManifestEnabledResult manifestEnabledStateForReceiver = getManifestEnabledStateForReceiver(packageManager, componentName);
        if (manifestEnabledStateForReceiver.wasFound()) {
            return manifestEnabledStateForReceiver;
        }
        ManifestEnabledResult manifestEnabledStateForProvider = getManifestEnabledStateForProvider(packageManager, componentName);
        return manifestEnabledStateForProvider.wasFound() ? manifestEnabledStateForProvider : new ManifestEnabledResult(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ManifestEnabledResult getManifestEnabledStateForProvider(PackageManager packageManager, ComponentName componentName) {
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        try {
            ProviderInfo providerInfo = packageManager.getProviderInfo(componentName, 512);
            if (providerInfo != null) {
                return new ManifestEnabledResult(true, providerInfo.isEnabled(), i);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(TAG, "Name not found exception: " + componentName.getClassName());
        } catch (Exception e) {
            Log.e(TAG, "Exception while checking components within: " + componentName.getPackageName(), e);
        }
        return new ManifestEnabledResult(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ManifestEnabledResult getManifestEnabledStateForReceiver(PackageManager packageManager, ComponentName componentName) {
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        try {
            ActivityInfo receiverInfo = packageManager.getReceiverInfo(componentName, 512);
            if (receiverInfo != null) {
                return new ManifestEnabledResult(true, receiverInfo.isEnabled(), i);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(TAG, "Name not found exception: " + componentName.getClassName());
        } catch (Exception e) {
            Log.e(TAG, "Exception while checking components within: " + componentName.getPackageName(), e);
        }
        return new ManifestEnabledResult(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ManifestEnabledResult getManifestEnabledStateForService(PackageManager packageManager, ComponentName componentName) {
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        try {
            ServiceInfo serviceInfo = packageManager.getServiceInfo(componentName, 512);
            if (serviceInfo != null) {
                return new ManifestEnabledResult(true, serviceInfo.isEnabled(), i);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(TAG, "Name not found exception: " + componentName.getClassName());
        } catch (Exception e) {
            Log.e(TAG, "Exception while checking components within: " + componentName.getPackageName(), e);
        }
        return new ManifestEnabledResult(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
    }

    private static void setComponentEnabled(PackageManager packageManager, ComponentName componentName, ActualEnabledResult actualEnabledResult, boolean z) {
        if (!actualEnabledResult.wasFound()) {
            componentName.flattenToString();
            return;
        }
        if (z == (!actualEnabledResult.isEnabled())) {
            int i = z ? 1 : 2;
            Log.i(TAG, "Setting " + componentName.getClassName() + " enabled: " + z);
            packageManager.setComponentEnabledSetting(componentName, i, 1);
        }
    }

    public static void setServiceEnabled(Context context, Class<?> cls, boolean z) {
        setServiceEnabled(context.getPackageManager(), new ComponentName(context, cls), z);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ActualEnabledResult extends EnabledResult {
        private ActualEnabledResult(boolean z, boolean z2) {
            super(z, z2, 0);
        }

        public /* synthetic */ ActualEnabledResult(boolean z, boolean z2, int i) {
            this(z, z2);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ManifestEnabledResult extends EnabledResult {
        private ManifestEnabledResult(boolean z, boolean z2) {
            super(z, z2, 0);
        }

        public /* synthetic */ ManifestEnabledResult(boolean z, boolean z2, int i) {
            this(z, z2);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class EnabledResult {
        private final boolean isEnabled;
        private final boolean wasFound;

        private EnabledResult(boolean z, boolean z2) {
            this.wasFound = z;
            this.isEnabled = z2;
        }

        public boolean isEnabled() {
            return this.isEnabled;
        }

        public boolean wasFound() {
            return this.wasFound;
        }

        public /* synthetic */ EnabledResult(boolean z, boolean z2, int i) {
            this(z, z2);
        }
    }

    public static void setServiceEnabled(PackageManager packageManager, ComponentName componentName, boolean z) {
        setComponentEnabled(packageManager, componentName, getActualEnabledStateForComponent(packageManager, componentName), z);
    }

    public static boolean checkIfComponentExists(PackageManager packageManager, ComponentName componentName) {
        return getManifestEnabledStateForComponent(packageManager, componentName).wasFound();
    }

    public static boolean checkIfComponentIsEnabled(PackageManager packageManager, ComponentName componentName) {
        return getActualEnabledStateForComponent(packageManager, componentName).isEnabled();
    }

    public static boolean checkIfServiceExists(PackageManager packageManager, ComponentName componentName) {
        return getManifestEnabledStateForService(packageManager, componentName).wasFound();
    }

    public static boolean checkIfServiceIsEnabled(PackageManager packageManager, ComponentName componentName) {
        return getActualEnabledStateForComponent(packageManager, componentName).isEnabled();
    }

    private static ActualEnabledResult getActualEnabledStateForComponent(PackageManager packageManager, ComponentName componentName) {
        return getActualEnabledStateForComponent(packageManager, componentName, getManifestEnabledStateForComponent(packageManager, componentName));
    }

    public static void setComponentEnabled(PackageManager packageManager, ComponentName componentName, boolean z) {
        setComponentEnabled(packageManager, componentName, getActualEnabledStateForComponent(packageManager, componentName), z);
    }

    public static void setComponentEnabled(Context context, Class<?> cls, boolean z) {
        setComponentEnabled(context.getPackageManager(), new ComponentName(context, cls), z);
    }
}
