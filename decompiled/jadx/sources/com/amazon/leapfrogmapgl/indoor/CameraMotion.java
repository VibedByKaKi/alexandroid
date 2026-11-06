package com.amazon.leapfrogmapgl.indoor;

import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/amazon/leapfrogmapgl/indoor/CameraMotion;", "", "<init>", "()V", VoiceBridgePayloadUtil.PayloadCommand.PREVIOUS, "", "hasPrevious", "", "touchActive", "getTouchActive", "()Z", "setTouchActive", "(Z)V", "update", "projection", "reset", "", "Companion", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CameraMotion {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int MATRIX_SIZE = 16;
    private boolean hasPrevious;

    @NotNull
    private final double[] previous = new double[16];
    private volatile boolean touchActive;

    public final boolean getTouchActive() {
        return this.touchActive;
    }

    public final void reset() {
        this.hasPrevious = false;
    }

    public final void setTouchActive(boolean z) {
        this.touchActive = z;
    }

    public final boolean update(@NotNull double[] projection) {
        projection.getClass();
        boolean z = (this.hasPrevious && Arrays.equals(projection, this.previous)) ? false : true;
        boolean z2 = this.hasPrevious && z;
        if (z) {
            ArraysKt___ArraysJvmKt.copyInto$default(projection, this.previous, 0, 0, 16, 6, (Object) null);
            this.hasPrevious = true;
        }
        return z2 || this.touchActive;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/amazon/leapfrogmapgl/indoor/CameraMotion$Companion;", "", "<init>", "()V", "MATRIX_SIZE", "", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
