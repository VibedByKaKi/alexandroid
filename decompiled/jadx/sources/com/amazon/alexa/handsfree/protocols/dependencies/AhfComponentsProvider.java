package com.amazon.alexa.handsfree.protocols.dependencies;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class AhfComponentsProvider {
    public static final String COMPONENTS_PROVIDER_CLASS_NAME = "com.amazon.alexa.handsfree.adapter.AhfComponentsProviderImpl";
    private static final String TAG = "AhfComponentsProvider";
    private static ClassLoader sClassLoader = AhfComponentsProvider.class.getClassLoader();
    private static volatile AhfComponentsProvider sComponentsProvider = null;

    public static <T extends AhfComponentProtocol> T getComponent(Context context, Class<T> cls) {
        return (T) getInstance(context).getComponent(cls);
    }

    public static AhfComponentsProvider getInstance(Context context) {
        AhfComponentsProvider ahfComponentsProvider;
        AhfComponentsProvider ahfComponentsProvider2 = sComponentsProvider;
        if (ahfComponentsProvider2 != null) {
            return ahfComponentsProvider2;
        }
        synchronized (AhfComponentsProvider.class) {
            try {
                ahfComponentsProvider = sComponentsProvider;
                if (ahfComponentsProvider == null) {
                    try {
                        Log.d(TAG, "getInstance: Load com.amazon.alexa.handsfree.adapter.AhfComponentsProviderImpl");
                        ClassLoader classLoader = sClassLoader;
                        if (classLoader == null) {
                            throw new IllegalStateException("No classloader!");
                        }
                        Constructor<?> declaredConstructor = classLoader.loadClass(COMPONENTS_PROVIDER_CLASS_NAME).getDeclaredConstructor(Context.class);
                        declaredConstructor.setAccessible(true);
                        ahfComponentsProvider = (AhfComponentsProvider) declaredConstructor.newInstance(context.getApplicationContext());
                        sComponentsProvider = ahfComponentsProvider;
                    } catch (Exception e) {
                        throw new RuntimeException(TAG + ": Failed to create components provider", e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ahfComponentsProvider;
    }

    @VisibleForTesting
    public static void resetForTest() {
        sClassLoader = AhfComponentsProvider.class.getClassLoader();
        sComponentsProvider = null;
    }

    @VisibleForTesting
    public static void setClassLoader(ClassLoader classLoader) {
        sClassLoader = classLoader;
    }

    @VisibleForTesting
    public static void setComponentsProviderForTest(AhfComponentsProvider ahfComponentsProvider) {
        sComponentsProvider = ahfComponentsProvider;
    }

    public abstract <T extends AhfComponentProtocol> T getComponent(Class<T> cls);
}
