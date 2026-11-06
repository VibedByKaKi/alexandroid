package com.swmansion.reanimated.sensor;

import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.swmansion.reanimated.nativeProxy.SensorSetter;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ReanimatedSensorContainer {
    private final WeakReference<ReactApplicationContext> reactContext;
    private int nextSensorId = 0;
    private final HashMap<Integer, ReanimatedSensor> sensors = new HashMap<>();

    public ReanimatedSensorContainer(WeakReference<ReactApplicationContext> weakReference) {
        this.reactContext = weakReference;
    }

    public int registerSensor(ReanimatedSensorType reanimatedSensorType, int i, SensorSetter sensorSetter) {
        ReanimatedSensor reanimatedSensor = new ReanimatedSensor(this.reactContext, reanimatedSensorType, i, sensorSetter);
        if (!reanimatedSensor.initialize()) {
            return -1;
        }
        int i2 = this.nextSensorId;
        this.nextSensorId = i2 + 1;
        this.sensors.put(Integer.valueOf(i2), reanimatedSensor);
        return i2;
    }

    public void unregisterSensor(int i) {
        ReanimatedSensor reanimatedSensor = this.sensors.get(Integer.valueOf(i));
        if (reanimatedSensor == null) {
            Log.e("Reanimated", "Tried to unregister nonexistent sensor");
        } else {
            reanimatedSensor.cancel();
            this.sensors.remove(Integer.valueOf(i));
        }
    }
}
