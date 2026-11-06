package com.amazon.alexa.sensor;

import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class SensorUtils {
    private SensorUtils() {
    }

    public static Looper getLooper(@NonNull String str) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return myLooper;
        }
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return handlerThread.getLooper();
    }

    public static boolean isProdRelease() {
        Object obj;
        obj = ComponentRegistry.getInstance().getLazy(EnvironmentService.class).get();
        EnvironmentService environmentService = (EnvironmentService) obj;
        String buildFlavor = environmentService.getBuildFlavor();
        return (buildFlavor.equals("prod") || buildFlavor.equals("prodPhoenix")) && !environmentService.isDebugBuild();
    }
}
