package com.here.sdk.core;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.here.sdk.core.engine.SDKBuildInformation;
import java.util.HashSet;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class SDKLibraryLoader {
    private static final String TAG = "SDKLibraryLoader";
    private static final HashSet<String> loadedLibraries = new HashSet<>();

    public SDKLibraryLoader(@NonNull String str) {
        if (isLoaded(str)) {
            return;
        }
        loadLibraries(getLibrariesToLoad(str), str);
        ParcelCompat$$ExternalSyntheticOutline0.m(SDKBuildInformation.sdkVersion().versionName, TAG, new StringBuilder("HERESDK Version "));
    }

    @NonNull
    public static String[] getLibrariesToLoad(@NonNull String str) {
        String[] readLibraryListFromClass = readLibraryListFromClass(BitVector$$ExternalSyntheticOutline0.m(str, "LibraryListTest"));
        if (readLibraryListFromClass != null) {
            return readLibraryListFromClass;
        }
        String m = BitVector$$ExternalSyntheticOutline0.m(str, "LibraryList");
        String[] readLibraryListFromClass2 = readLibraryListFromClass(m);
        if (readLibraryListFromClass2 != null) {
            return readLibraryListFromClass2;
        }
        Single$$ExternalSyntheticBUOutline0.m("Failed to retrieve libraries to load from class ".concat(m));
        return null;
    }

    private static boolean isLoaded(@NonNull String str) {
        return loadedLibraries.contains(str);
    }

    public static void loadLibraries(@NonNull String[] strArr, @NonNull String str) {
        if (isLoaded(str)) {
            return;
        }
        loadedLibraries.add(str);
        for (String str2 : strArr) {
            System.loadLibrary(str2);
        }
    }

    @Nullable
    private static String[] readLibraryListFromClass(@NonNull String str) {
        boolean z = false;
        try {
            Class<?> cls = Class.forName("com.here.sdk.core." + str);
            Log.i(TAG, "Reading library list");
            z = true;
            return (String[]) cls.getField("LIBRARIES_TO_LOAD").get(null);
        } catch (Exception e) {
            if (z) {
                Log.e(TAG, "Failed to read library list", e);
            }
            return null;
        }
    }
}
