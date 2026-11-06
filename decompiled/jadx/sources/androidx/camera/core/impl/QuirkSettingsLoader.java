package androidx.camera.core.impl;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.QuirkSettings;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class QuirkSettingsLoader implements Function<Context, QuirkSettings> {
    public static final String KEY_DEFAULT_QUIRK_ENABLED = "androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED";
    public static final String KEY_QUIRK_FORCE_DISABLED = "androidx.camera.core.quirks.FORCE_DISABLED";
    public static final String KEY_QUIRK_FORCE_ENABLED = "androidx.camera.core.quirks.FORCE_ENABLED";
    private static final String TAG = "QuirkSettingsLoader";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MetadataHolderService extends Service {
        private MetadataHolderService() {
        }

        @Override // android.app.Service
        @Nullable
        public IBinder onBind(Intent intent) {
            throw new UnsupportedOperationException();
        }
    }

    @NonNull
    private static QuirkSettings buildQuirkSettings(@NonNull Context context, @NonNull Bundle bundle) {
        boolean z = bundle.getBoolean(KEY_DEFAULT_QUIRK_ENABLED, true);
        String[] loadQuirks = loadQuirks(context, bundle, KEY_QUIRK_FORCE_ENABLED);
        String[] loadQuirks2 = loadQuirks(context, bundle, KEY_QUIRK_FORCE_DISABLED);
        Logger.d(TAG, "Loaded quirk settings from metadata:");
        Logger.d(TAG, "  KEY_DEFAULT_QUIRK_ENABLED = " + z);
        Logger.d(TAG, "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(loadQuirks));
        Logger.d(TAG, "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(loadQuirks2));
        return new QuirkSettings.Builder().setEnabledWhenDeviceHasQuirk(z).forceEnableQuirks(resolveQuirkNames(loadQuirks)).forceDisableQuirks(resolveQuirkNames(loadQuirks2)).build();
    }

    @NonNull
    private static String[] loadQuirks(@NonNull Context context, @NonNull Bundle bundle, @NonNull String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            Logger.w(TAG, "Resource ID not found for key: " + str);
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i);
        } catch (Resources.NotFoundException e) {
            Logger.w(TAG, "Quirk class names resource not found: " + i, e);
            return new String[0];
        }
    }

    @Nullable
    private static Class<? extends Quirk> resolveQuirkName(@NonNull String str) {
        try {
            Class cls = Class.forName(str);
            if (Quirk.class.isAssignableFrom(cls)) {
                return cls;
            }
            Logger.w(TAG, str + " does not implement the Quirk interface.");
            return null;
        } catch (ClassNotFoundException e) {
            Logger.w(TAG, "Class not found: " + str, e);
            return null;
        }
    }

    @NonNull
    private static Set<Class<? extends Quirk>> resolveQuirkNames(@NonNull String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            Class<? extends Quirk> resolveQuirkName = resolveQuirkName(str);
            if (resolveQuirkName != null) {
                hashSet.add(resolveQuirkName);
            }
        }
        return hashSet;
    }

    @Override // androidx.arch.core.util.Function
    @Nullable
    public QuirkSettings apply(@NonNull Context context) {
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) MetadataHolderService.class), 640).metaData;
            if (bundle != null) {
                return buildQuirkSettings(context, bundle);
            }
            Logger.w(TAG, "No metadata in MetadataHolderService.");
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.d(TAG, "QuirkSettings$MetadataHolderService is not found.");
            return null;
        }
    }
}
