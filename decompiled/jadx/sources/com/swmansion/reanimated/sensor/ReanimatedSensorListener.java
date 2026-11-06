package com.swmansion.reanimated.sensor;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.Display;
import com.swmansion.reanimated.nativeProxy.SensorSetter;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ReanimatedSensorListener implements SensorEventListener {
    private final Display display;
    private final double interval;
    private SensorSetter setter;
    private double lastRead = System.currentTimeMillis();
    private float[] rotation = new float[9];
    private float[] orientation = new float[3];
    private float[] quaternion = new float[4];

    public ReanimatedSensorListener(SensorSetter sensorSetter, double d, Display display) {
        this.setter = sensorSetter;
        this.interval = d;
        this.display = display;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        double currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastRead < this.interval) {
        }
        int type = sensorEvent.sensor.getType();
        this.lastRead = currentTimeMillis;
        int rotation = this.display.getRotation();
        int i = rotation != 1 ? rotation != 2 ? rotation != 3 ? 0 : 270 : 180 : 90;
        if (type == 2 || type == 4) {
            float[] fArr = sensorEvent.values;
            this.setter.sensorSetter(new float[]{fArr[0], fArr[1], fArr[2]}, i);
            return;
        }
        switch (type) {
            case 9:
            case 10:
                float[] fArr2 = sensorEvent.values;
                this.setter.sensorSetter(new float[]{-fArr2[0], -fArr2[1], -fArr2[2]}, i);
                break;
            case 11:
                SensorManager.getQuaternionFromVector(this.quaternion, sensorEvent.values);
                SensorManager.getRotationMatrixFromVector(this.rotation, sensorEvent.values);
                SensorManager.getOrientation(this.rotation, this.orientation);
                float[] fArr3 = this.quaternion;
                float f = fArr3[1];
                float f2 = fArr3[3];
                float f3 = -fArr3[2];
                float f4 = fArr3[0];
                float[] fArr4 = this.orientation;
                this.setter.sensorSetter(new float[]{f, f2, f3, f4, -fArr4[0], -fArr4[1], fArr4[2]}, i);
                break;
            default:
                Single$$ExternalSyntheticBUOutline0.m$3("[Reanimated] Unknown sensor type.");
                break;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}
