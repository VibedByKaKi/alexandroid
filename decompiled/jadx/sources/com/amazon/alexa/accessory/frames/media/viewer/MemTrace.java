package com.amazon.alexa.accessory.frames.media.viewer;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.alexa.accessory.frames.utils.Log;
import com.dee.app.contacts.common.constants.Constants;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u0005H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/viewer/MemTrace;", "", "<init>", "()V", Constants.LOG_TAG, "", "MB", "", "NEAR_OOM_PERCENT", "", "heap", "log", "", TypedValues.CycleType.S_WAVE_PHASE, "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MemTrace {

    @NotNull
    public static final MemTrace INSTANCE = new MemTrace();
    private static final long MB = 1048576;
    private static final int NEAR_OOM_PERCENT = 85;

    @NotNull
    public static final String TAG = "MemTrace";

    private MemTrace() {
    }

    @JvmStatic
    @NotNull
    public static final String heap() {
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = (runtime.totalMemory() - runtime.freeMemory()) / 1048576;
        long maxMemory = runtime.maxMemory() / 1048576;
        long j = maxMemory != 0 ? (100 * freeMemory) / maxMemory : 0L;
        StringBuilder m = a$$ExternalSyntheticOutline0.m("heapUsed=", freeMemory, "MB / heapMax=");
        m.append(maxMemory);
        return a$$ExternalSyntheticOutline0.m(j, "MB (", "%)", m);
    }

    @JvmStatic
    public static final void log(@NotNull String phase) {
        phase.getClass();
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = (runtime.totalMemory() - runtime.freeMemory()) / 1048576;
        long maxMemory = runtime.maxMemory() / 1048576;
        if ((maxMemory != 0 ? (freeMemory * 100) / maxMemory : 0L) >= 85) {
            Log.w(TAG, "[%s] NEAR-OOM %s", phase, heap());
        } else {
            Log.i(TAG, "[%s] %s", phase, heap());
        }
    }
}
