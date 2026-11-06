package com.amazon.alexa.handsfree.protocols;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class InitializerProvider {
    public static final String INITIALIZER_CLASS_NAME = "com.amazon.alexa.voice.handsfree.initialization.InitializationModule";
    private static final Initializer NOOP_INITIALIZER = new Initializer() { // from class: com.amazon.alexa.handsfree.protocols.InitializerProvider.1
        @Override // com.amazon.alexa.handsfree.protocols.Initializer
        public void initialize(@NonNull Context context) {
        }
    };
    private static final String TAG = "InitializerProvider";
    private static Initializer mInitializer;

    private InitializerProvider() {
    }

    public static synchronized Initializer getInitializer() {
        Initializer initializer;
        synchronized (InitializerProvider.class) {
            try {
                if (mInitializer == null) {
                    try {
                        ClassLoader classLoader = Initializer.class.getClassLoader();
                        if (classLoader == null) {
                            throw new IllegalStateException("No classloader!");
                        }
                        Constructor<?> declaredConstructor = classLoader.loadClass(INITIALIZER_CLASS_NAME).getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        mInitializer = (Initializer) declaredConstructor.newInstance(null);
                    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                        Log.w(TAG, "Failed to instantiate initializer, returning no-op");
                        return NOOP_INITIALIZER;
                    }
                }
                initializer = mInitializer;
            } catch (Throwable th) {
                throw th;
            }
        }
        return initializer;
    }
}
