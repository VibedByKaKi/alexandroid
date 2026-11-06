package com.amazon.alexa.ra.core.ui.custom;

import android.os.VibrationEffect;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/HapticEffect;", "", "vibrationEffect", "Landroid/os/VibrationEffect;", "<init>", "(Landroid/os/VibrationEffect;)V", "getVibrationEffect", "()Landroid/os/VibrationEffect;", "Light", "Medium", "LightMediumCombo", "Lcom/amazon/alexa/ra/core/ui/custom/HapticEffect$Light;", "Lcom/amazon/alexa/ra/core/ui/custom/HapticEffect$LightMediumCombo;", "Lcom/amazon/alexa/ra/core/ui/custom/HapticEffect$Medium;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class HapticEffect {
    public static final int $stable = 8;

    @NotNull
    private final VibrationEffect vibrationEffect;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/HapticEffect$Light;", "Lcom/amazon/alexa/ra/core/ui/custom/HapticEffect;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Light extends HapticEffect {
        public static final int $stable = 0;

        @NotNull
        public static final Light INSTANCE = new Light();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private Light() {
            /*
                r3 = this;
                r0 = 10
                r2 = 50
                android.os.VibrationEffect r0 = android.os.VibrationEffect.createOneShot(r0, r2)
                r0.getClass()
                r1 = 0
                r3.<init>(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.ra.core.ui.custom.HapticEffect.Light.<init>():void");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/HapticEffect$LightMediumCombo;", "Lcom/amazon/alexa/ra/core/ui/custom/HapticEffect;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LightMediumCombo extends HapticEffect {
        public static final int $stable = 0;

        @NotNull
        public static final LightMediumCombo INSTANCE = new LightMediumCombo();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private LightMediumCombo() {
            /*
                r4 = this;
                r0 = 3
                long[] r0 = new long[r0]
                r0 = {x001c: FILL_ARRAY_DATA , data: [10, 50, 20} // fill-array
                r1 = 0
                r2 = 150(0x96, float:2.1E-43)
                r3 = 50
                int[] r1 = new int[]{r3, r1, r2}
                r2 = -1
                android.os.VibrationEffect r0 = android.os.VibrationEffect.createWaveform(r0, r1, r2)
                r0.getClass()
                r1 = 0
                r4.<init>(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.ra.core.ui.custom.HapticEffect.LightMediumCombo.<init>():void");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/HapticEffect$Medium;", "Lcom/amazon/alexa/ra/core/ui/custom/HapticEffect;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Medium extends HapticEffect {
        public static final int $stable = 0;

        @NotNull
        public static final Medium INSTANCE = new Medium();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private Medium() {
            /*
                r3 = this;
                r0 = 20
                r2 = 150(0x96, float:2.1E-43)
                android.os.VibrationEffect r0 = android.os.VibrationEffect.createOneShot(r0, r2)
                r0.getClass()
                r1 = 0
                r3.<init>(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.ra.core.ui.custom.HapticEffect.Medium.<init>():void");
        }
    }

    private HapticEffect(VibrationEffect vibrationEffect) {
        this.vibrationEffect = vibrationEffect;
    }

    @NotNull
    public final VibrationEffect getVibrationEffect() {
        return this.vibrationEffect;
    }

    public /* synthetic */ HapticEffect(VibrationEffect vibrationEffect, DefaultConstructorMarker defaultConstructorMarker) {
        this(vibrationEffect);
    }
}
