package com.amazon.alexa.utils.security;

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

    private static utilszZm getActualEnabledStateForComponent(PackageManager packageManager, ComponentName componentName, utilszQM utilszqm) {
        boolean z = false;
        if (!utilszqm.utilszZm) {
            componentName.flattenToString();
            return new utilszZm(false, false);
        }
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting == 1) {
            z = true;
        } else if (componentEnabledSetting != 2 && componentEnabledSetting != 3 && componentEnabledSetting != 4) {
            z = utilszqm.utilsBIo;
        }
        return new utilszZm(true, z);
    }

    private static utilszQM getManifestEnabledStateForActivity(PackageManager packageManager, ComponentName componentName) {
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 512);
            if (activityInfo != null) {
                return new utilszQM(true, activityInfo.isEnabled());
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(TAG, "Name not found exception: " + componentName.getClassName());
        } catch (Exception e) {
            Log.e(TAG, "Exception while checking components within: " + componentName.getPackageName(), e);
        }
        return new utilszQM(false, false);
    }

    private static utilszQM getManifestEnabledStateForComponent(PackageManager packageManager, ComponentName componentName) {
        utilszQM manifestEnabledStateForService = getManifestEnabledStateForService(packageManager, componentName);
        if (manifestEnabledStateForService.utilszZm) {
            return manifestEnabledStateForService;
        }
        utilszQM manifestEnabledStateForActivity = getManifestEnabledStateForActivity(packageManager, componentName);
        if (manifestEnabledStateForActivity.utilszZm) {
            return manifestEnabledStateForActivity;
        }
        utilszQM manifestEnabledStateForReceiver = getManifestEnabledStateForReceiver(packageManager, componentName);
        if (manifestEnabledStateForReceiver.utilszZm) {
            return manifestEnabledStateForReceiver;
        }
        utilszQM manifestEnabledStateForProvider = getManifestEnabledStateForProvider(packageManager, componentName);
        return manifestEnabledStateForProvider.utilszZm ? manifestEnabledStateForProvider : new utilszQM(false, false);
    }

    private static utilszQM getManifestEnabledStateForProvider(PackageManager packageManager, ComponentName componentName) {
        try {
            ProviderInfo providerInfo = packageManager.getProviderInfo(componentName, 512);
            if (providerInfo != null) {
                return new utilszQM(true, providerInfo.isEnabled());
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(TAG, "Name not found exception: " + componentName.getClassName());
        } catch (Exception e) {
            Log.e(TAG, "Exception while checking components within: " + componentName.getPackageName(), e);
        }
        return new utilszQM(false, false);
    }

    private static utilszQM getManifestEnabledStateForReceiver(PackageManager packageManager, ComponentName componentName) {
        try {
            ActivityInfo receiverInfo = packageManager.getReceiverInfo(componentName, 512);
            if (receiverInfo != null) {
                return new utilszQM(true, receiverInfo.isEnabled());
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(TAG, "Name not found exception: " + componentName.getClassName());
        } catch (Exception e) {
            Log.e(TAG, "Exception while checking components within: " + componentName.getPackageName(), e);
        }
        return new utilszQM(false, false);
    }

    private static utilszQM getManifestEnabledStateForService(PackageManager packageManager, ComponentName componentName) {
        try {
            ServiceInfo serviceInfo = packageManager.getServiceInfo(componentName, 512);
            if (serviceInfo != null) {
                return new utilszQM(true, serviceInfo.isEnabled());
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(TAG, "Name not found exception: " + componentName.getClassName());
        } catch (Exception e) {
            Log.e(TAG, "Exception while checking components within: " + componentName.getPackageName(), e);
        }
        return new utilszQM(false, false);
    }

    private static void setComponentEnabled(PackageManager packageManager, ComponentName componentName, utilszZm utilszzm, boolean z) {
        if (!utilszzm.utilszZm) {
            componentName.flattenToString();
            return;
        }
        if (z == (!utilszzm.utilsBIo)) {
            int i = z ? 1 : 2;
            Log.i(TAG, "Setting " + componentName.getClassName() + " enabled: " + z);
            packageManager.setComponentEnabledSetting(componentName, i, 1);
        }
    }

    public static void setServiceEnabled(Context context, Class<?> cls, boolean z) {
        setServiceEnabled(context.getPackageManager(), new ComponentName(context, cls), z);
    }

    public static void setServiceEnabled(PackageManager packageManager, ComponentName componentName, boolean z) {
        setComponentEnabled(packageManager, componentName, getActualEnabledStateForComponent(packageManager, componentName), z);
    }

    public static boolean checkIfComponentExists(PackageManager packageManager, ComponentName componentName) {
        return getManifestEnabledStateForComponent(packageManager, componentName).utilszZm;
    }

    public static boolean checkIfComponentIsEnabled(PackageManager packageManager, ComponentName componentName) {
        return getActualEnabledStateForComponent(packageManager, componentName).utilsBIo;
    }

    public static boolean checkIfServiceExists(PackageManager packageManager, ComponentName componentName) {
        return getManifestEnabledStateForService(packageManager, componentName).utilszZm;
    }

    public static boolean checkIfServiceIsEnabled(PackageManager packageManager, ComponentName componentName) {
        return getActualEnabledStateForComponent(packageManager, componentName).utilsBIo;
    }

    private static utilszZm getActualEnabledStateForComponent(PackageManager packageManager, ComponentName componentName) {
        return getActualEnabledStateForComponent(packageManager, componentName, getManifestEnabledStateForComponent(packageManager, componentName));
    }

    public static void setComponentEnabled(PackageManager packageManager, ComponentName componentName, boolean z) {
        setComponentEnabled(packageManager, componentName, getActualEnabledStateForComponent(packageManager, componentName), z);
    }

    public static void setComponentEnabled(Context context, Class<?> cls, boolean z) {
        setComponentEnabled(context.getPackageManager(), new ComponentName(context, cls), z);
    }
}
