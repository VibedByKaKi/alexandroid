package org.greenrobot.eventbus.android;

import org.greenrobot.eventbus.Logger;
import org.greenrobot.eventbus.MainThreadSupport;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class AndroidComponents {
    private static final AndroidComponents implementation;
    public final MainThreadSupport defaultMainThreadSupport;
    public final Logger logger;

    static {
        implementation = AndroidDependenciesDetector.isAndroidSDKAvailable() ? AndroidDependenciesDetector.instantiateAndroidComponents() : null;
    }

    public AndroidComponents(Logger logger, MainThreadSupport mainThreadSupport) {
        this.logger = logger;
        this.defaultMainThreadSupport = mainThreadSupport;
    }

    public static boolean areAvailable() {
        return implementation != null;
    }

    public static AndroidComponents get() {
        return implementation;
    }
}
