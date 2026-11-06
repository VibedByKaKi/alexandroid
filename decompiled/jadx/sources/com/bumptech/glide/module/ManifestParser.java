package com.bumptech.glide.module;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes6.dex */
public final class ManifestParser {
    private static final String GLIDE_MODULE_VALUE = "GlideModule";
    private static final String TAG = "ManifestParser";
    private final Context context;

    public ManifestParser(Context context) {
        this.context = context;
    }

    @Nullable
    private ApplicationInfo getOurApplicationInfo() throws PackageManager.NameNotFoundException {
        return this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128);
    }

    private static GlideModule parseModule(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException e) {
                throwInstantiateGlideModuleException(cls, e);
            } catch (InstantiationException e2) {
                throwInstantiateGlideModuleException(cls, e2);
            } catch (NoSuchMethodException e3) {
                throwInstantiateGlideModuleException(cls, e3);
            } catch (InvocationTargetException e4) {
                throwInstantiateGlideModuleException(cls, e4);
            }
            if (obj instanceof GlideModule) {
                return (GlideModule) obj;
            }
            Single$$ExternalSyntheticBUOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(obj, "Expected instanceof GlideModule, but found: "));
            return null;
        } catch (ClassNotFoundException e5) {
            Single$$ExternalSyntheticBUOutline0.m("Unable to find GlideModule implementation", e5);
            return null;
        }
    }

    private static void throwInstantiateGlideModuleException(Class<?> cls, Exception exc) {
        throw new RuntimeException(a$$ExternalSyntheticOutline0.m("Unable to instantiate GlideModule implementation for ", cls), exc);
    }

    public List<GlideModule> parse() {
        Log.isLoggable(TAG, 3);
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo ourApplicationInfo = getOurApplicationInfo();
            if (ourApplicationInfo != null && ourApplicationInfo.metaData != null) {
                if (Log.isLoggable(TAG, 2)) {
                    Objects.toString(ourApplicationInfo.metaData);
                }
                for (String str : ourApplicationInfo.metaData.keySet()) {
                    if (GLIDE_MODULE_VALUE.equals(ourApplicationInfo.metaData.get(str))) {
                        arrayList.add(parseModule(str));
                        Log.isLoggable(TAG, 3);
                    }
                }
                Log.isLoggable(TAG, 3);
                return arrayList;
            }
            Log.isLoggable(TAG, 3);
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            if (Log.isLoggable(TAG, 6)) {
                Log.e(TAG, "Failed to parse glide modules", e);
            }
            return arrayList;
        }
    }
}
