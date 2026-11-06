package com.amazon.alexa.redesign.view.receivers;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/redesign/view/receivers/ShakeEventListener;", "Landroid/hardware/SensorEventListener;", "onShakeEvent", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "acceleration", "", "currentAcceleration", "lastAcceleration", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "onAccuracyChanged", "p0", "Landroid/hardware/Sensor;", "p1", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ShakeEventListener implements SensorEventListener {
    public static final int $stable = 8;
    private float acceleration;
    private float currentAcceleration;
    private float lastAcceleration;

    @NotNull
    private final Function0<Unit> onShakeEvent;

    public ShakeEventListener(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.onShakeEvent = function0;
        this.acceleration = 10.0f;
        this.currentAcceleration = 9.80665f;
        this.lastAcceleration = 9.80665f;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(@NotNull Sensor p0, int p1) {
        p0.getClass();
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(@NotNull SensorEvent event) {
        event.getClass();
        float[] fArr = event.values;
        fArr.getClass();
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        this.lastAcceleration = this.currentAcceleration;
        float f4 = f3 * f3;
        float sqrt = (float) Math.sqrt(f4 + (f2 * f2) + (f * f));
        this.currentAcceleration = sqrt;
        float f5 = (this.acceleration * 0.9f) + (sqrt - this.lastAcceleration);
        this.acceleration = f5;
        if (f5 > 12.0f) {
            this.onShakeEvent.invoke();
        }
    }
}
