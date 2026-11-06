package com.amazon.dee.app.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.amazon.dee.app.services.logging.Log;
import com.amazon.dee.app.ui.util.UiUtils;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ResourceUtils {
    private static final String TAG = Log.tag((Class<?>) UiUtils.class);

    private ResourceUtils() {
    }

    public static int getResourceId(String str, Class<?> cls) {
        try {
            if (cls == null) {
                Log.e(TAG, "getResourceId: Class<?> c == null");
                return -1;
            }
            Field declaredField = cls.getDeclaredField(str);
            return declaredField.getInt(declaredField);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            Log.e(TAG, e, "Could not find resource named: %s", str);
            return -1;
        }
    }

    @Nullable
    public static Resources getResources(Context context, @NonNull String str) {
        try {
            return context.getPackageManager().getResourcesForApplication(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static String readRawAsString(Context context, @RawRes int i, @Nullable String str) {
        try {
            InputStream openRawResource = context.getResources().openRawResource(i);
            try {
                byte[] bArr = new byte[openRawResource.available()];
                String str2 = new String(bArr, 0, openRawResource.read(bArr));
                openRawResource.close();
                return str2;
            } finally {
            }
        } catch (IOException unused) {
            return str;
        }
    }
}
